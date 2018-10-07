package realestate.dao.impl;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import realestate.dao.AbstractDao;
import realestate.utils.SqlConstants;

/**
 * @author : DUNGPT
 * @PG_ID : AbstractDao
 * @createDate : 20.10.2016
 */

@Repository
public abstract class AbstractDaoImpl implements AbstractDao {

	/** Init logger. */
	private Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	private Query query;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	// /**
	// * Lay thong tin table T dua vao key
	// *
	// * @param PK
	// * : key
	// *
	// * @return T
	// */
	// public T findByPK(PK id) {
	// try {
	// T value = (T) getSession().get(clazz, id);
	// if (value == null) {
	// return null;
	// }
	//
	// if (value instanceof HibernateProxy) {
	// Hibernate.initialize(value);
	// value = (T) ((HibernateProxy)
	// value).getHibernateLazyInitializer().getImplementation();
	// }
	// return value;
	// } catch (HibernateException ex) {
	// LOGGER.error("#findByPK_ error: " + ex.getMessage());
	// }
	// return null;
	// }

	/**
	 * Lay tat ca thong tin table T
	 * 
	 * @return List<T>
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> clazz) {
		try {
			return getSession().createQuery("from " + clazz.getName()).list();
		} catch (HibernateException ex) {
			LOGGER.error("#findAll_ error: " + ex.getMessage());
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
	@SuppressWarnings("unchecked")
	public <T> List<T> findAllByStatus(Integer status, Class<T> clazz) {
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(" from ");
			sql.append(clazz.getName());
			sql.append(" where status =:status");

			Query query = getSession().createQuery(sql.toString());
			query.setParameter(SqlConstants.STATUS, status);
			return query.list();
		} catch (HibernateException ex) {
			LOGGER.error("#findAllByStatus_error: " + ex.getMessage());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAllByParameter(Class<T> clazz, Map<String, Object> parameters, String queryName,
			Integer limit, Integer offset) {
		try {
			query = getSession().getNamedQuery(queryName);

			// Set parameter
			populateParameter(parameters);

			// set limit, offset
			setLimitParameter(limit, offset);

			return query.list();
		} catch (HibernateException ex) {
			LOGGER.error("#findAllByParameter_error: " + ex.getMessage());
		} catch (SQLException e) {
			LOGGER.error("#findAllByParameter_error: " + e.getMessage());
		}
		return null;
	}

	/**
	 * Sets the limit parameter.
	 *
	 * @param limit the limit
	 * @param offset the offset
	 */
	private void setLimitParameter(Integer limit, Integer offset) {
		if (Objects.nonNull(limit) && limit > 0) {
			query.setMaxResults(limit);
		}

		if (Objects.nonNull(offset)) {
			query.setFirstResult(offset);
		}
	}

	/**
	 * Populates value of parameters into query.
	 * 
	 * @param parameters
	 *            a {@link Map} of parameter and its value.
	 * 
	 * @throws SQLException
	 */
	private void populateParameter(Map<String, Object> parameters) throws SQLException {

		if (Objects.isNull(parameters) || parameters.isEmpty()) {
			return;
		}

		for (Map.Entry<String, Object> entry : parameters.entrySet()) {
			int type = getTypeOfValue(entry.getValue());
			switch (type) {
			case SqlConstants.TYPES_STRING:
				setString(entry.getKey(), (String) entry.getValue());
				break;
			case SqlConstants.TYPES_INT:
				setInt(entry.getKey(), (Integer) entry.getValue());
				break;
			case SqlConstants.TYPES_LONG:
				setLong(entry.getKey(), (Long) entry.getValue());
				break;
			case SqlConstants.TYPES_FLOAT:
				setFloat(entry.getKey(), (Float) entry.getValue());
				break;
			case SqlConstants.TYPES_DOUBLE:
				setDouble(entry.getKey(), (Double) entry.getValue());
				break;
			case SqlConstants.TYPES_BOOLEAN:
				setBoolean(entry.getKey(), (Boolean) entry.getValue());
				break;
			case SqlConstants.TYPES_DATE:
				setDate(entry.getKey(), (Date) entry.getValue());
				break;
			case SqlConstants.TYPES_TIMESTAMP:
				setTimestamp(entry.getKey(), (Timestamp) entry.getValue());
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Detects type of object.
	 * 
	 * @param object
	 *            the object get type of value
	 * @return type the type of an object.
	 */
	private final int getTypeOfValue(Object object) {
		if (Objects.isNull(object)) {
			return SqlConstants.TYPES_NULL;
		}

		if (object.getClass().equals(Integer.class)) {
			return SqlConstants.TYPES_INT;
		} else if (object.getClass().equals(String.class)) {
			return SqlConstants.TYPES_STRING;
		} else if (object.getClass().equals(Long.class)) {
			return SqlConstants.TYPES_LONG;
		} else if (object.getClass().equals(Double.class)) {
			return SqlConstants.TYPES_DOUBLE;
		} else if (object.getClass().equals(Date.class)) {
			return SqlConstants.TYPES_DATE;
		} else if (object.getClass().equals(Time.class)) {
			return SqlConstants.TYPES_TIME;
		} else if (object.getClass().equals(Float.class)) {
			return SqlConstants.TYPES_FLOAT;
		} else if (object.getClass().equals(Boolean.class)) {
			return SqlConstants.TYPES_BOOLEAN;
		} else if (object.getClass().equals(Byte.class)) {
			return SqlConstants.TYPES_BYTE;
		} else if (object.getClass().equals(Short.class)) {
			return SqlConstants.TYPES_SHORT;
		} else if (object.getClass().equals(Timestamp.class)) {
			return SqlConstants.TYPES_TIMESTAMP;
		} else if (object.getClass().equals(Clob.class)) {
			return SqlConstants.TYPES_CLOB;
		} else if (object.getClass().equals(NClob.class)) {
			return SqlConstants.TYPES_CLOB;
		} else if (object.getClass().equals(Blob.class)) {
			return SqlConstants.TYPES_BLOB;
		}
		return SqlConstants.TYPES_NULL;
	}

	/**
	 * Sets a parameter.
	 * 
	 * @param name
	 * @param value
	 * @throws SQLException
	 *             if an error occurred
	 * @see PreparedStatement#setString(int, java.lang.String)
	 */
	private void setString(String name, String value) throws SQLException {
		query.setString(name, value);
	}

	/**
	 * Sets a parameter.
	 * 
	 * @param name
	 * @param value
	 * @throws SQLException
	 *             if an error occurred
	 * @see PreparedStatement#setInt(int, int)
	 */
	private void setInt(String name, Integer value) throws SQLException {
		query.setInteger(name, value.intValue());
	}

	/**
	 * Sets a parameter.
	 * 
	 * @param name
	 * @param value
	 * @throws SQLException
	 *             if an error occurred
	 * @see PreparedStatement#setInt(int, long)
	 */
	private void setLong(String name, Long value) throws SQLException {
		query.setLong(name, value.longValue());
	}

	/**
	 * Sets a parameter.
	 * 
	 * @param name
	 * @param value
	 * @throws SQLException
	 *             if an error occurred
	 * @see PreparedStatement#setInt(int, double)
	 */
	private void setFloat(String name, Float value) throws SQLException {
		query.setFloat(name, value.floatValue());
	}

	/**
	 * Sets a parameter.
	 * 
	 * @param name
	 * @param value
	 * @throws SQLException
	 *             if an error occurred
	 * @see PreparedStatement#setInt(int, double)
	 */
	private void setDouble(String name, Double value) throws SQLException {
		query.setDouble(name, value.doubleValue());
	}

	/**
	 * Sets a parameter.
	 * 
	 * @param name
	 * @param value
	 * @throws SQLException
	 *             if an error occurred
	 * @see PreparedStatement#setInt(int, double)
	 */
	private void setBoolean(String name, Boolean value) throws SQLException {
		query.setBoolean(name, value.booleanValue());
	}

	/**
	 * Sets a parameter.
	 * 
	 * @param name
	 * @param value
	 * @throws SQLException
	 *             if an error occurred
	 * @throws IllegalArgumentException
	 *             if the parameter does not exist
	 * @see PreparedStatement#setTimestamp(int, java.sql.Timestamp)
	 */
	private void setDate(String name, Date value) throws SQLException {
		query.setDate(name, value);
	}

	/**
	 * Sets a parameter.
	 * 
	 * @param name
	 * @param value
	 * @throws SQLException
	 *             if an error occurred
	 * @throws IllegalArgumentException
	 *             if the parameter does not exist
	 * @see PreparedStatement#setTimestamp(int, java.sql.Timestamp)
	 */
	private void setTimestamp(String name, Timestamp value) throws SQLException {
		query.setTimestamp(name, value);
	}

	/**
	 * insert hoac update table T
	 * 
	 * @param T
	 * 
	 * @return T
	 */
	public <T> T saveOrUpdate(T entity) {
		try {
			getSession().saveOrUpdate(entity);
			return entity;
		} catch (HibernateException ex) {
			LOGGER.error("#saveOrUpdate_error: " + ex.getMessage());
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
	public <T> boolean persist(T entity) {
		try {
			getSession().persist(entity);
			return true;
		} catch (HibernateException ex) {
			LOGGER.error("#persist_error: " + ex.getMessage());
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
	@SuppressWarnings("unchecked")
	public <T> T merge(T entity) {
		try {
			return (T) getSession().merge(entity);
		} catch (HibernateException ex) {
			LOGGER.error("#merge_error: " + ex.getMessage());
		}
		return null;
	}

	/**
	 * delete tat ca data cua table T
	 * 
	 * 
	 * @return true : thanh cong. false : that bai
	 */
	public <T> boolean deleteAll(Class<T> clazz) {
		try {
			String hql = "DELETE FROM " + clazz.getName();
			Query query = getSession().createQuery(hql);
			return (query.executeUpdate() > 0);
		} catch (HibernateException ex) {
			LOGGER.error("#deleteAll_error: " + ex.getMessage());
		}
		return false;
	}

	/**
	 * delete entity T
	 * 
	 * @return true : thanh cong. false : that bai
	 */
	public <T> boolean delete(T entity) {
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
	public <T> Integer save(T entity) {

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
	public <T> boolean update(T entity) {

		try {
			getSession().update(entity);
			return true;
		} catch (HibernateException ex) {

		}
		return false;
	}
}
