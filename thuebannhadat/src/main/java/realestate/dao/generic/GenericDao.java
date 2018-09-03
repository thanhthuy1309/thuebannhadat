package realestate.dao.generic;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import realestate.utils.SQLUtils;

@Repository
public class GenericDao implements IGenericDao {

	/** Init logger. */
	private Logger LOGGER = Logger.getLogger(GenericDao.class);

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findAll(Class<T> clazz) {
		try {
			return getSession().createQuery("from " + clazz.getName()).list();
		} catch (HibernateException ex) {
			LOGGER.error("#findAll_ error: " + ex.getMessage());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findAllByStatus(Integer status, Class<T> clazz) {
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(" from ");
			sql.append(clazz.getName());
			sql.append(" where status =:status");

			Query query = getSession().createQuery(sql.toString());
			query.setParameter(SQLUtils.STATUS, status);
			return query.list();
		} catch (HibernateException ex) {
			LOGGER.error("#findAllByStatus_error: " + ex.getMessage());
		}
		return null;
	}

	@Override
	public <T> T saveOrUpdate(T entity) {
		try {
			getSession().saveOrUpdate(entity);
			return entity;
		} catch (HibernateException ex) {
			LOGGER.error("#saveOrUpdate_error: " + ex.getMessage());
		}

		return null;
	}

	@Override
	public <T> boolean persist(T entity) {
		try {
			getSession().persist(entity);
			return true;
		} catch (HibernateException ex) {
			LOGGER.error("#persist_error: " + ex.getMessage());
		}

		return false;
	}

	@Override
	public <T> T merge(T entity) {
		try {
			return (T) getSession().merge(entity);
		} catch (HibernateException ex) {
			LOGGER.error("#merge_error: " + ex.getMessage());
		}
		return null;
	}

	@Override
	public <T> Integer save(T entity) {
		try {
			return (Integer) getSession().save(entity);
		} catch (HibernateException ex) {

		}
		return null;
	}

	@Override
	public <T> boolean update(T entity) {
		try {
			getSession().delete(entity);
			return true;
		} catch (HibernateException ex) {

		}
		return false;
	}

	@Override
	public <T> boolean delete(T entity) {
		try {
			getSession().delete(entity);
			return true;
		} catch (HibernateException ex) {

		}
		return false;
	}

}
