package ro.leasing.crosscutting;

import ro.leasing.service.DaoManager;

public class CtxHolder {
	private DaoManager daoManager;

	public DaoManager getDaoManager() {
		return daoManager;
	}

	public void setDaoManager(DaoManager daoManager) {
		this.daoManager = daoManager;
	}
	
	
}
