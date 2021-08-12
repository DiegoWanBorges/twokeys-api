package com.twokeys.twokeysapi.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_seller")
public class Seller implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String name;
	private Double commission;
	private boolean enable;
	private LocalDateTime lastConection;
	
	public Seller() {
	}

	public Seller(Long id, String name, Double commission, boolean enable, LocalDateTime lastConection) {
		this.id = id;
		this.name = name;
		this.commission = commission;
		this.enable = enable;
		this.lastConection = lastConection;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDateTime getLastConection() {
		return lastConection;
	}

	public void setLastConection(LocalDateTime lastConection) {
		this.lastConection = lastConection;
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
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
