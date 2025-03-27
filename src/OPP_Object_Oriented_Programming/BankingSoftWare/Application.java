package OPP_Object_Oriented_Programming.BankingSoftWare;

import OPP_Object_Oriented_Programming.BankingSoftWare.models.Account;

public class Application {
    public static void main(String[] args) {

        Account savingAccount = new Account("Saving  ");
        savingAccount.showBalance();
        System.out.println("\n");

        savingAccount.deposit(10.0);
        savingAccount.showBalance();
        // convert : Riel and Dollar :
        savingAccount.convertFromDollarToRiel(10.0);
        savingAccount.convertFromRielToDollar(40000.0);
        System.out.println("\n");

        savingAccount.withdraw(9.0);
        savingAccount.showBalance();
        // convert : Riel and Dollar :
        savingAccount.convertFromDollarToRiel(1.0);
        savingAccount.convertFromRielToDollar(4000.0);
        System.out.println("\n");

        Account creditCardAccount = new Account("CreditCard  ");
        creditCardAccount.deposit(5.0);
        creditCardAccount.showBalance();
        // convert : Riel and Dollar :
        creditCardAccount.convertFromDollarToRiel(5.0);
        creditCardAccount.convertFromRielToDollar(20000.0);
        System.out.println("\n");

        // Conversion Rate :
        Account convertRielAndDollar = new Account("Conversion Rate");
        System.out.println(" 👉 Conversion Rate ");
        System.out.println("-".repeat(35));
        convertRielAndDollar.convertFromDollarToRiel(1.0);
        convertRielAndDollar.convertFromRielToDollar(4000.0);


    }
}
