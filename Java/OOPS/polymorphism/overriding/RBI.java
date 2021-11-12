package polymorphism.overriding;

public class RBI {

    public double HomeLoanInterest() {

        return 7.5;
    }

    public double carLoanInterest() {

        return 10.5;
    }

    public RBI getObject() {

        RBI bank = new RBI();

        return bank;
		/*for q - Can we change return type performing overriding
		Yes -- in case return type are ClassName*/
    }

}
