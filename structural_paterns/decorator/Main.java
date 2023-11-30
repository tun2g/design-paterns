package structural_paterns.decorator;

import structural_paterns.decorator.decorators.Bubble;
import structural_paterns.decorator.decorators.Sugar;

public class Main {
    public static void main(String[] args) {
        IMilkTea milkTea = new Bubble(new Sugar(new MilkTea()));
        System.out.println(milkTea.Cost());
    }
}
