package creational_paterns.singleton;

public class SingleTon {

    private static SingleTon instance;

    private SingleTon(){
        System.out.println("contructor");
    }

    public static SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }
}
