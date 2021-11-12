package encapsulation;

public class ATM {

	public static void main(String[] args) {

		Bank b = new Bank();
		// b.pinNo = 2222;

		System.out.println(b.getAccountNo());

		b.getBankBalance();

		b.setBankBalance(200000);

		b.updatePin(456123, 4563, 1111);

		b.SBIBank(456123, 1111, 5000);

		System.out.println(b.depositeCash(456123, 1111, 45555));

	}

}
