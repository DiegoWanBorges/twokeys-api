package com.twokeys.twokeysapi.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_sales_authorization")
public class SalesAuthorization  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private LocalDate startDate;
	private LocalDate endDate;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	private Double authorizedPrice;
	private String obs;

	public SalesAuthorization() {
	}

	

	public SalesAuthorization(Long id, LocalDate startDate, LocalDate endDate, Client client, Seller seller,
							  Product product, Double authorizedPrice, String obs) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.client = client;
		this.seller = seller;
		this.product = product;
		this.authorizedPrice = authorizedPrice;
		this.obs = obs;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
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
		SalesAuthorization other = (SalesAuthorization) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
