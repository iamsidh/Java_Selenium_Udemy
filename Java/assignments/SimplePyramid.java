package assignments;

public class SimplePyramid {
	public static void main(String[] args)

	{
		SimplePyramid s =new SimplePyramid();
		
		/*
		 * s.increasingPyramid();
		 * 
		 * System.out.println("----------------------------"); s.descrisingPyramid();
		 */
		s.righSideTriangle();
		
	}
	
	public void increasingPyramid() {
		
		for(int i =0;i<5;i++) {
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public void descrisingPyramid() {
		
		for( int i = 0;i<5;i++) {
			for(int j=5;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void righSideTriangle() {
		
		for(int i=0;i<5;i++) {
			
			for (int j=i;j<=5;j++) {
				
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	}


