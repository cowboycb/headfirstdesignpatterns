package chapter4_factory.study3_factorymethod;

public abstract class Pizza {

    public abstract void prepare();
    public void bake(){
        System.out.println("Pizza is baked.");
    }
    public void cut(){
        System.out.println("Pizza is cut.");
    }
    public void box(){
        System.out.println("Pizza is boxed.");
    }
}
