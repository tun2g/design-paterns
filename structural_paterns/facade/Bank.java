package structural_paterns.facade;

public class Bank {
    private ApiKeyManagement apiKeyManagement;
    private AccountManagement accountManagement;

    public Bank(){
        this.apiKeyManagement = new ApiKeyManagement();
        this.accountManagement = new AccountManagement();
    }

    public AccountBank createBankAccount(Integer accountNumber){
        return this.accountManagement.createAccount(accountNumber);
    }

    public void provideApiKey(AccountBank accountBank){
        StringBuilder apiKey = this.apiKeyManagement.provideApikey();
        accountBank.setApiKey(apiKey);
    }

    public String deposit(AccountBank accountBank, Integer amount){
        if(this.apiKeyManagement.verifyApiKey(accountBank.getApiKey()) == false){
            return "failed";
        }
        this.accountManagement.deposit(accountBank,amount);
        return "success";
    }

    public String withdraw(AccountBank accountBank, Integer amount){
        if(this.apiKeyManagement.verifyApiKey(accountBank.getApiKey()) == false){
            return "failed";
        }
        this.accountManagement.deposit(accountBank,amount);
        return "success";
    }

    public Integer getBalance(AccountBank accountBank){
        if(this.apiKeyManagement.verifyApiKey(accountBank.getApiKey()) == false){
            return null;
        }
        return this.accountManagement.getBalance(accountBank);
    }

}
