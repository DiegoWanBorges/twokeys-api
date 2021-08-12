package com.twokeys.twokeysapi.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.twokeys.twokeysapi.entities.pk.PackagingPK;

@Entity
@Table(name="tb_packaging")
public class Packaging implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PackagingPK id = new PackagingPK();
	
	private String description;
	private Double conversionFactor;
	private String barCode;
	private Double netWeight;
	private Double grossWeight;

	public Packaging() {
	}

	public Packaging(Product product,Unity unity, String description, Double conversionFactor, String barCode, Double netWeight,
			Double grossWeight) {
		this.id.setProduct(product); 
		this.id.setUnity(unity);
		this.description = description;
		this.conversionFactor = conversionFactor;
		this.barCode = barCode;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	public Unity getUnity() {
		return id.getUnity();
	}
	public void setUnity(Unity unity) {
		id.setUnity(unity);
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
		Packaging other = (Packaging) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
