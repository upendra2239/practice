package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Exchange_Value")
public class ExchangeValue {

	@Id 
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	
	
	public void setPort(int port) {
		this.port = port;
	}



	public int getPort() {
		return port;
	}



	public ExchangeValue() {
		super();
	}



	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}



	public Long getId() {
		return id;
	}



	public String getFrom() {
		return from;
	}



	public String getTo() {
		return to;
	}



	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	} 
	
	
	
}
