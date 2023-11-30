package structural_paterns.facade;

public class Main {
    public static void main(String[] args){
        Bank scb = new Bank();
        AccountBank acc1 = scb.createBankAccount(12345);
        scb.provideApiKey(acc1);
        scb.deposit(acc1, 1);
        System.out.println(scb.getBalance(acc1));
    }
}
