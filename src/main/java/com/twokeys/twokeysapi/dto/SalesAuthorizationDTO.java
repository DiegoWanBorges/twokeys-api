package com.twokeys.twokeysapi.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.twokeys.twokeysapi.entities.SalesAuthorization;

public class SalesAuthorizationDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Long clientId;
	private Long sellerId;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductDTO product;
	
	private Double authorizedPrice;
	private String obs;

	public SalesAuthorizationDTO() {
	}

	public SalesAuthorizationDTO(Long id, LocalDate startDate, LocalDate endDate, Long clientId, Long sellerId,
								 ProductDTO product, Double authorizedPrice,String obs) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.clientId = clientId;
		this.sellerId = sellerId;
		this.product = product;
		this.authorizedPrice = authorizedPrice;
		this.obs=obs;
	}
	
	public SalesAuthorizationDTO(SalesAuthorization entity) {
		id = entity.getId();
		startDate = entity.getStartDate();
		endDate = entity.getEndDate();
		clientId = entity.getClient().getId();
		sellerId = entity.getSeller().getId();
		product = new ProductDTO(entity.getProduct());
		authorizedPrice = entity.getAuthorizedPrice();
		obs=entity.getObs();
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

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
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
	
}
