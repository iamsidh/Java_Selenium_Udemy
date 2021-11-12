package ExceptionsHandling;

public class DivisibleBy0 {

	public static void main(String[] args) {

		try {

			System.out.println("Start");

			int a = 10 / 0;

			System.out.println(a);
		} catch (Exception e) {
			
			System.out.println("Error Occured");
			System.out.println(e.getMessage());
			

			
		}
		System.out.println("End");
	}

}
