package com.huibao.esb.insureservice.client.tianan.fake;

public class TXInsuranceResponse {
	
	/**
	 * 属性:交易流水号
	 */
	private String transRefGUID;
	/**
	 * 属性:交易类型
	 */
	private String transType;
	/**
	 * 属性:交易日期
	 */
	private String transExeDate;
	/**
	 * 属性:交易时间
	 */
	private String transExeTime;
	/**
	 * 属性:子交易序号
	 */
	private String transSubType;
	
	private TransResult transResult;
	
	private OInsuranceExtension oInsuranceExtension;

	public OInsuranceExtension getOInsuranceExtension() {
		return oInsuranceExtension;
	}

	public void setOInsuranceExtension(OInsuranceExtension insuranceExtension) {
		oInsuranceExtension = insuranceExtension;
	}

	public String getTransRefGUID() {
		return transRefGUID;
	}

	public void setTransRefGUID(String transRefGUID) {
		this.transRefGUID = transRefGUID;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransExeDate() {
		return transExeDate;
	}

	public void setTransExeDate(String transExeDate) {
		this.transExeDate = transExeDate;
	}

	public String getTransExeTime() {
		return transExeTime;
	}

	public void setTransExeTime(String transExeTime) {
		this.transExeTime = transExeTime;
	}

	public String getTransSubType() {
		return transSubType;
	}

	public void setTransSubType(String transSubType) {
		this.transSubType = transSubType;
	}

	public TransResult getTransResult() {
		return transResult;
	}

	public void setTransResult(TransResult transResult) {
		this.transResult = transResult;
	}

}
