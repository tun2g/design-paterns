package creational_paterns.abtract_factory.mac;

import creational_paterns.abtract_factory.interfaces.Button;
import creational_paterns.abtract_factory.interfaces.CheckBox;
import creational_paterns.abtract_factory.interfaces.GUIFactory;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox(){
        return new MacCheckbox();
    }

}
