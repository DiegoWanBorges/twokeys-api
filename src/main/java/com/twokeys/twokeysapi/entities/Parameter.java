package com.twokeys.twokeysapi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.twokeys.twokeysapi.entities.enums.ParameterScreenNameType;
import com.twokeys.twokeysapi.entities.enums.ParameterScreenNumberType;

@Entity
@Table(name="tb_parameter")
public class Parameter implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String company;
	private boolean financialBlockClientOverdue;
	private Integer financialToleranceOverdue;
	private boolean financialValidateCreditLimit;
	private ParameterScreenNameType screenNameType; 
	private ParameterScreenNumberType screenNumberType;
	private boolean sellBelowCost;
	
	public Parameter() {
	}

	public Parameter(Long id, String company, boolean financialBlockClientOverdue, Integer financialToleranceOverdue,
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parameter other = (Parameter) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}