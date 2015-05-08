package com.huibao.esb.insureservice.client.tianan.fake;

public class ItemKindDataDto {
	
	/**
	 * 属性:险别代码
	 */
	private String kindCode;
	/**
	 * 属性:保额
	 */
	private double amount;
	/**
	 * 属性:投保份数
	 */
	private double uwCount;
	/**
	 * 属性:币别
	 */
	private String currency;
	/**
	 * 属性:保费
	 */
	private double premium;
	/**
	 * 属性:费率
	 */
	private double rate;
	/**
	 * 属性:折扣率
	 */
	private double discount;
	/**
	 * 属性:免赔额
	 */
	private double deductible;
	
	/**
	 * 属性:条款名称
	 * @return
	 */
	private String clauseName;
	/**
	 * 属性:险别名称
	 * @return
	 */
	private String kindCName;
	/**
	 * 属性：险别总保额
	 * @return
	 */
	private double sumInsured;
	
	private String kindName;
	
	
	public String getKindName() {
		return kindName;
	}
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
	public double getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getKindCName() {
		return kindCName;
	}
	public void setKindCName(String kindCName) {
		this.kindCName = kindCName;
	}
	public String getClauseName() {
		return clauseName;
	}
	public void setClauseName(String clauseName) {
		this.clauseName = clauseName;
	}
	public String getKindCode() {
		return kindCode;
	}
	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getUwCount() {
		return uwCount;
	}
	public void setUwCount(double uwCount) {
		this.uwCount = uwCount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getDeductible() {
		return deductible;
	}
	public void setDeductible(double deductible) {
		this.deductible = deductible;
	}

}
