package creational_paterns.factory;

public class RectangleService implements IService{

    public RectangleService(){

    }

    @Override
    public void draw(){
        System.out.println("Rectangle");
    }
}
