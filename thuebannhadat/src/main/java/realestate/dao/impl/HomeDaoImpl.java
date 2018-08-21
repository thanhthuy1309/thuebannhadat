package realestate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import realestate.dao.HomeDao;
import realestate.entity.City;
import realestate.entity.User;

/**
 * @author : ThuyTran
 * @PG_ID : HomeDaoImpl
 * @createDate : 20.08.2018
 */
@Repository
public class HomeDaoImpl extends AbstractDaoImpl<User, Integer> implements HomeDao {

	/** Init logger. */
	private Logger LOGGER = Logger.getLogger(HomeDaoImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<City> getAllCity() {
		List<City> result = new ArrayList<>();
		Session session = getSession();

		// Query get all city
		Query query = session.getNamedQuery("HomeDao.getAllCity");

		// Set parameter
		query.setInteger("status", 1);

		try {
			result = query.list();
			LOGGER.info("#getAllCity: successfull");
		} catch (Exception e) {
			LOGGER.error("#getAllCity_Error: " + e.getMessage());
		}
		return result;
	}

}
