package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sale {
	
	private String code;
	private LocalDate date;
	private Double totalValue;
	
	List<Installment> installment = new ArrayList<Installment>();
	
	public Sale() {
	}

	public Sale(String code, LocalDate date, Double totalValue) {
		this.code = code;
		this.date = date;
		this.totalValue = totalValue;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallment() {
		return installment;
	}
	
	
	
	

}
