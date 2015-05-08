package com.huibao.esb.insureservice.client.tianan.fake;

public class TXInsuranceResponse {
	
	/**
	 * ����:������ˮ��
	 */
	private String transRefGUID;
	/**
	 * ����:��������
	 */
	private String transType;
	/**
	 * ����:��������
	 */
	private String transExeDate;
	/**
	 * ����:����ʱ��
	 */
	private String transExeTime;
	/**
	 * ����:�ӽ������
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
