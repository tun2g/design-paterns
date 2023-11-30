package structural_paterns.proxy;

public class Main {
    public static void main(String[] args){
        Client client = new Client();
        System.out.println(client.getSum(3,4));
        client.getApiKey();
        System.out.println(client.getSum(3,4));
    }
}
