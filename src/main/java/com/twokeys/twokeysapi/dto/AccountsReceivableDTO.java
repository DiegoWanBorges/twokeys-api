package com.twokeys.twokeysapi.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.twokeys.twokeysapi.entities.AccountsReceivable;

public class AccountsReceivableDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long document;
	private String parcel;
	private ClientDTO client;
	private SellerDTO seller;
	private FormPaymentDTO formPayment;
	private PaymentPlanDTO paymentPlan;
	private LocalDate issueDate;
	private LocalDate dueDate;
	private Double value;

	public AccountsReceivableDTO() {
	}

	public AccountsReceivableDTO(Long document, String parcel, ClientDTO client, SellerDTO seller,
			FormPaymentDTO formPayment, PaymentPlanDTO paymentPlan, LocalDate issueDate, LocalDate dueDate,
			Double value) {
		this.document = document;
		this.parcel = parcel;
		this.client = client;
		this.seller = seller;
		this.formPayment = formPayment;
		this.paymentPlan = paymentPlan;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
		this.value = value;
	}

	public AccountsReceivableDTO(AccountsReceivable entity) {
		document = entity.getDocument();
		parcel = entity.getParcel();
		client = new ClientDTO(entity.getClient());
		seller = new SellerDTO(entity.getSeller());
		formPayment = new FormPaymentDTO(entity.getFormPayment());
		paymentPlan = new PaymentPlanDTO(entity.getPaymentPlan());
		issueDate = entity.getIssueDate();
		dueDate = entity.getDueDate();
		value = entity.getValue();
	}

	public Long getDocument() {
		return document;
	}

	public void setDocument(Long document) {
		this.document = document;
	}

	public String getParcel() {
		return parcel;
	}

	public void setParcel(String parcel) {
		this.parcel = parcel;
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
