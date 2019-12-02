package chapter6_command.study1;

import chapter6_command.study1.receivers.GarageDoor;
import chapter6_command.study1.receivers.Light;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        System.out.println(remoteControl);

        Light livingRoom = new Light("living room");
        Light kitchen = new Light("kitchen");
        GarageDoor garageDoor = new GarageDoor();

        GarageDoorOpenCommand cmdOpenGarage = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand cmdCloseGarage = new GarageDoorCloseCommand(garageDoor);

        LightOnCommand lightOnLivingRoom = new LightOnCommand(livingRoom);
        LightOffCommand lightOffLivingRoom = new LightOffCommand(livingRoom);

        LightOnCommand lightOnKitchen = new LightOnCommand(kitchen);
        LightOffCommand lightOffKitchen = new LightOffCommand(kitchen);

        remoteControl.setCommand(1, lightOnKitchen, lightOffKitchen);
        remoteControl.setCommand(2, lightOnLivingRoom, lightOffLivingRoom);
        remoteControl.setCommand(3, cmdOpenGarage, cmdCloseGarage);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(4); // empty slot

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();

    }
}
