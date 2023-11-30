package structural_paterns.decorator;

public abstract class MilkTeaDecorator implements IMilkTea{
    private  IMilkTea milkTea;
    protected MilkTeaDecorator(IMilkTea inner){
        this.milkTea = inner;
    }

    @Override
    public double Cost() {
        return this.milkTea.Cost();
    }
}
