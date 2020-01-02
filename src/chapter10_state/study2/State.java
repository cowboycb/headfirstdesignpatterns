package chapter10_state.study2;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
