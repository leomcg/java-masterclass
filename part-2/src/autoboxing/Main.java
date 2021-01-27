package autoboxing;

public class Main {
	
	public static void main(String[] args) {
		Bank bank = new Bank("Santander");
		
		bank.addBranch("Berrini");
		bank.addCustomer("Berrini", "Leonardo", 50.05);
		bank.addCustomer("Berrini", "Suely", 20.05);
		bank.addCustomer("Berrini", "Gustavo", 380.05);
		bank.addCustomer("Berrini", "Junior", 150.15);
		
		bank.addCustomerTransaction("Berrini", "Leonardo", -20.0);
		bank.addCustomerTransaction("Berrini", "Leonardo", 35.5);
		bank.addCustomerTransaction("Berrini", "Suely", 70.5);
		bank.addCustomerTransaction("Berrini", "Junior", -50.0);
		
		bank.listCustomers("Berrini", true);
		
	}
	
	
	
}

