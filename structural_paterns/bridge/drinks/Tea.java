package structural_paterns.bridge.drinks;

import structural_paterns.bridge.decorators.Decorator;
import structural_paterns.bridge.drinks.ADrink;

import java.util.List;

public class Tea extends ADrink {
    private List<Decorator> decorators;
    private int price;

    public Tea(int price){
        super(price);
    }

    public int price(){
        return super.price();
    }
}
