package creational_paterns.abtract_factory.win;

import creational_paterns.abtract_factory.interfaces.Button;

public class WindowButton implements Button {

    @Override
    public void click(){
        System.out.println("win click");
    }
}
