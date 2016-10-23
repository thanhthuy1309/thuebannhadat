package realestate.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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
@SuppressWarnings({ "unchecked", "rawtypes" })
public abstract class AbstractDaoImpl<T, PK extends Serializable> implements AbstractDao<T, PK> {

  /** Init logger. */
  private Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

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

  /**
   * Lay thong tin table T dua vao key
   * 
   * @param PK
   *          : key
   * 
   * @return T
   */
  public T findByPK(PK id) {
    try {
      T value = (T) getSession().get(clazz, id);
      if (value == null) {
        return null;
      }

      if (value instanceof HibernateProxy) {
        Hibernate.initialize(value);
        value = (T) ((HibernateProxy) value).getHibernateLazyInitializer().getImplementation();
      }
      return value;
    } catch (HibernateException ex) {

    }
    return null;
  }

  /**
   * Lay tat ca thong tin table T
   * 
   * @return List<T>
   */
  public List<T> findAll() {
    try {
      return getSession().createQuery("from " + clazz.getName()).list();
    } catch (HibernateException ex) {

    }
    return null;
  }

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   * 
   * @param phoneNumber
   * 
   * @return NguoiDung
   */
  public List<T> findAllByStatus(Integer status) {
    try {
      StringBuilder sql = new StringBuilder();
      sql.append(" from ");
      sql.append(clazz.getName());
      sql.append(" where trangThai =:trangThai");

      Query query = getSession().createQuery(sql.toString());
      query.setParameter("trangThai", status);
      return query.list();
    } catch (HibernateException ex) {

    }
    return null;
  }

  /**
   * insert hoac update table T
   * 
   * @param T
   * 
   * @return T
   */
  public T saveOrUpdate(T entity) {
    try {
      getSession().saveOrUpdate(entity);
      return entity;
    } catch (HibernateException ex) {

    }

    return null;
  }

  /**
   * insert table T
   * 
   * @param T
   * 
   * @return true : thanh cong. false : that bai
   */
  public boolean persist(T entity) {
    try {
      getSession().persist(entity);
      return true;
    } catch (HibernateException ex) {

    }

    return false;
  }

  /**
   * update table T
   * 
   * @param T
   * 
   * @return T
   */
  public T merge(T entity) {
    try {
      return (T) getSession().merge(entity);
    } catch (HibernateException ex) {

    }
    return null;
  }

  /**
   * delete tat ca data cua table T
   * 
   * 
   * @return true : thanh cong. false : that bai
   */
  public boolean deleteAll() {
    try {
      String hql = "DELETE FROM " + clazz.getName();
      Query query = getSession().createQuery(hql);
      return (query.executeUpdate() > 0);
    } catch (HibernateException ex) {

    }
    return false;
  }

  /**
   * delete entity T
   * 
   * @return true : thanh cong. false : that bai
   */
  public boolean delete(T entity) {
    try {
      getSession().delete(entity);
      return true;
    } catch (HibernateException ex) {

    }
    return false;
  }

  /**
   * insert entity T
   * 
   * @return Integer
   */
  public Integer save(T entity) {

    try {
      return (Integer) getSession().save(entity);
    } catch (HibernateException ex) {

    }
    return null;
  }

  /**
   * update entity T
   * 
   * @return true : thanh cong. false : that bai
   */
  public boolean update(T entity) {

    try {
      getSession().update(entity);
      return true;
    } catch (HibernateException ex) {

    }
    return false;
  }
}
