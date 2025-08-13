package week4day1;


public class JavaConnection implements DatabaseConnection {

	    @Override
	    public void connect() {
	        System.out.println("Connected  the database ");
	    }

	    @Override
	    public void disconnect() {
	        System.out.println("Disconnected the database ");
	    }

	    @Override
	    public void executeUpdate() {
	        System.out.println("Executed update the database ");
	    }

		public void executeQuery() {
			
		}

		

	
			
		

		
			
		}
	
		


