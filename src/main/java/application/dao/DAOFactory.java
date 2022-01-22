package application.dao;

import application.dao.impl.ApplianceDAOImpl;

/**
 * DAOFactory class
 */
public final class DAOFactory {
	/**
	 * DAO factory instance
	 */
	private static final DAOFactory instance = new DAOFactory();

	/**
	 * Constructor
	 */
	private DAOFactory() {
	}

	/**
	 * Application DAO implementation instance getter
	 *
	 * @return ApplianceDAO - application DAO implementation instance
	 */
	public ApplianceDAO getApplianceDAO() {
		return new ApplianceDAOImpl();
	}

	/**
	 * DAO factory instance getter
	 *
	 * @return DAOFactory - DAO factory instance
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}
