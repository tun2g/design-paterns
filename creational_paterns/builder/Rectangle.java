package creational_paterns.builder;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.height = height;
        this.width = width;
    }

    public void draw(){
        System.out.println(this.width);
        System.out.println(this.height);
    }
}
