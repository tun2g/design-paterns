package creational_paterns.abtract_factory.mac;

import creational_paterns.abtract_factory.interfaces.Button;

public class MacButton implements Button {
    public void click(){
        System.out.println("mac click");
    }
}
