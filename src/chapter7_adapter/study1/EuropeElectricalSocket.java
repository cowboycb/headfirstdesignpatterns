package chapter7_adapter.study1;

public class EuropeElectricalSocket {

    public void plugIn(IEuropePlugConnector connector){
        connector.giveElectricity();
    }

}
