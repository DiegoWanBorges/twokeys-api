package com.twokeys.twokeysapi.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.twokeys.twokeysapi.entities.enums.OrderItemStatus;
import com.twokeys.twokeysapi.entities.pk.OrderItemPK;

@Entity
@Table(name="tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	private Double quantity;
	@ManyToOne
	@JoinColumn(name = "unity_id")
	private Unity unity;
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

	
	public OrderItem() {
	}


	public OrderItem(Order order,Product product, Double quantity, Unity unity, Double standardPrice, Double salePrice, Double cost,
					 Double totalItem, Double totalDiscount, Double totalCost, Double totalCommission,
					 OrderItemStatus orderItemStatus, Double quantityGranted, Long discountPolicyId, String discountPolicyObs) {
		this.id.setOrder(order);
		this.id.setProduct(product);
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
		this.discountPolicyId = discountPolicyId;
		this.discountPolicyObs = discountPolicyObs;
	}


	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder(Order order) {
		this.id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		this.id.setProduct(product);
	}


	public Double getQuantity() {
		return quantity;
	}


	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}


	public Unity getUnity() {
		return unity;
	}


	public void setUnity(Unity unity) {
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
