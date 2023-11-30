package structural_paterns.decorator.decorators;

import structural_paterns.decorator.IMilkTea;
import structural_paterns.decorator.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost(){
        return 1 + super.Cost();
    }
}
