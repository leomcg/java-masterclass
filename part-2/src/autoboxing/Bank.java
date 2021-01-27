package autoboxing;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	
	Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName) != null) {
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.newCustomer(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}
	
	public Branch findBranch(String branchName) {
		for (int i = 0; i < branches.size(); i++) {
			Branch checkedBranch = branches.get(i);
			if(checkedBranch.getName().equals(branchName)) {
				return checkedBranch;
			}
		}
		return null;
	}
	
	
	public boolean listCustomers(String branchName) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			System.out.println("Customers from the " + branch.getName() + " branch:");
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for (int i = 0; i < branchCustomers.size(); i++) {
				System.out.println(branchCustomers.get(i));
			}
		}
		return false;
	}
}
