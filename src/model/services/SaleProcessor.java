package model.services;

import java.time.LocalDate;

import model.entities.Installment;
import model.entities.Sale;

public class SaleProcessor {
	
	private OnlinePaymentService onlinePaymentService;

	public SaleProcessor(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public OnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}

	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void SaleProcess(Sale sale, int months) {
		double baseAmount  = sale.getTotalValue() / months;
		for(int i = 1; i <= months;i++) {
			LocalDate date = sale.getDate().plusMonths(i);
			double updatedAmount = baseAmount + onlinePaymentService.compoundInterest(baseAmount , i);
			double finalAmount  = updatedAmount + onlinePaymentService.paymentFee(updatedAmount);
			
			
			sale.getInstallment().add(new Installment(date, finalAmount));
		}
		
	}

}
