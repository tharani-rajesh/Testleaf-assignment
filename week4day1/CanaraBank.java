package week4day1;

public abstract class CanaraBank implements Payments {
	public void cashOnDelivery() {
		System.out.println("Cash on delivery");
		
}
	   public void upiPayments() {
		   System.out.println("UPI");
	   }
	   
	   public void cardPayments() {
		   System.out.println("Card");
	   }
	   
	   public void internetBanking() {
		   System.out.println("Internet");
	   }
    	public void recordPaymentDetails() {
		
		
	}
}
		