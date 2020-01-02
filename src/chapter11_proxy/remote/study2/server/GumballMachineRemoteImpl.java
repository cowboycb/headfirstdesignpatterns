package chapter11_proxy.remote.study2.server;

import chapter10_state.study2.GumballMachine;
import chapter10_state.study2.State;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Being subclass of UnicastRemoteObject gives the ability to act as a remote service
 */
public class GumballMachineRemoteImpl extends UnicastRemoteObject implements GumballMachineRemote {

    private GumballMachine gumballMachine;

    public GumballMachineRemoteImpl(GumballMachine gumballMachine) throws RemoteException {
        super();
        this.gumballMachine = gumballMachine;
    }

    @Override
    public int getCount() throws RemoteException {
        return gumballMachine.getCount();
    }

    @Override
    public String getLocation() throws RemoteException {
        return gumballMachine.getLocation();
    }

    @Override
    public State getState() throws RemoteException {
        return gumballMachine.getState();
    }

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(10, "new avm");

        System.out.println(gumballMachine);
        try {
            GumballMachineRemote machineRemote = new GumballMachineRemoteImpl(gumballMachine);
            Naming.rebind("//localhost/gumballmachine", machineRemote);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
