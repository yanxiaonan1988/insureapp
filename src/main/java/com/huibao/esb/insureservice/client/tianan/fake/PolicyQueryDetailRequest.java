package com.huibao.esb.insureservice.client.tianan.fake;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="PolicyQueryDetailRequest")
@XmlType(propOrder={"tXInsuranceRequest","tXInsuranceRequestExtension","requestType","policyNo",
		"riskCode","insuredName","insIdentifyType","insIdentifyNumber"})
public class PolicyQueryDetailRequest {
	
	private TXInsuranceRequest tXInsuranceRequest;
	
	private TXInsuranceRequestExtension tXInsuranceRequestExtension;
	
	/**
	 * ����:��������
	 */
	private String requestType;  //1--����
	/**
	 * ����:������
	 */
	private String policyNo;
	/**
	 * ����:����
	 */
	private String riskCode;
	/**
	 * ����:������������
	 */
	private String insuredName;
	/**
	 * ����:��������֤������
	 */
	private String insIdentifyType;
	/**
	 * ����:��������֤������
	 */
	private String insIdentifyNumber;
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsIdentifyType() {
		return insIdentifyType;
	}
	public void setInsIdentifyType(String insIdentifyType) {
		this.insIdentifyType = insIdentifyType;
	}
	public String getInsIdentifyNumber() {
		return insIdentifyNumber;
	}
	public void setInsIdentifyNumber(String insIdentifyNumber) {
		this.insIdentifyNumber = insIdentifyNumber;
	}
	
	public TXInsuranceRequest gettXInsuranceRequest() {
		return tXInsuranceRequest;
	}

	public void settXInsuranceRequest(TXInsuranceRequest tXInsuranceRequest) {
		this.tXInsuranceRequest = tXInsuranceRequest;
	}

	public TXInsuranceRequestExtension gettXInsuranceRequestExtension() {
		return tXInsuranceRequestExtension;
	}

	public void settXInsuranceRequestExtension(
			TXInsuranceRequestExtension tXInsuranceRequestExtension) {
		this.tXInsuranceRequestExtension = tXInsuranceRequestExtension;
	}

}
