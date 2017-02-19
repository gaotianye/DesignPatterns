package cn.celloud.designPatterns.facade.example2;

public class ConfigModel {
	/**
	 * 是否生成 表现层，默认是true
	 */
	private boolean needGenPresentation = true;
	
	/**
	 * 是否生成逻辑层，默认是true
	 */
	private boolean needGenBusiness = true;
	
	/**
	 * 是否生成DAO层，more是true
	 */
	private boolean needGenDAO = true;

	public boolean isNeedGenPresentation() {
		return needGenPresentation;
	}

	public void setNeedGenPresentation(boolean needGenPresentation) {
		this.needGenPresentation = needGenPresentation;
	}

	public boolean isNeedGenBusiness() {
		return needGenBusiness;
	}

	public void setNeedGenBusiness(boolean needGenBusiness) {
		this.needGenBusiness = needGenBusiness;
	}

	public boolean isNeedGenDAO() {
		return needGenDAO;
	}

	public void setNeedGenDAO(boolean needGenDAO) {
		this.needGenDAO = needGenDAO;
	}
}
