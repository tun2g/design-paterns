package creational_paterns.factory;

import java.util.HashMap;
import java.util.Map;

public class ServiceFactory {
    private Map<TypeService,IService> serviceMapping;

    public ServiceFactory(){
        this.serviceMapping = new HashMap<>();
        RectangleService rectangleService = new RectangleService();
        CircleService circleService = new CircleService();
        this.serviceMapping.put(TypeService.RECTANGLE, rectangleService);
        this.serviceMapping.put(TypeService.CIRCLE, circleService);
    }

    public IService createService(TypeService type){
        return this.serviceMapping.get(type);
    }

}
