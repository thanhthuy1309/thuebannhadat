package realestate.dao;

import java.util.List;
import java.util.Map;

/**
 * @author : DUNGPT
 * @PG_ID : AbstractDao
 * @createDate : 20.10.2016
 */

public interface AbstractDao {

	<T> List<T> findAll(Class<T> clazz);

	<T> List<T> findAllByStatus(Integer status, Class<T> clazz);

	<T> List<T> findAllByParameter(Class<T> clazz, Map<String, Object> parameters, String queryName);

	<T> T saveOrUpdate(T entity);

	<T> boolean persist(T entity);

	<T> T merge(T entity);

	<T> Integer save(T entity);

	<T> boolean update(T entity);

	<T> boolean deleteAll(Class<T> clazz);

	<T> boolean delete(T entity);

}
