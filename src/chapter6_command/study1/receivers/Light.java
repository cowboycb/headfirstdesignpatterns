package chapter6_command.study1.receivers;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn(){
        System.out.println(this.name + " Lights turned on...");
    }
    public void turnOff(){
        System.out.println(this.name + " Lights turned off...");
    }

    public String getName() {
        return name;
    }
}
