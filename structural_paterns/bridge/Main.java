package structural_paterns.bridge;

import structural_paterns.bridge.decorators.Decorator;
import structural_paterns.bridge.decorators.SugarDecorator;
import structural_paterns.bridge.drinks.ADrink;
import structural_paterns.bridge.drinks.Milk;

public class Main {
    public static void main(String[] args){
        ADrink drink = new Milk(4);
        Decorator sugar = new SugarDecorator(3);
        drink.addDecorator(sugar);
        System.out.println(drink.price());
    }
}
