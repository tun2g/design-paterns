package creational_paterns.abtract_factory;

import creational_paterns.abtract_factory.interfaces.GUIFactory;

import java.util.HashMap;
import java.util.Map;

public class AbstractFactory {

    private Map<TypeFactory, GUIFactory> serviceMapping;

    public AbstractFactory(){
        this.serviceMapping = new HashMap<>();
    }

    public void addService(TypeFactory typeFactory, GUIFactory guiFactory){
        this.serviceMapping.put(typeFactory,guiFactory);
    }

    GUIFactory createGUIFactory(TypeFactory typeFactory){
        return this.serviceMapping.get(typeFactory);
    }
}
