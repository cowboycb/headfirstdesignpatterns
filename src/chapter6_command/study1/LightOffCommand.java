package chapter6_command.study1;

import chapter6_command.study1.receivers.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }

    @Override
    public String toString() {
        return "Light Off Command " + light.getName();
    }
}
