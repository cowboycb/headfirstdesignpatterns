package chapter6_command.study1;

import chapter6_command.study1.receivers.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }

    @Override
    public String toString() {
        return "Garage Door Close Command " + garageDoor.hashCode();
    }
}
