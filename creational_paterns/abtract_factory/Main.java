package creational_paterns.abtract_factory;

import creational_paterns.abtract_factory.interfaces.Button;
import creational_paterns.abtract_factory.interfaces.GUIFactory;
import creational_paterns.abtract_factory.mac.MacFactory;
import creational_paterns.abtract_factory.win.WindowFactory;

public class Main {
    public static void main(String[] args){
        AbstractFactory abstractFactory = new AbstractFactory();
        WindowFactory windowFactory = new WindowFactory();
        MacFactory macFactory = new MacFactory();

        abstractFactory.addService(TypeFactory.MAC, macFactory);
        abstractFactory.addService(TypeFactory.WIN, windowFactory);

        GUIFactory factory = abstractFactory.createGUIFactory(TypeFactory.MAC);
        Button button = factory.createButton();
        button.click();
    }
}
