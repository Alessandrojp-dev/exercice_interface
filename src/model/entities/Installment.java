package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	
	private LocalDate installmentDate;
	private double installmentValue;

	public Installment(LocalDate installmentDate, double installmentValue) {
		this.installmentDate = installmentDate;
		this.installmentValue = installmentValue;
	}

	public LocalDate getInstallmentDate() {
		return installmentDate;
	}

	public void setInstallmentDate(LocalDate installmentDate) {
		this.installmentDate = installmentDate;
	}

	public double getInstallmentValue() {
		return installmentValue;
	}

	public void setInstallmentValue(double installmentValue) {
		this.installmentValue = installmentValue;
	}

	@Override
	public String toString() {
		return installmentDate.format(fmt) + " - " + String.format("%.2f", installmentValue);
	}
	
	
	
	
	

}
