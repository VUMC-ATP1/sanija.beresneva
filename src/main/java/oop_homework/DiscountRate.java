package oop_homework;

public class DiscountRate {
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate (String memberType) {
		return (memberType.equals("Premium")?serviceDiscountPremium:((memberType.equals("Gold")?serviceDiscountGold:((memberType.equals("Silver")?serviceDiscountSilver:0.0)))));
	}
	
	public static double getProductDiscountRate (String memberType) {
		return (memberType.equals("Premium")?productDiscountPremium:((memberType.equals("Gold")?productDiscountGold:((memberType.equals("Silver")?productDiscountSilver:0.0)))));
	}
}
