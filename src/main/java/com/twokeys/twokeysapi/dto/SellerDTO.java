package com.twokeys.twokeysapi.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.twokeys.twokeysapi.entities.Seller;

public class SellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double commission;
	private boolean enable;
	private LocalDateTime lastConection;
	
	public SellerDTO() {
	}

	public SellerDTO(Long id, String name, Double commission, boolean enable, LocalDateTime lastConection) {
		this.id = id;
		this.name = name;
		this.commission = commission;
		this.enable = enable;
		this.lastConection = lastConection;
	}
	
	public SellerDTO(Seller entity ) {
		id = entity.getId();
		name = entity.getName();
		commission = entity.getCommission();
		enable = entity.isEnable();
		lastConection = entity.getLastConection();
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
}
