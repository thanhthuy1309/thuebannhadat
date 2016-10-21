package realestate.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import realestate.dao.AbstractDao;

/**
 * @author : DUNGPT
 * @PG_ID : AbstractDao
 * @createDate : 20.10.2016
 */

@Repository
@SuppressWarnings({ "rawtypes", "unchecked" })
public abstract class AbstractDaoImpl<T, PK extends Serializable> implements AbstractDao<T, PK> {

  protected Class<? extends T> clazz;

  @Autowired
  private SessionFactory sessionFactory;

  public AbstractDaoImpl() {
    Type t = getClass().getGenericSuperclass();
    ParameterizedType pt = (ParameterizedType) t;
    clazz = (Class) pt.getActualTypeArguments()[0];
  }

  protected Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  public T findByPK(PK id) throws HibernateException {
    T value = (T) getSession().get(clazz, id);
    if (value == null) {
      return null;
    }

    if (value instanceof HibernateProxy) {
      Hibernate.initialize(value);
      value = (T) ((HibernateProxy) value).getHibernateLazyInitializer().getImplementation();
    }
    return value;

  }

  public List<T> findAll() throws HibernateException {
    return getSession().createQuery("from " + clazz.getName()).list();
  }

  public T saveOrUpdate(T entity) throws HibernateException {
    getSession().saveOrUpdate(entity);
    return entity;
  }

  public void persist(T entity) {
    getSession().persist(entity);
  }

  public T merge(T entity) throws HibernateException {
    return (T) getSession().merge(entity);
  }

  public void deleteAll() throws HibernateException {
    String hql = "DELETE FROM " + clazz.getName();
    getSession().createQuery(hql).executeUpdate();
  }

  public void deleteById(int id) throws HibernateException {
    String hql = "DELETE FROM " + clazz.getName() + " WHERE id= :id";
    getSession().createQuery(hql).setParameter("id", id).executeUpdate();
  }

  public void delete(T entity) throws HibernateException {
    getSession().delete(entity);
  }

  public Integer save(T entity) {
    return (Integer) getSession().save(entity);

  }

  public void update(T entity) {
    getSession().update(entity);
  }
}
