package com.expenditure.commons.tos;

import java.math.BigDecimal;
import java.time.YearMonth;

public class SavingTo {

	private YearMonth yearMonth;
	private BigDecimal toatalSavingAmount;

	public SavingTo() {
		super();

	}

	public SavingTo(YearMonth yearMonth, BigDecimal toatalSavingAmount) {
		super();
		this.yearMonth = yearMonth;
		this.toatalSavingAmount = toatalSavingAmount;
	}

	/**
	 * @return the yearMonth
	 */
	public YearMonth getYearMonth() {
		return yearMonth;
	}

	/**
	 * @param yearMonth
	 *            the yearMonth to set
	 */
	public void setYearMonth(YearMonth yearMonth) {
		this.yearMonth = yearMonth;
	}

	/**
	 * @return the toatalSavingAmount
	 */
	public BigDecimal getToatalSavingAmount() {
		return toatalSavingAmount;
	}

	/**
	 * @param toatalSavingAmount
	 *            the toatalSavingAmount to set
	 */
	public void setToatalSavingAmount(BigDecimal toatalSavingAmount) {
		this.toatalSavingAmount = toatalSavingAmount;
	}

}
