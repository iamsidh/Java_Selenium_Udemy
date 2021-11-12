package polymorphism.overloading;

public class OverloadingExample {
	
	/*
	 * all methods are in same class for overloading
	 * 
	 * if we want to login facebook using mobile number and password //or we want
	 * login using username and password 
	 * so here method overloading will be use as
	 * Login method is same but type is different
	 */	
	
	public void facebookLogin(int mobNo , String password) {


		
		//this is for mobile number and password login
	}
	
	public void facebookLogin(String userName , String password) {
		
		//this is for username and password login
		
	}
	
	public static void main(String[] args) {
		OverloadingExample o = new OverloadingExample();

		o.facebookLogin(94444, "siddhesh");
		o.facebookLogin("sidh","siddhesh");
		
		
	}
	
	public void addition(int ...a) {
		
		
	}
	
	

	
	
	

}
