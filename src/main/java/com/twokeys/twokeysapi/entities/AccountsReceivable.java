package com.twokeys.twokeysapi.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.twokeys.twokeysapi.entities.pk.AccountsReceivablePK;

@Entity
@Table(name = "tb_client")
public class AccountsReceivable implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	AccountsReceivablePK id = new AccountsReceivablePK();

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

	@ManyToOne
	@JoinColumn(name = "formPayment_id")
	private FormPayment formPayment;

	@ManyToOne
	@JoinColumn(name = "paymentPlan_id")
	private PaymentPlan paymentPlan;

	private LocalDate issueDate;
	private LocalDate dueDate;
	private Double value;

	public AccountsReceivable() {
	}

	public AccountsReceivable(Long document ,String parcel, Client client, Seller seller, FormPayment formPayment,
							  PaymentPlan paymentPlan, LocalDate issueDate, LocalDate dueDate, Double value) {
		super();
		this.id.setDocument(document);
		this.id.setParcel(parcel);
		this.client = client;
		this.seller = seller;
		this.formPayment = formPayment;
		this.paymentPlan = paymentPlan;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
		this.value = value;
	}

	public Long getDocument() {
		return id.getDocument();
	}

	public void setDocument(Long id) {
		this.id.setDocument(id);;
	}
	
	public String getParcel() {
		return id.getParcel();
	}

	public void setParcel(String parcel) {
		this.id.setParcel(parcel);
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

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
