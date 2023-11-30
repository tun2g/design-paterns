package structural_paterns.adapter;

public class Main {
    public static void main(String[] Args){
        IClient client = new Adapter(new CalculateService());
        System.out.println(client.getDif(3,2));
    }
}
