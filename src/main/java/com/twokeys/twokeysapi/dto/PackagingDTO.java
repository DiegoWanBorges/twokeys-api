package com.twokeys.twokeysapi.dto;

import java.io.Serializable;

import com.twokeys.twokeysapi.entities.Packaging;

public class PackagingDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ProductDTO product;
	private UnityDTO unity; 
	private String description;
	private Double conversionFactor;
	private String barCode;
	private Double netWeight;
	private Double grossWeight;

	public PackagingDTO() {
	}

	public PackagingDTO(ProductDTO product, UnityDTO unity, String description, Double conversionFactor, String barCode,
			Double netWeight, Double grossWeight) {
		this.product = product;
		this.unity = unity;
		this.description = description;
		this.conversionFactor = conversionFactor;
		this.barCode = barCode;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
	}
	
	public PackagingDTO(Packaging entity) {
		product = new ProductDTO( entity.getProduct());
		unity = new UnityDTO(entity.getUnity());
		description = entity.getDescription();
		conversionFactor = entity.getConversionFactor();
		barCode = entity.getBarCode();
		netWeight = entity.getNetWeight();
		grossWeight = entity.getGrossWeight();
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public UnityDTO getUnity() {
		return unity;
	}

	public void setUnity(UnityDTO unity) {
		this.unity = unity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
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
}
