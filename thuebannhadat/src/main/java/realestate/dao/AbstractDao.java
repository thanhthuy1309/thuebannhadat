package realestate.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;

/**
 * @author : DUNGPT
 * @PG_ID : AbstractDao
 * @createDate : 20.10.2016
 */

@Repository
public interface AbstractDao<T, PK extends Serializable> {

  public T findByPK(PK id) throws HibernateException;

  public List<T> findAll() throws HibernateException;

  public T saveOrUpdate(T entity) throws HibernateException;

  public void persist(T entity) throws HibernateException;

  public T merge(T entity) throws HibernateException;

  public void deleteAll() throws HibernateException;

  public void deleteById(int id) throws HibernateException;

  public void delete(T entity) throws HibernateException;

  public Integer save(T entity) throws HibernateException;

  public void update(T entity) throws HibernateException;

}
