package chapter7_adapter.study1;

public class UKPlugConnector implements IUKPlugConnector {

    @Override
    public void provideElectricity() {
        System.out.println("electric processing with uk plug....");
    }
}
