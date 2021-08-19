package com.twokeys.twokeysapi.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.twokeys.twokeysapi.entities.enums.OrderStatus;
import com.twokeys.twokeysapi.entities.enums.OrderType;

@Entity
@Table(name="tb_order")
public class Order  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long mobileId;
	private LocalDate date;
	private LocalDate integrationDate;
	private String obsGeral;
	private OrderType orderType;
	private OrderStatus orderStatus;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

	@ManyToOne
	@JoinColumn(name = "form_payment_id")
	private FormPayment formPayment;

	@ManyToOne
	@JoinColumn(name = "payment_plan_id")
	private PaymentPlan paymentPlan;
	
	@OneToMany(mappedBy = "id.order")
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Long id, Long mobileId, LocalDate date, LocalDate integrationDate, String obsGeral,
				 OrderType orderType, OrderStatus orderStatus, Client client, Seller seller, FormPayment formPayment,
				 PaymentPlan paymentPlan) {
		super();
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

	public FormPayment getFormPayment() {
		return formPayment;
	}

	public void setFormPayment(FormPayment formPayment) {
		this.formPayment = formPayment;
	}

	public PaymentPlan getPaymentPlan() {
		return paymentPlan;
	}

	public void setPaymentPlan(PaymentPlan paymentPlan) {
		this.paymentPlan = paymentPlan;
	}
	
	public List<OrderItem> getItems() {
		return items;
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
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
