package model.services;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double paymentFee(double amount) {
		return amount * 0.01;
	}

	@Override
	public double compoundInterest(double amount, int months) {	
		return amount * Math.pow(1.015, months) - amount;
	}

}
