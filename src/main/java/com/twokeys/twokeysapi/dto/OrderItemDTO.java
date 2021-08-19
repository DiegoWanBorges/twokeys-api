package com.twokeys.twokeysapi.dto;

import java.io.Serializable;

import com.twokeys.twokeysapi.entities.OrderItem;
import com.twokeys.twokeysapi.entities.enums.OrderItemStatus;

public class OrderItemDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long orderId;
	private ProductDTO product;
	private Double quantity;
	private UnityDTO unity;
	private Double standardPrice;
	private Double salePrice;
	private Double cost;
	private Double totalItem;
	private Double totalDiscount;
	private Double totalCost;
	private Double totalCommission;
	private OrderItemStatus orderItemStatus;
	private Double quantityGranted;
	private Long discountPolicyId;
	private String discountPolicyObs;
	
	public OrderItemDTO() {
	}

	public OrderItemDTO(Long orderId, ProductDTO product, Double quantity, UnityDTO unity, Double standardPrice,
						Double salePrice, Double cost, Double totalItem, Double totalDiscount, Double totalCost,
						Double totalCommission, OrderItemStatus orderItemStatus, Double quantityGranted,
						Long discountPolicyId,String discountPolicyObs) {
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
		this.unity = unity;
		this.standardPrice = standardPrice;
		this.salePrice = salePrice;
		this.cost = cost;
		this.totalItem = totalItem;
		this.totalDiscount = totalDiscount;
		this.totalCost = totalCost;
		this.totalCommission = totalCommission;
		this.orderItemStatus = orderItemStatus;
		this.quantityGranted = quantityGranted;
		this.discountPolicyId=discountPolicyId;
		this.discountPolicyObs=discountPolicyObs;
	}

	public OrderItemDTO(OrderItem entity) {
		orderId = entity.getOrder().getId();
		product = new ProductDTO(entity.getProduct());
		quantity = entity.getQuantity();
		unity = new UnityDTO(entity.getUnity());
		standardPrice = entity.getStandardPrice();
		salePrice = entity.getSalePrice();
		cost = entity.getCost();
		totalItem = entity.getTotalItem();
		totalDiscount = entity.getTotalDiscount();
		totalCost = entity.getTotalCost();
		totalCommission = entity.getTotalCommission();
		orderItemStatus = entity.getOrderItemStatus();
		quantityGranted = entity.getQuantityGranted();
		discountPolicyId=entity.getDiscountPolicyId();
		discountPolicyObs=entity.getDiscountPolicyObs();
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public UnityDTO getUnity() {
		return unity;
	}

	public void setUnity(UnityDTO unity) {
		this.unity = unity;
	}

	public Double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(Double standardPrice) {
		this.standardPrice = standardPrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(Double totalItem) {
		this.totalItem = totalItem;
	}

	public Double getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Double getTotalCommission() {
		return totalCommission;
	}

	public void setTotalCommission(Double totalCommission) {
		this.totalCommission = totalCommission;
	}

	public OrderItemStatus getOrderItemStatus() {
		return orderItemStatus;
	}

	public void setOrderItemStatus(OrderItemStatus orderItemStatus) {
		this.orderItemStatus = orderItemStatus;
	}

	public Double getQuantityGranted() {
		return quantityGranted;
	}

	public void setQuantityGranted(Double quantityGranted) {
		this.quantityGranted = quantityGranted;
	}

	public Long getDiscountPolicyId() {
		return discountPolicyId;
	}

	public void setDiscountPolicyId(Long discountPolicyId) {
		this.discountPolicyId = discountPolicyId;
	}

	public String getDiscountPolicyObs() {
		return discountPolicyObs;
	}

	public void setDiscountPolicyObs(String discountPolicyObs) {
		this.discountPolicyObs = discountPolicyObs;
	}
}
