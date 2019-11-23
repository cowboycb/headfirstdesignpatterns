package chapter3_decorator.study2;

public class Beverage {

    protected String description;

    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;


    public String getDescription() {
        description = "";
        if (hasMilk()){
            description += ", Milk";
        }
        if (hasMocha()){
            description += ", Mocha";
        }
        if (hasSoy()){
            description += ", Soy";
        }
        if (hasWhip()){
            description += ", Whip";
        }
        return description;
    }

    public float cost(){

        float total = 0.0f;

        if (hasMilk()){
            total += 0.10f;
        }
        if (hasMocha()){
            total += 0.20f;
        }
        if (hasSoy()){
            total += 0.15f;
        }
        if (hasWhip()){
            total += 0.10f;
        }
        return total;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
