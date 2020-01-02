package chapter11_proxy.remote.study1;

import chapter10_state.study2.GumballMachine;

public class Test {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(10, "new avm");

        System.out.println(gumballMachine);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
