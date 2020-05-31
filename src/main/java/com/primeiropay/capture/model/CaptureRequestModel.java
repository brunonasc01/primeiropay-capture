package com.primeiropay.capture.model;

import java.math.BigDecimal;

public class CaptureRequestModel {
	
	private String entity_id;
	
	private BigDecimal amount;
	
	private String currency;
	
	private String paymentType;
	
	public String getEntity_id() {
		return entity_id;
	}

	public void setEntity_id(String entity_id) {
		this.entity_id = entity_id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {		
		return "entityId="+getEntity_id()
			+	"&amount="+getAmount()
			+	"&currency="+getCurrency()
			+	"&paymentType="+getPaymentType();
	}
}
