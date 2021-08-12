package com.twokeys.twokeysapi.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.twokeys.twokeysapi.entities.Product;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

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
	private UnityDTO unity;
	private SectionDTO section;
	private DepartmentDTO department;
	private List<PackagingDTO> packaging = new ArrayList<>();

	public ProductDTO() {
	}

	public ProductDTO(Long id, String code, String description, Double commission, boolean enable, Double averageCost,
					  Double lastEntryCost, Double salePrice, Double maxMargin, Double minPrice, Double minMargin,
					  Double stockBalance, String barCode, Double netWeight, Double grossWeight, UnityDTO unity,
					  SectionDTO section, DepartmentDTO department) {
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

	public ProductDTO(Product entity) {
		id = entity.getId();
		code = entity.getCode();
		description = entity.getDescription();
		commission = entity.getCommission();
		enable = entity.isEnable();
		averageCost = entity.getAverageCost();
		lastEntryCost = entity.getLastEntryCost();
		salePrice = entity.getSalePrice();
		maxMargin = entity.getMaxMargin();
		minPrice = entity.getMinPrice();
		minMargin = entity.getMinMargin();
		stockBalance = entity.getStockBalance();
		barCode = entity.getBarCode();
		netWeight = entity.getNetWeight();
		grossWeight = entity.getGrossWeight();
		unity = new UnityDTO(entity.getUnity());
		section = new SectionDTO(entity.getSection());
		department = new DepartmentDTO(entity.getDepartment());
		entity.getPackaging().forEach(pack -> packaging.add(new PackagingDTO(pack)));
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

	public UnityDTO getUnity() {
		return unity;
	}

	public void setUnity(UnityDTO unity) {
		this.unity = unity;
	}

	public SectionDTO getSection() {
		return section;
	}

	public void setSection(SectionDTO section) {
		this.section = section;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	public List<PackagingDTO> getPackaging() {
		return packaging;
	}
}
