package com.twokeys.twokeysapi.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.twokeys.twokeysapi.entities.enums.ClientType;

@Entity
@Table(name="tb_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String name;
	private String fantasyName;
	private String street;
	private String district;
	private String number;
	private String cep;
	private String deliveryNote;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	private String fixedPhone;
	private String mobilePhone;
	private String email;
	private ClientType clientType;
	private String cpfCnpj;
	private LocalDate lastBuy;
	private Double creditLimit;
	
	@ManyToOne
	@JoinColumn(name="seller_id")
	private Seller seller;
	
	@ManyToOne
	@JoinColumn(name="lineBusiness_id")
	private LineBusiness lineBusiness;
	
	@ManyToOne
	@JoinColumn(name="square_id")
	private Square square;
	
	@ManyToOne
	@JoinColumn(name="formPayment_id")
	private FormPayment formPayment;
	
	@ManyToOne
	@JoinColumn(name="paymentPlan_id")
	private PaymentPlan paymentPlan;
		
	private String generalNote;
	private boolean enable;
	private boolean specialPrice;
	private boolean validateFinancialBlock;
	
	public Client() {
	}

	public Client(Long id, String name, String fantasyName, String street, String district, String number, String cep,
				  String deliveryNote, City city, String fixedPhone, String mobilePhone, String email, ClientType clientType,
				  String cpfCnpj, LocalDate lastBuy, Double creditLimit, Seller seller, LineBusiness lineBusiness,
				  Square square, FormPayment formPayment, PaymentPlan paymentPlan, String generalNote, boolean enable,
				  boolean specialPrice, boolean validateFinancialBlock) {
		super();
		this.id = id;
		this.name = name;
		this.fantasyName = fantasyName;
		this.street = street;
		this.district = district;
		this.number = number;
		this.cep = cep;
		this.deliveryNote = deliveryNote;
		this.city = city;
		this.fixedPhone = fixedPhone;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.clientType = clientType;
		this.cpfCnpj = cpfCnpj;
		this.lastBuy = lastBuy;
		this.creditLimit = creditLimit;
		this.seller = seller;
		this.lineBusiness = lineBusiness;
		this.square = square;
		this.formPayment = formPayment;
		this.paymentPlan = paymentPlan;
		this.generalNote = generalNote;
		this.enable = enable;
		this.specialPrice = specialPrice;
		this.validateFinancialBlock = validateFinancialBlock;
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

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDeliveryNote() {
		return deliveryNote;
	}

	public void setDeliveryNote(String deliveryNote) {
		this.deliveryNote = deliveryNote;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getFixedPhone() {
		return fixedPhone;
	}

	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public LocalDate getLastBuy() {
		return lastBuy;
	}

	public void setLastBuy(LocalDate lastBuy) {
		this.lastBuy = lastBuy;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public LineBusiness getLineBusiness() {
		return lineBusiness;
	}

	public void setLineBusiness(LineBusiness lineBusiness) {
		this.lineBusiness = lineBusiness;
	}

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
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

	public String getGeneralNote() {
		return generalNote;
	}

	public void setGeneralNote(String generalNote) {
		this.generalNote = generalNote;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public boolean isSpecialPrice() {
		return specialPrice;
	}

	public void setSpecialPrice(boolean specialPrice) {
		this.specialPrice = specialPrice;
	}

	public boolean isValidateFinancialBlock() {
		return validateFinancialBlock;
	}

	public void setValidateFinancialBlock(boolean validateFinancialBlock) {
		this.validateFinancialBlock = validateFinancialBlock;
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
		Client other = (Client) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
