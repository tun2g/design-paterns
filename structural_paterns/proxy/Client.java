package structural_paterns.proxy;

public class Client {
    private StringBuilder apiKey;
    private Proxy proxy;

    public Client(){
        this.apiKey = null;
        this.proxy = new Proxy();
    }

    public Integer getSum(int x, int y){
        return this.proxy.callSum(x,y,this.apiKey);
    }
    public Integer getDif(int x, int y){
        return this.proxy.callDif(x,y,this.apiKey);
    }

    public void getApiKey(){
        this.apiKey = this.proxy.requestApiKey();
    }
}
