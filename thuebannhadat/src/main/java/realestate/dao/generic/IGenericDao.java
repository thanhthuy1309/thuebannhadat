package realestate.dao.generic;

import java.util.List;

public interface IGenericDao {

	<T> List<T> findAll(Class<T> clazz);

	<T> List<T> findAllByStatus(Integer status, Class<T> clazz);

	<T> T saveOrUpdate(T entity);

	<T> boolean persist(T entity);

	<T> T merge(T entity);

	<T> Integer save(T entity);

	<T> boolean update(T entity);

	<T> boolean delete(T entity);
}
