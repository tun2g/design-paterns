package structural_paterns.bridge.decorators;

public class IceDecorator implements Decorator{

    private int price;

    public IceDecorator(int price){
        this.price = price;
    }

    public int price(){
        return this.price;
    }
}
