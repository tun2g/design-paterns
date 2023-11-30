package structural_paterns.decorator.decorators;

import structural_paterns.decorator.IMilkTea;
import structural_paterns.decorator.MilkTeaDecorator;

public class Sugar extends MilkTeaDecorator {

    public Sugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost(){
        return 2 + super.Cost();
    }
}

