package chapter11_proxy.remote.study2.client;

import chapter11_proxy.remote.study2.server.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitorClient {

    GumballMachineRemote machineRemote;

    public GumballMonitorClient(GumballMachineRemote machineRemote) {
        this.machineRemote = machineRemote;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: " + machineRemote.getLocation());
            System.out.println("Current Inventory: " + machineRemote.getCount() + " gumballs");
            System.out.println("Current State: " + machineRemote.getState());
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
