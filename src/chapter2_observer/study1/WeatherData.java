package chapter2_observer.study1;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherData() {
        currentConditionDisplay = new CurrentConditionDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
    }

    public void measurementsChanged(){

        currentConditionDisplay.update(this.temperature, this.humidity, this.pressure);
        statisticsDisplay.update(this.temperature, this.humidity, this.pressure);
        forecastDisplay.update(this.temperature, this.humidity, this.pressure);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
