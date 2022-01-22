package application.service;

import application.service.impl.ApplianceServiceImpl;

/**
 * ServiceFactory class
 */
public final class ServiceFactory {
	/**
	 * Service factory instance
	 */
	private static final ServiceFactory instance = new ServiceFactory();

	/**
	 * Constructor
	 */
	private ServiceFactory() {
	}

	/**
	 * Application service instance getter
	 *
	 * @return ApplianceService - application service instance
	 */
	public ApplianceService getApplianceService() {
		return new ApplianceServiceImpl();
	}

	/**
	 * Service factory instance getter
	 *
	 * @return ApplianceService - service factory instance
	 */
	public static ServiceFactory getInstance() {
		return instance;
	}
}
