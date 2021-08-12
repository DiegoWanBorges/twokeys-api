package com.twokeys.twokeysapi.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.twokeys.twokeysapi.entities.Product;
import com.twokeys.twokeysapi.entities.Unity;

@Embeddable
public class PackagingPK implements Serializable {
	private static final long serialVersionUID = 1L;
		
	@ManyToOne
	@JoinColumn(name="unity_id")
	private Unity unity;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	public PackagingPK() {
	}

	public PackagingPK(Unity unity, Product product) {
		this.unity = unity;
		this.product = product;
	}
	
	
	public Unity getUnity() {
		return unity;
	}

	public void setUnity(Unity unity) {
		this.unity = unity;
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
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((unity == null) ? 0 : unity.hashCode());
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
		PackagingPK other = (PackagingPK) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (unity == null) {
			if (other.unity != null)
				return false;
		} else if (!unity.equals(other.unity))
			return false;
		return true;
	}

}
