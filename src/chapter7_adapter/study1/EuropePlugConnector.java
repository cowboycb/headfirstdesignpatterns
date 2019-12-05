package chapter7_adapter.study1;

public class EuropePlugConnector implements IEuropePlugConnector {
    @Override
    public void giveElectricity() {
        System.out.println("electric processing with europe plug....");
    }
}
