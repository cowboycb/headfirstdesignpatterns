package chapter2_observer.study1;

public class ForecastDisplay {

    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.printf("ForecastDisplay updated with values: \n Temperature: %f degree, \n Humidity: %f, \n Pressure: %f\n\n",
                this.temperature, this.humidity, this.pressure);
    }

}
