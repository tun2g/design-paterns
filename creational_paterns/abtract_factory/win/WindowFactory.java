package creational_paterns.abtract_factory.win;

import creational_paterns.abtract_factory.interfaces.Button;
import creational_paterns.abtract_factory.interfaces.CheckBox;
import creational_paterns.abtract_factory.interfaces.GUIFactory;
import creational_paterns.abtract_factory.mac.MacCheckbox;

public class WindowFactory implements GUIFactory {

    @Override
    public Button createButton(){
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckbox(){
        return new MacCheckbox();
    }

}
