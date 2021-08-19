package com.twokeys.twokeysapi.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.twokeys.twokeysapi.entities.Order;
import com.twokeys.twokeysapi.entities.enums.OrderStatus;
import com.twokeys.twokeysapi.entities.enums.OrderType;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long mobileId;
	private LocalDate date;
	private LocalDate integrationDate;
	private String obsGeral;
	private OrderType orderType;
	private OrderStatus orderStatus;
	private ClientDTO client;
	private SellerDTO seller;
	private FormPaymentDTO formPayment;
	private PaymentPlanDTO paymentPlan;
	private List<OrderItemDTO> items = new ArrayList<>();

	public OrderDTO() {
	}

	public OrderDTO(Long id, Long mobileId, LocalDate date, LocalDate integrationDate, String obsGeral,
					OrderType orderType, OrderStatus orderStatus, ClientDTO client, SellerDTO seller,
					FormPaymentDTO formPayment, PaymentPlanDTO paymentPlan) {
		this.id = id;
		this.mobileId = mobileId;
		this.date = date;
		this.integrationDate = integrationDate;
		this.obsGeral = obsGeral;
		this.orderType = orderType;
		this.orderStatus = orderStatus;
		this.client = client;
		this.seller = seller;
		this.formPayment = formPayment;
		this.paymentPlan = paymentPlan;
	}

	public OrderDTO(Order entity) {
		id = entity.getId();
		mobileId = entity.getMobileId();
		date = entity.getDate();
		integrationDate = entity.getIntegrationDate();
		obsGeral = entity.getObsGeral();
		orderType = entity.getOrderType();
		orderStatus = entity.getOrderStatus();
		client = new ClientDTO(entity.getClient());
		seller = new SellerDTO(entity.getSeller());
		formPayment = new FormPaymentDTO(entity.getFormPayment());
		paymentPlan = new PaymentPlanDTO(entity.getPaymentPlan());
		entity.getItems().forEach(item -> items.add(new OrderItemDTO(item)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMobileId() {
		return mobileId;
	}

	public void setMobileId(Long mobileId) {
		this.mobileId = mobileId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getIntegrationDate() {
		return integrationDate;
	}

	public void setIntegrationDate(LocalDate integrationDate) {
		this.integrationDate = integrationDate;
	}

	public String getObsGeral() {
		return obsGeral;
	}

	public void setObsGeral(String obsGeral) {
		this.obsGeral = obsGeral;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public ClientDTO getClient() {
		return client;
	}

	public void setClient(ClientDTO client) {
		this.client = client;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

	public FormPaymentDTO getFormPayment() {
		return formPayment;
	}

	public void setFormPayment(FormPaymentDTO formPayment) {
		this.formPayment = formPayment;
	}

	public PaymentPlanDTO getPaymentPlan() {
		return paymentPlan;
	}

	public void setPaymentPlan(PaymentPlanDTO paymentPlan) {
		this.paymentPlan = paymentPlan;
	}

	public List<OrderItemDTO> getItems() {
		return items;
	}
}
