package realestate.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author : DUNGPT
 * @PG_ID : AbstractService
 * @createDate : 21.10.2016
 */

public interface AbstractService<T, PK extends Serializable> {

  public T findByPK(PK id);

  public List<T> findAll();

  public List<T> findAllByStatusOff();

  public T saveOrUpdate(T entity);

  public boolean persist(T entity);

  public T merge(T entity);

  public Integer save(T entity);

  public boolean update(T entity);

  public boolean deleteAll();

  public boolean delete(T entity);

}
