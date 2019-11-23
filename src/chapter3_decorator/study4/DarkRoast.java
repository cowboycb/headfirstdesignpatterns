package chapter3_decorator.study4;

public class DarkRoast extends Beverage {

    public DarkRoast(){ }
    public DarkRoast(Size size){
        setSize(size);
    }

    @Override
    public float cost() {
        return 0.99f;
    }

    @Override
    public String getDescription() {
        return getSize().getName() + " " + "DarkRoast";
    }
}
