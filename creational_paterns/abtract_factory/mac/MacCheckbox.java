package creational_paterns.abtract_factory.mac;

import creational_paterns.abtract_factory.interfaces.CheckBox;

public class MacCheckbox implements CheckBox {
    @Override
    public void check(){
        System.out.println("mac check");
    }
}
