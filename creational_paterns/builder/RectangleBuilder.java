package creational_paterns.builder;

public class RectangleBuilder implements IRectangleBuilder{
    private int height;
    private int width;

    @Override
    public RectangleBuilder setHeight(int height){
        this.height = height;
        return this;
    }

    @Override
    public RectangleBuilder setWidth(int width){
        this.width = width;
        return this;
    }

    @Override
    public Rectangle build(){
        return new Rectangle(this.width,this.height);
    }

}
