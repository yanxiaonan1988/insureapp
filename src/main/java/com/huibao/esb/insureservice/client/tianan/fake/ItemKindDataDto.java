package com.huibao.esb.insureservice.client.tianan.fake;

public class ItemKindDataDto {
	
	/**
	 * ����:�ձ����
	 */
	private String kindCode;
	/**
	 * ����:����
	 */
	private double amount;
	/**
	 * ����:Ͷ������
	 */
	private double uwCount;
	/**
	 * ����:�ұ�
	 */
	private String currency;
	/**
	 * ����:����
	 */
	private double premium;
	/**
	 * ����:����
	 */
	private double rate;
	/**
	 * ����:�ۿ���
	 */
	private double discount;
	/**
	 * ����:�����
	 */
	private double deductible;
	
	/**
	 * ����:��������
	 * @return
	 */
	private String clauseName;
	/**
	 * ����:�ձ�����
	 * @return
	 */
	private String kindCName;
	/**
	 * ���ԣ��ձ��ܱ���
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
