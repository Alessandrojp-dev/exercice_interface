package model.services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	
	double compoundInterest(double amount, int months);
	

}
