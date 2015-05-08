package com.huibao.esb.insureservice.client.tianan.fake;

public class IInsuranceExtension {
	
	/**
	 * 属性:返回数据总条数
	 */
	private String maxRecords;
	/**
	 * 属性:翻页标识
	 */
	private String pageFlag;
	/**
	 * 属性:游标位置
	 */
	private String rowNumStart;
	/**
	 * 属性:每页行数
	 */
	private String pageRowNum;
	/**
	 * 属性:排序标志
	 */
	private String orderFlag;
	/**
	 * 属性:排序字段
	 */
	private String orderField;
	public String getMaxRecords() {
		return maxRecords;
	}
	public void setMaxRecords(String maxRecords) {
		this.maxRecords = maxRecords;
	}
	public String getPageFlag() {
		return pageFlag;
	}
	public void setPageFlag(String pageFlag) {
		this.pageFlag = pageFlag;
	}
	public String getRowNumStart() {
		return rowNumStart;
	}
	public void setRowNumStart(String rowNumStart) {
		this.rowNumStart = rowNumStart;
	}
	public String getPageRowNum() {
		return pageRowNum;
	}
	public void setPageRowNum(String pageRowNum) {
		this.pageRowNum = pageRowNum;
	}
	public String getOrderFlag() {
		return orderFlag;
	}
	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}
	public String getOrderField() {
		return orderField;
	}
	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}
	

}
