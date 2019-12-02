package chapter6_command.study1;

import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> processedCommands;

    public RemoteControl(int numberOfSlots) {
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];
        processedCommands = new Stack<>();
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
            Optional.ofNullable(onCommands[slot]).ifPresent(cmd -> {
                cmd.execute();
                processedCommands.push(cmd);
            });
        }
    }

    public void offButtonWasPushed(int slot){
        if (isValidSlot(slot)) {
            Optional.ofNullable(offCommands[slot]).ifPresent(cmd -> {
                cmd.execute();
                processedCommands.push(cmd);
            });
        }
    }

    public void undoButtonWasPushed(){
        if (!processedCommands.isEmpty()) processedCommands.pop().undo();
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
