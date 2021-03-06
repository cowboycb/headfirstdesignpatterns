package chapter2_observer.study3_javalib;


import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Display{

    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay() {
    }

    public ForecastDisplay(Observable subject) {
        subject.addObserver(this);
    }

    public void update(float temp, float humidity, float pressure){

    }

    public void display(){
        System.out.printf("ForecastDisplay updated with values: \n Temperature: %f degree, \n Humidity: %f, \n Pressure: %f\n\n",
                this.temperature, this.humidity, this.pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData w = (WeatherData)o;
            this.temperature = w.getTemperature();
            this.humidity = w.getHumidity();
            this.pressure = w.getPressure();
            display();
        }
    }
}
