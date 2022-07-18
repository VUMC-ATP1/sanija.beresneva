package oop_homework;

public class Example {

	public static void main(String[] args) {
		
		Visit visit1 = new Visit("Kate");
		visit1.customer.setMemberType("Premium");
		visit1.customer.setMember(true);
		visit1.setProductExpense(10.0);
		visit1.setProductExpense(20.0);
		System.out.println(visit1.toString());
		
		Visit visit2 = new Visit("Davis");
		visit2.customer.setMemberType("Gold");
		visit2.customer.setMember(true);
		visit2.setProductExpense(10.0);
		visit2.setServiceExpense(20.0);
		System.out.println(visit2.toString());

		
		Visit visit3 = new Visit("Zane");
		visit3.customer.setMemberType("Silver");
		visit3.customer.setMember(true);
		visit3.setProductExpense(10.0);
		visit3.setServiceExpense(20.0);
		System.out.println(visit3.toString());

		
		Visit visit4 = new Visit("Janis");
		visit4.customer.setMemberType("");
		visit4.customer.setMember(false);
		visit4.setProductExpense(10.0);
		visit4.setServiceExpense(20.0);
		System.out.println(visit4.toString());
	}

}
