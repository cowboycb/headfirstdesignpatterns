package chapter11_proxy.remote.study1;

import chapter10_state.study2.GumballMachine;

public class GumballMonitor {
    private GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current Inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current State: " + gumballMachine.getState());
    }
}
