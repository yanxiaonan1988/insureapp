package com.huibao.esb.insureservice.client.tianan.fake;

import java.util.Date;

public class BenfcDataDto {
	
	/**
	 * 属性:受益人代码
	 */
	private String benCode;
	/**
	 * 属性:受益人名称
	 */
	private String benName;
	/**
	 * 属性:性别
	 */
	private String benGender;
	/**
	 * 属性:受益人证件类型
	 */
	private String benIdType;
	/**
	 * 属性:受益人证件号码
	 */
	private String benIdNumber;
	/**
	 * 属性:出生日期
	 */
	private Date benBirthday;
	/**
	 * 属性:受益人比例
	 */
	private double benRate;
	/**
	 * 属性:受益人备注
	 */
	private String benRemark;
	/**
	 * 属性:受益人证件类型
	 */
	private String benIdTypeName;
	public String getBenIdTypeName() {
		return benIdTypeName;
	}
	public void setBenIdTypeName(String benIdTypeName) {
		this.benIdTypeName = benIdTypeName;
	}
	public String getBenCode() {
		return benCode;
	}
	public void setBenCode(String benCode) {
		this.benCode = benCode;
	}
	public String getBenName() {
		return benName;
	}
	public void setBenName(String benName) {
		this.benName = benName;
	}
	public String getBenGender() {
		return benGender;
	}
	public void setBenGender(String benGender) {
		this.benGender = benGender;
	}
	public String getBenIdType() {
		return benIdType;
	}
	public void setBenIdType(String benIdType) {
		this.benIdType = benIdType;
	}
	public String getBenIdNumber() {
		return benIdNumber;
	}
	public void setBenIdNumber(String benIdNumber) {
		this.benIdNumber = benIdNumber;
	}
	public Date getBenBirthday() {
		return benBirthday;
	}
	public void setBenBirthday(Date benBirthday) {
		this.benBirthday = benBirthday;
	}
	public double getBenRate() {
		return benRate;
	}
	public void setBenRate(double benRate) {
		this.benRate = benRate;
	}
	public String getBenRemark() {
		return benRemark;
	}
	public void setBenRemark(String benRemark) {
		this.benRemark = benRemark;
	}

}
