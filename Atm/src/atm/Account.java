package atm;
import java.util.*;
import java.text.DecimalFormat;
public class Account {
	Scanner input=new Scanner(System.in);
			DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
			public int setCustomerNumber(int customerNumber) {
				this.customerNumber=customerNumber;
				return customerNumber;
			}
			public int getCustomerNumber() {
				return customerNumber;
			}
			public int setPinNumber(int pinNumber) {
				this.pinNumber=pinNumber;
				return pinNumber;
			}
			public int getPinNumber() {
				return pinNumber;
			}
			public double getCheckingBalance() {
				return checkingBalance;
			}
			public double getSavingBalance() {
				return savingBalance;
			}
			public double calcChekingWithdraw(double amount) {
				checkingBalance=(checkingBalance-amount);
				return checkingBalance;
			}
			public double calcSavingWithdraw(double amount) {
				savingBalance=(savingBalance-amount);
				return savingBalance;
			}
			public double calcChekingDeposite(double amount) {
				checkingBalance=(checkingBalance+amount);
				return checkingBalance;
			}
			public double calcSavingDeposite(double amount) {
				savingBalance=(savingBalance+amount);
				return savingBalance;
			}
			public void getChekingWithdrawInput() {
				System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingBalance()));
				System.out.println("Amount want to withdraw:");
				double amount=input.nextDouble();
				if((checkingBalance-amount)>=0) {
					calcChekingWithdraw(amount);
					System.out.println("New Cheking account balance:"+moneyFormat.format(getCheckingBalance()));
					
				}
				else {
					System.out.println("Balance Cannot be negative"+"\n");
				}
			}
			public void getSavingWithdrawInput() {
				System.out.println("Saving Account Balance:"+moneyFormat.format(getSavingBalance()));
				System.out.println("Amount want to withdraw:");
				double amount=input.nextDouble();
				if((savingBalance-amount)>=0) {
					calcSavingWithdraw(amount);
					System.out.println("New Cheking account balance:"+moneyFormat.format(getSavingBalance()));
					
				}
				else {
					System.out.println("Balance Cannot be negative"+"\n");
				}
			}
			public void getChekingDepositeInput() {
				System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingBalance()));
				System.out.println("Amount want to withdraw:");
				double amount=input.nextDouble();
				if((checkingBalance+amount)>=0) {
					calcChekingDeposite(amount);
					System.out.println("New Cheking account balance:"+moneyFormat.format(getCheckingBalance()));
					
				}
				else {
					System.out.println("Balance Cannot be negative"+"\n");
				}
			}
			public void getSavingDepositeInput() {
				System.out.println("Checking Account Balance:"+moneyFormat.format(getSavingBalance()));
				System.out.println("Amount want to withdraw:");
				double amount=input.nextDouble();
				if((checkingBalance+amount)>=0) {
					calcSavingDeposite(amount);
					System.out.println("New Cheking account balance:"+moneyFormat.format(getSavingBalance()));
					
				}
				else {
					System.out.println("Balance Cannot be negative"+"\n");
				}
			}
			private int customerNumber;
			private int pinNumber;
			private double checkingBalance=0;
			private double savingBalance=0;



			
			
	

}
