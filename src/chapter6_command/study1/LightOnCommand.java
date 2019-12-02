package chapter6_command.study1;

import chapter6_command.study1.Command;
import chapter6_command.study1.receivers.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }

    @Override
    public String toString() {
        return "Light On Command " + light.getName();
    }
}
