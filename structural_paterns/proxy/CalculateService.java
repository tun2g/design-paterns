package structural_paterns.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculateService {

    public int callSum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public int callDifferent(int x, int y){
        int dif =  x- y;
        return dif;
    }


}
