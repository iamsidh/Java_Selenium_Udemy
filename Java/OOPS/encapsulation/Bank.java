package encapsulation;

public class Bank {

    public int accountNo = 456123;

    private int pinNo = 4563;

    private double bankBalance = 100000;

    public double getBankBalance() {

        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {

        this.bankBalance = bankBalance;
    }

    public int getAccountNo() {

        return accountNo;
    }

    public void setPinNo(int pinNo) {

        this.pinNo = pinNo;
    }

    public void SBIBank(int acno, int pin, int amount) {

        if (acno == accountNo && pin == pinNo) {

            if (amount <= bankBalance) {

                System.out.println("Ammout Withdrawal :" + amount);

                bankBalance = bankBalance - amount;

                System.out.println("Remaining banlance : " + bankBalance);

            } else {

                System.out.println("Insufficient Balance");
            }
        } else {

            System.out.println("Enter Correct Account No / Pin Number");
        }

    }

    public void updatePin(int acNo, int oldPin, int newPin) {

        if (acNo == accountNo && oldPin == pinNo) {

            pinNo = newPin;

            System.out.println("Pin Changes Successfully");

        } else {

            System.out.println("Something went wrong");
        }
    }

    public double depositeCash(int acNo, int pin, int amount) {

        if (acNo == accountNo && pin == pinNo) {

            bankBalance += amount;

            return bankBalance;
        } else {

            System.out.println("Invalid Credentials");

            return bankBalance;
        }

    }

}
