package chapter7_adapter.study1;

public class UKElectricalSocket {

    public void plugIn(IUKPlugConnector connector){
        connector.provideElectricity();
    }

}
