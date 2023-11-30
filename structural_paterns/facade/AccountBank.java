package structural_paterns.facade;

public class AccountBank {
    private StringBuilder apiKey;
    private Integer accountNumber;


    public AccountBank(Integer accountNumber){
        this.apiKey = null;
        this.accountNumber = accountNumber;
    }

    public StringBuilder getApiKey(){
        return this.apiKey;
    }

    public void  setApiKey(StringBuilder apiKey){
        this.apiKey = apiKey;
    }

}

