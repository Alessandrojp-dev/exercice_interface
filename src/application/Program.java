package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Installment;
import model.entities.Sale;
import model.services.PaypalService;
import model.services.SaleProcessor;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter sales data:  ");
		System.out.print("Sale code: ");
		String code = sc.nextLine();
		System.out.print("Enter the date of sale (dd/MM/yyyy):  ");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Total sale value: ");
		double totalValue = sc.nextDouble();
		
		Sale sale = new Sale(code, date, totalValue);
		
		System.out.print("Enter parcel numbers (1 a 12): ");
		int months = sc.nextInt();
		
		SaleProcessor process = new SaleProcessor(new PaypalService());
		
		process.SaleProcess(sale, months);
		
		System.out.println();
		System.out.println("Installments");
		for(Installment installment : sale.getInstallment()) {
			System.out.println(installment.toString());
		}
		
		sc.close();

	}

}
