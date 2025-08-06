package week3day2;

public class PolymorphismOverLoading {
	public void reportStep(String msg,String sts) {
		System.out.println("Message is " + msg);
		System.out.println("Status is " + sts);
	}

	public void reportStep(String msg, String sts, boolean snap) {
		System.out.println("Message is" + msg);
		System.out.println("Status is" + sts);
		System.out.println("Photo is Takem " + snap);
	}
	
	public static void main(String[] args) {
		PolymorphismOverLoading options = new PolymorphismOverLoading();
		options.reportStep("Done", "pass");
		options.reportStep("Photo Taken","pass",true);
	}
	
}
