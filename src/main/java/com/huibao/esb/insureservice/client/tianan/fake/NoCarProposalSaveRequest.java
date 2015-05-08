package com.huibao.esb.insureservice.client.tianan.fake;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "NoCarProposalSaveRequest")
@XmlType(propOrder = {"tXInsuranceRequest","tXInsuranceRequestExtension","rationType","comCode",
		"riskCode","startDate","endDate","inputDate","teamCode","businessSource",
		"cFinTyp","operateCode","certiNo","certiName","nAmt","nPrm","unfixSpc",
		"remark","orderNo","unitCount","appDataDto","insuredList","benfcList","itemDataDto","channelDetailCode","codind",
		"holderNum","payStandard","salesManCode","agreementNo","agentName","agentCode","salesManName"})


public class NoCarProposalSaveRequest {



	private TXInsuranceRequest tXInsuranceRequest;
	
	private TXInsuranceRequestExtension tXInsuranceRequestExtension;
	
	
	private String requestType;
	
	private String teamId;
	
	private String insuranceAccount;
	
	private String payTime;
	
	// ������Ϣ
	/**
	 * ����:��Ʒ����
	 */
	private String rationType;
	/**
	 * ����:��������
	 */
	private String comCode;
	/**
	 * ����:���ִ���
	 */
	private String riskCode;
	/**
	 * ����:��������
	 */
	private String startDate;
	/**
	 * ����:����ֹ��
	 */
	private String endDate;
	/**
	 * ����:Ͷ������
	 */
	private String inputDate;
	/**
	 * ����:�����Ŷ�
	 */
	private String teamCode;
	/**
	 * ����:ҵ����Դ
	 */
	private String businessSource;
	/**
	 * ����:�ɷѷ�ʽ
	 */
	private String cFinTyp;
	/**
	 * ����:����Ա����
	 */
	private String operateCode;
	/**
	 * ����:ҵ��ԱԱ����(������Ա����)
	 */
	private String certiNo;
	/**
	 * ����:ҵ��Ա����(������Ա����)
	 */
	private String certiName;
	/**
	 * ����:�ܱ���
	 */
	private BigDecimal nAmt;
	/**
	 * ����:�ܱ���
	 */
	private BigDecimal nPrm;
	/**
	 * ����:�ر�Լ��
	 */
	private String unfixSpc;
	/**
	 * ����:��ע
	 */
	private String remark;
	/**
	 * ����:������
	 */
	private String orderNo;
	/**
	 * ����:Ͷ������
	 */
	private int unitCount=0;
	/**
	 * ����:��������
	 */
	private String channelDetailCode ;
	/**
	 * ���Լ��ѳ�����ʶ Y������  N �Ǽ���
	 */
	private String codind;
	
	//���ұ���,codindΪYʱ����ֵ
	private String currency;
	//֧����ʽ,codindΪYʱ����ֵ
	private String payWaySource;
	
	/**
	 * Ͷ������
	 */
	private String holderNum;

	/**
	 * �����˲���ҵ��׼
	 */
	private String payStandard;
	/**
	 * ������Ա����
	 */
	private String salesManCode;

	/**
	 * �н���Э���
	 */
	private String agreementNo;
	/**
	 * �н�����
	 */
	private String agentName;
	/**
	 * �н����
	 */
	private String agentCode;
	/**
	 * ������Ա����
	 */
	private String salesManName;
	
	public String getCodind() {
		return codind;
	}

	public void setCodind(String codind) {
		this.codind = codind;
	}

	//Ͷ������Ϣ
	private AppDataDto appDataDto;

	// ����������Ϣ
	private List<InsuredDataDto> insuredList = new ArrayList<InsuredDataDto>();

	// ��������Ϣ
	private List<BenfcDataDto> benfcList = new ArrayList<BenfcDataDto>();
	
	// �����Ϣ
	private ItemDataDto itemDataDto;

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

	public String getRationType() {
		return rationType;
	}

	public void setRationType(String rationType) {
		this.rationType = rationType;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInputDate() {
		return inputDate;
	}

	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}

	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getBusinessSource() {
		return businessSource;
	}

	public void setBusinessSource(String businessSource) {
		this.businessSource = businessSource;
	}

	public String getcFinTyp() {
		return cFinTyp;
	}

	public void setcFinTyp(String cFinTyp) {
		this.cFinTyp = cFinTyp;
	}

	public String getOperateCode() {
		return operateCode;
	}

	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}

	public String getCertiNo() {
		return certiNo;
	}

	public void setCertiNo(String certiNo) {
		this.certiNo = certiNo;
	}

	public String getCertiName() {
		return certiName;
	}

	public void setCertiName(String certiName) {
		this.certiName = certiName;
	}

	public BigDecimal getnAmt() {
		return nAmt;
	}

	public void setnAmt(BigDecimal nAmt) {
		this.nAmt = nAmt;
	}

	public BigDecimal getnPrm() {
		return nPrm;
	}

	public void setnPrm(BigDecimal nPrm) {
		this.nPrm = nPrm;
	}

	public String getUnfixSpc() {
		return unfixSpc;
	}

	public void setUnfixSpc(String unfixSpc) {
		this.unfixSpc = unfixSpc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public int getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
	}

	public AppDataDto getAppDataDto() {
		return appDataDto;
	}

	public void setAppDataDto(AppDataDto appDataDto) {
		this.appDataDto = appDataDto;
	}

	@XmlElementWrapper(name="insuredList")
	@XmlElement(name="insuredDataDto")
	public List<InsuredDataDto> getInsuredList() {
		return insuredList;
	}

	public void setInsuredList(List<InsuredDataDto> insuredList) {
		this.insuredList = insuredList;
	}

	@XmlElementWrapper(name="benfcList")
	@XmlElement(name="benfcDataDto")
	public List<BenfcDataDto> getBenfcList() {
		return benfcList;
	}

	public void setBenfcList(List<BenfcDataDto> benfcList) {
		this.benfcList = benfcList;
	}

	public ItemDataDto getItemDataDto() {
		return itemDataDto;
	}

	public void setItemDataDto(ItemDataDto itemDataDto) {
		this.itemDataDto = itemDataDto;
	}
	public String getChannelDetailCode() {
		return channelDetailCode;
	}

	public void setChannelDetailCode(String channelDetailCode) {
		this.channelDetailCode = channelDetailCode;
	}

	public String getHolderNum() {
		return holderNum;
	}

	public void setHolderNum(String holderNum) {
		this.holderNum = holderNum;
	}

	public String getPayStandard() {
		return payStandard;
	}

	public void setPayStandard(String payStandard) {
		this.payStandard = payStandard;
	}

	public String getSalesManCode() {
		return salesManCode;
	}

	public void setSalesManCode(String salesManCode) {
		this.salesManCode = salesManCode;
	}
	public String getAgreementNo() {
		return agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getSalesManName() {
		return salesManName;
	}

	public void setSalesManName(String salesManName) {
		this.salesManName = salesManName;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getInsuranceAccount() {
		return insuranceAccount;
	}

	public void setInsuranceAccount(String insuranceAccount) {
		this.insuranceAccount = insuranceAccount;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayWaySource() {
		return payWaySource;
	}

	public void setPayWaySource(String payWaySource) {
		this.payWaySource = payWaySource;
	}
	
	
}
