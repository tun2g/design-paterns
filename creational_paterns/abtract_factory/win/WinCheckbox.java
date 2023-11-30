package creational_paterns.abtract_factory.win;

import creational_paterns.abtract_factory.interfaces.CheckBox;

public class WinCheckbox implements CheckBox {

    @Override
    public void check(){
        System.out.println("win check");
    }
}
