package com.twokeys.twokeysapi.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.twokeys.twokeysapi.entities.Client;
import com.twokeys.twokeysapi.entities.enums.ClientType;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String fantasyName;
	private String street;
	private String district;
	private String number;
	private String cep;
	private String deliveryNote;
	private CityDTO city;
	private String fixedPhone;
	private String mobilePhone;
	private String email;
	private ClientType clientType;
	private String cpfCnpj;
	private LocalDate lastBuy;
	private Double creditLimit;
	private SellerDTO seller;
	private LineBusinessDTO lineBusiness;
	private SquareDTO square;
	private FormPaymentDTO formPayment;
	private PaymentPlanDTO paymentPlan;
	private String generalNote;
	private boolean enable;
	private boolean specialPrice;
	private boolean validateFinancialBlock;

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String fantasyName, String street, String district, String number,
			String cep, String deliveryNote, CityDTO city, String fixedPhone, String mobilePhone, String email,
			ClientType clientType, String cpfCnpj, LocalDate lastBuy, Double creditLimit, SellerDTO seller,
			LineBusinessDTO lineBusiness, SquareDTO square, FormPaymentDTO formPayment, PaymentPlanDTO paymentPlan,
			String generalNote, boolean enable, boolean specialPrice, boolean validateFinancialBlock) {
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

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		fantasyName = entity.getFantasyName();
		street = entity.getStreet();
		district = entity.getDistrict();
		number = entity.getNumber();
		cep = entity.getNumber();
		deliveryNote = entity.getDeliveryNote();
		city = new CityDTO(entity.getCity());
		fixedPhone = entity.getFixedPhone();
		mobilePhone = entity.getMobilePhone();
		email = entity.getEmail();
		clientType = entity.getClientType();
		cpfCnpj = entity.getCpfCnpj();
		lastBuy = entity.getLastBuy();
		creditLimit = entity.getCreditLimit();
		seller = new SellerDTO(entity.getSeller());
		lineBusiness = new LineBusinessDTO(entity.getLineBusiness());
		square = new SquareDTO(entity.getSquare());
		formPayment = new FormPaymentDTO(entity.getFormPayment());
		paymentPlan = new PaymentPlanDTO(entity.getPaymentPlan());
		generalNote = entity.getGeneralNote();
		enable = entity.isEnable();
		specialPrice = entity.isSpecialPrice();
		validateFinancialBlock = entity.isValidateFinancialBlock();
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

	public CityDTO getCity() {
		return city;
	}

	public void setCity(CityDTO city) {
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

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

	public LineBusinessDTO getLineBusiness() {
		return lineBusiness;
	}

	public void setLineBusiness(LineBusinessDTO lineBusiness) {
		this.lineBusiness = lineBusiness;
	}

	public SquareDTO getSquare() {
		return square;
	}

	public void setSquare(SquareDTO square) {
		this.square = square;
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
	
	

}
