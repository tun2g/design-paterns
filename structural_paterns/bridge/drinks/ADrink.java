package structural_paterns.bridge.drinks;

import structural_paterns.bridge.decorators.Decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class ADrink {
    protected int price;
    protected List<Decorator> decorators;

    public ADrink(int price){
        this.price = price;
        this.decorators = new ArrayList<>();
    }
    public int price(){
        int totalPrice = this.price;
        for (Decorator decorator : decorators) {
            totalPrice = totalPrice + decorator.price();
        }
        return totalPrice;
    };
    public void addDecorator(Decorator decorator){
        this.decorators.add(decorator);
    };
}

