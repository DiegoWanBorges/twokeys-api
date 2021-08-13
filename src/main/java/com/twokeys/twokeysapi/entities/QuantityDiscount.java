package com.twokeys.twokeysapi.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_quantity_discount")
public class QuantityDiscount  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Double startQuantity;
	private Double endQuantity;
	private Double authorizedPrice;
	private String obs;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	public QuantityDiscount() {
	}

	public QuantityDiscount(Long id, LocalDate startDate, LocalDate endDate, Double startQuantity, Double endQuantity,
					        Double authorizedPrice, String obs, Product product) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startQuantity = startQuantity;
		this.endQuantity = endQuantity;
		this.authorizedPrice = authorizedPrice;
		this.obs = obs;
		this.product = product;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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
		QuantityDiscount other = (QuantityDiscount) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
