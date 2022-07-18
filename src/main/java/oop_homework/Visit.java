package oop_homework;

public class Visit {
	Customer customer = new Customer("");
	double serviceExpense;
	double productExpense;
	
	public Visit(String name) {
		this.customer.name = name;
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = (serviceExpense)-(serviceExpense)*DiscountRate.getServiceDiscountRate(customer.getMemberType());
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = (productExpense)-(productExpense)*DiscountRate.getProductDiscountRate(customer.getMemberType());
	}
	
	public double getTotalExpense() {
		return (getProductExpense() + getServiceExpense());

	}
	
	public String toString() {
		return (customer.toString() + " kopa iztereja " + getTotalExpense() + " EUR");
	}
}
