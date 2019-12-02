package chapter6_command.study1;

import java.util.Arrays;
import java.util.Optional;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand;

    public RemoteControl(int numberOfSlots) {
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];
    }

    public RemoteControl(){
        this(7);
    }

    public void setCommand(int slot, Command onCmd, Command offCmd){
        if (slot>=0 && slot<=onCommands.length-1){
            onCommands[slot] = onCmd;
            offCommands[slot] = offCmd;
        }
    }

    public void onButtonWasPushed(int slot){
        if (isValidSlot(slot)) {
            Optional.ofNullable(onCommands[slot]).ifPresent(Command::execute);
            lastCommand = onCommands[slot];
        }
    }

    public void offButtonWasPushed(int slot){
        if (isValidSlot(slot)) {
            Optional.ofNullable(offCommands[slot]).ifPresent(Command::execute);
            lastCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPushed(){
        Optional.ofNullable(lastCommand).ifPresent(Command::undo);
    }

    private boolean isValidSlot(int slot){
        return slot>=0 && slot<=onCommands.length-1;
    }

    @Override
    public String toString() {
        return "RemoteControl\n{\n\t" +
                "onCommands=" + Arrays.toString(onCommands) +
                ",\n\toffCommands=" + Arrays.toString(offCommands) +
                "\n}";
    }
}
