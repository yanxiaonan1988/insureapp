package com.huibao.esb.insureservice.client.tianan.fake;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="PolicyQueryDetailResponse")
@XmlType(propOrder={"tXInsuranceResponse","tXInsuranceResponseExtension","rationType","comCode",
		"riskCode","startDate","endDate","inputDate","teamCode","businessSource","cFinTyp",
		"operateCode","certiNo","certiName","nAmt","nPrm","unfixSpc","remark","orderNo",
		"unitCount","channelCode","agentCode","agentName","permitCode","payMathed","appDataDto",
		"insuredList","benfcList","itemKindList","riskClauseList","itemDataDto","engageList","riskcName"})
public class PolicyQueryDetailResponse {
	
	private TXInsuranceResponse tXInsuranceResponse;
	private TXInsuranceResponseExtension tXInsuranceResponseExtension;
	/**
	 * 属性:产品代码
	 */
	private String rationType;
	/**
	 * 属性:机构代码
	 */
	private String comCode;
	/**
	 * 属性:险种代码
	 */
	private String riskCode;
	/**
	 * 属性:保险起期
	 */
	private String startDate;
	/**
	 * 属性:保险止期
	 */
	private String endDate;
	/**
	 * 属性:投保日期
	 */
	private String inputDate;
	/**
	 * 属性:归属团队
	 */
	private String teamCode;
	/**
	 * 属性:业务来源
	 */
	private String businessSource;
	/**
	 * 属性:缴费方式
	 */
	private String cFinTyp;
	/**
	 * 属性:操作员代码
	 */
	private String operateCode;
	/**
	 * 属性:业务员员工号(销售人员代码)
	 */
	private String certiNo;
	/**
	 * 属性:业务员名称(销售人员名称)
	 */
	private String certiName;
	/**
	 * 属性:总保额
	 */
	private BigDecimal nAmt;
	/**
	 * 属性:总保费
	 */
	private BigDecimal nPrm;
	/**
	 * 属性:特别约定
	 */
	private String unfixSpc;
	/**
	 * 属性:备注
	 */
	private String remark;
	/**
	 * 属性:订单号
	 */
	private String orderNo;
	/**
	 * 属性:投保份数
	 */
	private int unitCount;
	
	/**
	 * 属性:渠道类型
	 */
	private String channelCode;
	/**
	 * 属性:代理人代码
	 */
	private String agentCode;
	/**
	 * 属性:代理人名称
	 */
	private String agentName;
	/**
	 * 属性:职业资格证代码
	 */
	private String permitCode;
	/**
	 * 属性:佣金支付方式
	 */
	private String payMathed;
	/**
	 * 属性:险种名称
	 */
	private String riskcName;
	

	//投保人信息
	private AppDataDto appDataDto;

	// 被保险人信息
	private List<InsuredDataDto> insuredList = new ArrayList<InsuredDataDto>();

	// 受益人信息
	private List<BenfcDataDto> benfcList = new ArrayList<BenfcDataDto>();
	
	//险别信息
	private List<ItemKindDataDto> itemKindList = new ArrayList<ItemKindDataDto>();
	
	//条款信息
	private List<RiskClauseDataDto> riskClauseList = new ArrayList<RiskClauseDataDto>();
	
	// 标的信息
	private ItemDataDto itemDataDto;

	// 特别约定
	private List<EngageDataDto> engageList = new ArrayList<EngageDataDto>();

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

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getPermitCode() {
		return permitCode;
	}

	public void setPermitCode(String permitCode) {
		this.permitCode = permitCode;
	}

	public String getPayMathed() {
		return payMathed;
	}

	public void setPayMathed(String payMathed) {
		this.payMathed = payMathed;
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

	@XmlElementWrapper(name="itemKindList")
	@XmlElement(name="itemKindDataDto")
	public List<ItemKindDataDto> getItemKindList() {
		return itemKindList;
	}

	public void setItemKindList(List<ItemKindDataDto> itemKindList) {
		this.itemKindList = itemKindList;
	}

	@XmlElementWrapper(name="riskClauseList")
	@XmlElement(name="riskClauseDataDto")
	public List<RiskClauseDataDto> getRiskClauseList() {
		return riskClauseList;
	}

	public void setRiskClauseList(List<RiskClauseDataDto> riskClauseList) {
		this.riskClauseList = riskClauseList;
	}

	public ItemDataDto getItemDataDto() {
		return itemDataDto;
	}

	public void setItemDataDto(ItemDataDto itemDataDto) {
		this.itemDataDto = itemDataDto;
	}

	@XmlElementWrapper(name="engageList")
	@XmlElement(name="engageDataDto")
	public List<EngageDataDto> getEngageList() {
		return engageList;
	}

	public void setEngageList(List<EngageDataDto> engageList) {
		this.engageList = engageList;
	}
	
	public String getRiskcName() {
		return riskcName;
	}

	public void setRiskcName(String riskcName) {
		this.riskcName = riskcName;
	}

}
