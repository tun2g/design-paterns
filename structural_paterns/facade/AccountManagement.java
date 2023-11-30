package structural_paterns.facade;

import java.util.HashMap;
import java.util.Map;

public class AccountManagement {
    private Map<AccountBank,Integer> accountManagement;

    public AccountManagement(){
        this.accountManagement = new HashMap<>();
    }

    public AccountBank createAccount(Integer accountNumber){
        AccountBank accountBank = new AccountBank(accountNumber);
        this.accountManagement.put(accountBank,0);
        return accountBank;
    }

    public String deposit(AccountBank accountBank,Integer amount){
        Integer currentBalance = this.accountManagement.get(accountBank);
        this.accountManagement.replace(accountBank, currentBalance + amount);
        return "success";
    }

    public String withdraw(AccountBank accountBank,Integer amount){
        Integer currentBalance = this.accountManagement.get(accountBank);
        if(currentBalance > amount){
            this.accountManagement.replace(accountBank,currentBalance - amount);
            return "success";
        }
        else{
            return "failed";
        }
    }

    public Integer getBalance(AccountBank accountBank){
        return this.accountManagement.get(accountBank);
    }
}
