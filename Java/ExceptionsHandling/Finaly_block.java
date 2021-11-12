package ExceptionsHandling;

public class Finaly_block {
	
	
	public static void main(String[] args) {
		
		try {
			
			
		
		System.out.println("Start");
		
		//db connection
		//executing some queries
		
		int a = 10/0;
		//	
		
		
	}catch (Exception e) {
		
		
		System.out.println("Error Occured");
	}

		
		finally {
			
			System.out.println("Closing db connection");
		}
}
	
}
