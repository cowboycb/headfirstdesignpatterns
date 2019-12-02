package chapter6_command.study1;

public class Invoker {

    private Command command;
    private int counter;

    public Invoker(Command command) {
        this.command = command;
    }

    public Invoker(){}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void process(){
        System.out.println("Checking and processing command " + (++counter));
        command.execute();
    }
}
