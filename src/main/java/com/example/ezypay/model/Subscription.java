package com.example.ezypay.model;

import java.util.Date;
import java.util.List;

public class Subscription {
	private double amount;
	private String subsType;
	private int dayOfWeek;
	private int dayOfMonth;
	private String startDate;
	private String endDate;
	private List<String> invoiceDates;
	
	public Subscription() {
		
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getSubsType() {
		return subsType;
	}
	public void setSubsType(String subsType) {
		this.subsType = subsType;
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

	public List<String> getInvoiceDates() {
		return invoiceDates;
	}

	public void setInvoiceDates(List<String> invoiceDates) {
		this.invoiceDates = invoiceDates;
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
}
