package chapter7_adapter.study1;

public class EuropeToUKPlugConnectorAdapter implements IUKPlugConnector {
    private IEuropePlugConnector europePlugConnector;

    public EuropeToUKPlugConnectorAdapter(IEuropePlugConnector europePlugConnector) {
        this.europePlugConnector = europePlugConnector;
    }

    @Override
    public void provideElectricity() {
        europePlugConnector.giveElectricity();
    }
}
