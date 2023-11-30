package creational_paterns.builder;

public interface IRectangleBuilder {
    RectangleBuilder setHeight(int height);

    RectangleBuilder setWidth(int width);

    Rectangle build();
}
