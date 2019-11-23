package chapter3_decorator.study4;

public class Decaf extends Beverage {

    public Decaf(){ }
    public Decaf(Size size){
        setSize(size);
    }
    @Override
    public float cost() {
        return 1.05f;
    }

    @Override
    public String getDescription() {
        return getSize().getName() + " " + "Decaf";
    }
}
