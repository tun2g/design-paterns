package creational_paterns.factory;

public class Main {
    public static void main(String[] args){
        ServiceFactory serviceFactory = new ServiceFactory();
        IService service = serviceFactory.createService(TypeService.RECTANGLE);
        service.draw();
    }
}
