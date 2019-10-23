package com.expenditure.commons.tos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class UserTo {

	private String userId;
	private String userName;
	private Date CreatedOn;
	private Date modifiedon;
	private String createdBy;
	private BigDecimal totalSalary;
	private Date salaryDate;
	private AddressTo address;
	private String phone;
	private String email;
	private List<SavingTo> savings;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return CreatedOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}

	/**
	 * @return the modifiedon
	 */
	public Date getModifiedon() {
		return modifiedon;
	}

	/**
	 * @param modifiedon
	 *            the modifiedon to set
	 */
	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the totalSalary
	 */
	public BigDecimal getTotalSalary() {
		return totalSalary;
	}

	/**
	 * @param totalSalary
	 *            the totalSalary to set
	 */
	public void setTotalSalary(BigDecimal totalSalary) {
		this.totalSalary = totalSalary;
	}

	/**
	 * @return the salaryDate
	 */
	public Date getSalaryDate() {
		return salaryDate;
	}

	/**
	 * @param salaryDate
	 *            the salaryDate to set
	 */
	public void setSalaryDate(Date salaryDate) {
		this.salaryDate = salaryDate;
	}

	/**
	 * @return the address
	 */
	public AddressTo getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(AddressTo address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the savings
	 */
	public List<SavingTo> getSavings() {
		return savings;
	}

	/**
	 * @param savings the savings to set
	 */
	public void setSavings(List<SavingTo> savings) {
		this.savings = savings;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserTo [userId=" + userId + ", userName=" + userName + ", CreatedOn=" + CreatedOn + ", modifiedon="
				+ modifiedon + ", createdBy=" + createdBy + ", totalSalary=" + totalSalary + ", salaryDate="
				+ salaryDate + ", address=" + address + ", phone=" + phone + ", email=" + email + ", savings=" + savings
				+ "]";
	}
	
	

}
