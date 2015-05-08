package com.huibao.esb.insureservice.client.tianan.fake;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="NoCarProposalSaveResponse")
@XmlType(propOrder={"tXInsuranceResponse","tXInsuranceResponseExtension","proposalNo","policyNo"})
public class NoCarProposalSaveResponse {
	
	private TXInsuranceResponse tXInsuranceResponse;
	private TXInsuranceResponseExtension tXInsuranceResponseExtension;
	
	/**
	 * 投保单号
	 */
	private String proposalNo;
	/**
	 * 保单号
	 */
	private String policyNo;
	
	private String underWriteFlag;
	private String saleFlag;
	private String saleMessage;
	
	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProposalNo() {
		return proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	public TXInsuranceResponse gettXInsuranceResponse() {
		return tXInsuranceResponse;
	}

	public void settXInsuranceResponse(TXInsuranceResponse tXInsuranceResponse) {
		this.tXInsuranceResponse = tXInsuranceResponse;
	}

	public TXInsuranceResponseExtension gettXInsuranceResponseExtension() {
		return tXInsuranceResponseExtension;
	}

	public void settXInsuranceResponseExtension(
			TXInsuranceResponseExtension tXInsuranceResponseExtension) {
		this.tXInsuranceResponseExtension = tXInsuranceResponseExtension;
	}

	public String getUnderWriteFlag() {
		return underWriteFlag;
	}

	public void setUnderWriteFlag(String underWriteFlag) {
		this.underWriteFlag = underWriteFlag;
	}

	public String getSaleFlag() {
		return saleFlag;
	}

	public void setSaleFlag(String saleFlag) {
		this.saleFlag = saleFlag;
	}

	public String getSaleMessage() {
		return saleMessage;
	}

	public void setSaleMessage(String saleMessage) {
		this.saleMessage = saleMessage;
	}
	
	
	

}
