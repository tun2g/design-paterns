package creational_paterns.builder;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new RectangleBuilder()
                .setHeight(2)
                .setWidth(3)
                .build();
        rectangle.draw();
    }
}
