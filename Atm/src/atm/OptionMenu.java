package atm;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.*;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(879030, 8060);
				data.put(879040, 8790);
				System.out.println("Welcome to the ATM Project");
				System.out.println("Enter your Customer Number:");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter your Pin Number:");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e) {
				System.out.println("\n"+"invalid characters(s.Only Numbers."+"\n");
				x=2;
			}
			for(java.util.Map.Entry<Integer,Integer>entry:data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n"+"wrong customer number or pin"+"\n");
		}while(x==1);
	}
	public void getAccountType() {
		System.out.println("Select the Account you want to access:");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice:");
		selection=menuInput.nextInt();
		switch(selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank You for using");
			break;
		default:
			System.out.println("\n"+"invalid"+"\n");
			getAccountType();
		}
		
}
	public void getChecking() {
		System.out.println("Checking Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw");
		System.out.println("Type 3 - Depoiste");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice:");
		selection=menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("checking Account Balance:"+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getChekingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getChekingDepositeInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM");
			break;
		default:
			System.out.println("\n"+"invalid"+"\n");
			getSaving();
		}	

}
	public void getSaving() {
		System.out.println("Checking Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw");
		System.out.println("Type 3 - Depoiste");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice:");
		selection=menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance:"+moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositeInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM");
			break;
			
		default:
			System.out.println("\n"+"invalid"+"\n");
			getSaving();
		}	

}
	int selection;
}

