package com.twokeys.twokeysapi.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.twokeys.twokeysapi.entities.QuantityDiscount;

public class QuantityDiscountDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Double startQuantity;
	private Double endQuantity;
	private Double authorizedPrice;
	private String obs;
	private ProductDTO product;

	public QuantityDiscountDTO() {
	}

	public QuantityDiscountDTO(Long id, LocalDate startDate, LocalDate endDate, Double startQuantity,
			Double endQuantity, Double authorizedPrice, String obs, ProductDTO product) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startQuantity = startQuantity;
		this.endQuantity = endQuantity;
		this.authorizedPrice = authorizedPrice;
		this.obs = obs;
		this.product = product;
	}

	public QuantityDiscountDTO(QuantityDiscount entity) {
		id = entity.getId();
		startDate = entity.getStartDate();
		endDate = entity.getEndDate();
		startQuantity = entity.getStartQuantity();
		endQuantity = entity.getEndQuantity();
		authorizedPrice = entity.getAuthorizedPrice();
		obs = entity.getObs();
		product = new ProductDTO(entity.getProduct());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Double getStartQuantity() {
		return startQuantity;
	}

	public void setStartQuantity(Double startQuantity) {
		this.startQuantity = startQuantity;
	}

	public Double getEndQuantity() {
		return endQuantity;
	}

	public void setEndQuantity(Double endQuantity) {
		this.endQuantity = endQuantity;
	}

	public Double getAuthorizedPrice() {
		return authorizedPrice;
	}

	public void setAuthorizedPrice(Double authorizedPrice) {
		this.authorizedPrice = authorizedPrice;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}
}
