package chapter2_observer.study3_javalib;

import java.util.Observer;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        // First Method for register observers
//        weatherData.addObserver(new CurrentConditionDisplay());
//        weatherData.addObserver(new ForecastDisplay());
//        weatherData.addObserver(new StatisticsDisplay());

        // Second Method for register observers
        Observer o1 = new CurrentConditionDisplay(weatherData);
        Observer o2 = new StatisticsDisplay(weatherData);
        Observer o3 = new ForecastDisplay(weatherData);
        Observer o4 = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(18, 65, 29.7f);
        weatherData.setMeasurements(23, 73, 27.5f);
        weatherData.setMeasurements(27, 85, 28.3f);

    }
}
