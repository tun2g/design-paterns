package structural_paterns.adapter;

public class Adapter implements IClient{

    private StringBuilder apiKey;

    private CalculateService calculateService;

    public Adapter(CalculateService calculateService){
        this.apiKey = null;
        this.calculateService = calculateService;
    }

    @Override
    public int getSum(int x, int y){
        return this.calculateService.callSum(x,y);
    }

    @Override
    public int getDif(int x,int y){
        return this.calculateService.callDifferent(x,y);
    }

}
