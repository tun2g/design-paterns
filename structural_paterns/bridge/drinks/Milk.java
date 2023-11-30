package structural_paterns.bridge.drinks;

import structural_paterns.bridge.decorators.Decorator;
import structural_paterns.bridge.drinks.ADrink;

import java.util.ArrayList;
import java.util.List;

public class Milk extends ADrink {

    private int price;
    private List<Decorator> decorators;

    public Milk(int price){
        super(price);
        this.decorators = new ArrayList<>();
    }

    public void addDecorator(Decorator decorator){
        super.addDecorator(decorator);
    }

    public int price(){
        return super.price();
    }

}
