package chapter7_adapter.study1;

public class AdapterTest {

    public static void main(String[] args) {
        IUKPlugConnector ukPlugConnector = new UKPlugConnector();
        IEuropePlugConnector europePlugConnector = new EuropePlugConnector();

        EuropeElectricalSocket europeSocket = new EuropeElectricalSocket();
        europeSocket.plugIn(europePlugConnector);


        UKElectricalSocket ukSocket = new UKElectricalSocket();
        ukSocket.plugIn(ukPlugConnector);

        // Europe plug acting like UK plug with adapter
        IUKPlugConnector adapter4UK = new EuropeToUKPlugConnectorAdapter(europePlugConnector);
        ukSocket.plugIn(adapter4UK);
    }
}
