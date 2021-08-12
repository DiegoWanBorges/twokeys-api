package com.twokeys.twokeysapi.dto;

import java.io.Serializable;

import com.twokeys.twokeysapi.entities.PaymentPlan;

public class PaymentPlanDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double financialRate;
	private Integer averageTime;
	private Integer parcelsNumber;
	private Integer firstInterval;
	private Integer parcelsInterval;

	public PaymentPlanDTO() {
	}

	public PaymentPlanDTO(Long id, String name, Double financialRate, Integer averageTime, Integer parcelsNumber,
			Integer firstInterval, Integer parcelsInterval) {
		this.id = id;
		this.name = name;
		this.financialRate = financialRate;
		this.averageTime = averageTime;
		this.parcelsNumber = parcelsNumber;
		this.firstInterval = firstInterval;
		this.parcelsInterval = parcelsInterval;
	}

	public PaymentPlanDTO(PaymentPlan entity) {
		id = entity.getId();
		name = entity.getName();
		financialRate = entity.getFinancialRate();
		averageTime = entity.getAverageTime();
		parcelsNumber = entity.getParcelsNumber();
		firstInterval = entity.getFirstInterval();
		parcelsInterval = entity.getParcelsInterval();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFinancialRate() {
		return financialRate;
	}

	public void setFinancialRate(Double financialRate) {
		this.financialRate = financialRate;
	}

	public Integer getAverageTime() {
		return averageTime;
	}

	public void setAverageTime(Integer averageTime) {
		this.averageTime = averageTime;
	}

	public Integer getParcelsNumber() {
		return parcelsNumber;
	}

	public void setParcelsNumber(Integer parcelsNumber) {
		this.parcelsNumber = parcelsNumber;
	}

	public Integer getFirstInterval() {
		return firstInterval;
	}

	public void setFirstInterval(Integer firstInterval) {
		this.firstInterval = firstInterval;
	}

	public Integer getParcelsInterval() {
		return parcelsInterval;
	}

	public void setParcelsInterval(Integer parcelsInterval) {
		this.parcelsInterval = parcelsInterval;
	}
}
