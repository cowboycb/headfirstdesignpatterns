package chapter3_decorator.study4;

public abstract class Beverage {

    private String description;
    private Size size;

    public String getDescription() {
        return "Undefined";
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract float cost();
}
