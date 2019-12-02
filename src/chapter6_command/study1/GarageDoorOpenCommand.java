package chapter6_command.study1;

import chapter6_command.study1.receivers.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }

    @Override
    public String toString() {
        return "Garage Door Open Command " + garageDoor.hashCode();
    }
}
