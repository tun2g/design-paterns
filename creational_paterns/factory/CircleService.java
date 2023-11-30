package creational_paterns.factory;

public class CircleService implements IService{


    public CircleService(){

    }
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}
