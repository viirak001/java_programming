package OPP_Object_Oriented_Programming.BankingSoftWare.models;

import OPP_Object_Oriented_Programming.BankingSoftWare.Abstruction.BankingService;

public class Account implements BankingService {
    private String accountName;
    private Double balance = 0.0;

    public Account(String accountName){
        this.accountName = accountName;
    }

    @Override
    public void deposit(Double cashAmount) {
        if (cashAmount < 0){
            System.out.println("[!] Invalid amount of cash");
            return;
        }
        balance += cashAmount;
        System.out.println(accountName);
        System.out.println("[+] Cash : " + cashAmount + " added.");
        System.out.println("[+] Deposit successfully...");
    }

    @Override
    public void withdraw(Double cashAmount) {
        if (cashAmount > balance){
            System.out.println("[!] Cannot withdraw, because the balance is " + balance);
            return;
        }
        balance -= cashAmount;
        System.out.println(accountName);
        System.out.println("[+] Withdraw successfully : " + cashAmount);
        System.out.println("[+] Current balance : " + balance);
    }

    @Override
    public void showBalance() {
        System.out.println("-".repeat(35));
        System.out.println("[+] Account : " + accountName + ": " + balance);
    }

    @Override
    public void convertFromDollarToRiel(Double dollar) {
        if (dollar <= 0){
            System.out.println("[!] Invalid amount for convert");
            return;
        }
        // 1$ = 4000 riel
        double convertDollar = 4000;
        double riel = dollar * convertDollar;
        System.out.println("[+] " + dollar + " USD : " + riel + " KHR");
    }

    @Override
    public void convertFromRielToDollar(Double riel) {
        if (riel <=0){
            System.out.println("[!] Invalid amount for convert");
            return;
        }
        // 1$ = 4000 riel
        double convertRiel = 4000;
        double dollar = riel / convertRiel;
        System.out.println("[+] " + riel + " KHR : " + dollar + " USD");
    }
}
