package structural_paterns.bridge.decorators;

public class SugarDecorator implements Decorator{
    private int price;

    public SugarDecorator(int price){
        this.price = price;
    }

    public int price(){
        return this.price;
    }
}
