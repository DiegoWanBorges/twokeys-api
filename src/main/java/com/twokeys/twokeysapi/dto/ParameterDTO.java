package com.twokeys.twokeysapi.dto;

import java.io.Serializable;

import com.twokeys.twokeysapi.entities.Parameter;
import com.twokeys.twokeysapi.entities.enums.ParameterScreenNameType;
import com.twokeys.twokeysapi.entities.enums.ParameterScreenNumberType;

public class ParameterDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String company;
	private boolean financialBlockClientOverdue;
	private Integer financialToleranceOverdue;
	private boolean financialValidateCreditLimit;
	private ParameterScreenNameType screenNameType;
	private ParameterScreenNumberType screenNumberType;
	private boolean sellBelowCost;

	public ParameterDTO() {
	}

	public ParameterDTO(Long id, String company, boolean financialBlockClientOverdue, Integer financialToleranceOverdue,
			boolean financialValidateCreditLimit, ParameterScreenNameType screenNameType,
			ParameterScreenNumberType screenNumberType, boolean sellBelowCost) {
		this.id = id;
		this.company = company;
		this.financialBlockClientOverdue = financialBlockClientOverdue;
		this.financialToleranceOverdue = financialToleranceOverdue;
		this.financialValidateCreditLimit = financialValidateCreditLimit;
		this.screenNameType = screenNameType;
		this.screenNumberType = screenNumberType;
		this.sellBelowCost = sellBelowCost;
	}

	public ParameterDTO(Parameter entity) {
		id = entity.getId();
		company = entity.getCompany();
		financialBlockClientOverdue = entity.isFinancialValidateCreditLimit();
		financialToleranceOverdue = entity.getFinancialToleranceOverdue();
		financialValidateCreditLimit = entity.isFinancialValidateCreditLimit();
		screenNameType = entity.getScreenNameType();
		screenNumberType = entity.getScreenNumberType();
		sellBelowCost = entity.isSellBelowCost();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isFinancialBlockClientOverdue() {
		return financialBlockClientOverdue;
	}

	public void setFinancialBlockClientOverdue(boolean financialBlockClientOverdue) {
		this.financialBlockClientOverdue = financialBlockClientOverdue;
	}

	public Integer getFinancialToleranceOverdue() {
		return financialToleranceOverdue;
	}

	public void setFinancialToleranceOverdue(Integer financialToleranceOverdue) {
		this.financialToleranceOverdue = financialToleranceOverdue;
	}

	public boolean isFinancialValidateCreditLimit() {
		return financialValidateCreditLimit;
	}

	public void setFinancialValidateCreditLimit(boolean financialValidateCreditLimit) {
		this.financialValidateCreditLimit = financialValidateCreditLimit;
	}

	public ParameterScreenNameType getScreenNameType() {
		return screenNameType;
	}

	public void setScreenNameType(ParameterScreenNameType screenNameType) {
		this.screenNameType = screenNameType;
	}

	public ParameterScreenNumberType getScreenNumberType() {
		return screenNumberType;
	}

	public void setScreenNumberType(ParameterScreenNumberType screenNumberType) {
		this.screenNumberType = screenNumberType;
	}

	public boolean isSellBelowCost() {
		return sellBelowCost;
	}

	public void setSellBelowCost(boolean sellBelowCost) {
		this.sellBelowCost = sellBelowCost;
	}
}
