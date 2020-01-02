package chapter11_proxy.remote.study2.client;

import chapter11_proxy.remote.study2.server.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Test {

    public static void main(String[] args) {

        try {
            String machineUrl = "rmi://localhost/gumballmachine";
            Remote proxy = Naming.lookup(machineUrl);
            System.out.println("Remote object = " + proxy);

            GumballMachineRemote machineRemote = (GumballMachineRemote)proxy;

            GumballMonitorClient client = new GumballMonitorClient(machineRemote);
            client.report();

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
