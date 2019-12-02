package chapter6_command.study1;

import chapter6_command.study1.receivers.GarageDoor;
import chapter6_command.study1.receivers.Light;

public class Client {

    public static void main(String[] args) {

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand cmdGarageDoor = new GarageDoorOpenCommand(garageDoor);

        Invoker invoker = new Invoker(cmdGarageDoor);

        invoker.process();

        LightOnCommand lightOnCommand = new LightOnCommand(new Light("living room"));
        invoker.setCommand(lightOnCommand);
        invoker.process();

    }
}
