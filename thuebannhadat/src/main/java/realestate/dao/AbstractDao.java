package realestate.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author : DUNGPT
 * @PG_ID : AbstractDao
 * @createDate : 20.10.2016
 */

public interface AbstractDao<T, PK extends Serializable> {

  public T findByPK(PK id);

  public List<T> findAll();

  public List<T> findAllByStatus(Integer status);

  public T saveOrUpdate(T entity);

  public boolean persist(T entity);

  public T merge(T entity);

  public Integer save(T entity);

  public boolean update(T entity);

  public boolean deleteAll();

  public boolean delete(T entity);

}
