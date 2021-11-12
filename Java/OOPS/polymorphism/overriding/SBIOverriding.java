package polymorphism.overriding;

public class SBIOverriding extends RBI {
	
	public static void main(String[] args) {
		
		
		SBIOverriding sbi = new SBIOverriding();
		
		System.out.println(sbi.HomeLoanInterest());
	}

	
	//if we want to change rate of interest then we can override this method
	
	public double HomeLoanInterest() {
		
		return 7.15;
	}
}
