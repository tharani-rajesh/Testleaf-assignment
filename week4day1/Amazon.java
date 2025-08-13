package week4day1;

public class Amazon extends CanaraBank{

	    @Override
	    public void recordPaymentDetails() {
	        System.out.println("Payment Details Recoeded");
	    }
	    public static void main(String[] args) {
	    	
	    	Amazon amazonoption = new Amazon();
	    	amazonoption.recordPaymentDetails();
	    	amazonoption.cashOnDelivery();
	    	amazonoption.upiPayments();
	    	amazonoption.cardPayments();
	    	amazonoption.internetBanking();
	    }
}

	   


