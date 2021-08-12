package com.twokeys.twokeysapi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String code;
	private String description;
	private Double commission;
	private boolean enable;
	private Double averageCost;
	private Double lastEntryCost;
	private Double salePrice;
	private Double maxMargin;
	private Double minPrice;
	private Double minMargin;
	private Double stockBalance;
	private String barCode;
	private Double netWeight;
	private Double grossWeight;
	
	@ManyToOne
	@JoinColumn(name="unity_id")
	private Unity unity;
	
	@ManyToOne
	@JoinColumn(name="section_id")
	private Section section;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	@OneToMany(mappedBy = "id.product")
	private List<Packaging> packaging = new ArrayList<>();
	
	public Product() {
	}

	public Product(Long id, String code, String description, Double commission, boolean enable, Double averageCost,
			Double lastEntryCost, Double salePrice, Double maxMargin, Double minPrice, Double minMargin,
			Double stockBalance, String barCode, Double netWeight, Double grossWeight, Unity unity, Section section,
			Department department) {
		this.id = id;
		this.code = code;
		this.description = description;
		this.commission = commission;
		this.enable = enable;
		this.averageCost = averageCost;
		this.lastEntryCost = lastEntryCost;
		this.salePrice = salePrice;
		this.maxMargin = maxMargin;
		this.minPrice = minPrice;
		this.minMargin = minMargin;
		this.stockBalance = stockBalance;
		this.barCode = barCode;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
		this.unity = unity;
		this.section = section;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Double getAverageCost() {
		return averageCost;
	}

	public void setAverageCost(Double averageCost) {
		this.averageCost = averageCost;
	}

	public Double getLastEntryCost() {
		return lastEntryCost;
	}

	public void setLastEntryCost(Double lastEntryCost) {
		this.lastEntryCost = lastEntryCost;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getMaxMargin() {
		return maxMargin;
	}

	public void setMaxMargin(Double maxMargin) {
		this.maxMargin = maxMargin;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMinMargin() {
		return minMargin;
	}

	public void setMinMargin(Double minMargin) {
		this.minMargin = minMargin;
	}

	public Double getStockBalance() {
		return stockBalance;
	}

	public void setStockBalance(Double stockBalance) {
		this.stockBalance = stockBalance;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(Double netWeight) {
		this.netWeight = netWeight;
	}

	public Double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Unity getUnity() {
		return unity;
	}

	public void setUnity(Unity unity) {
		this.unity = unity;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Packaging> getPackaging() {
		return packaging;
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
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
