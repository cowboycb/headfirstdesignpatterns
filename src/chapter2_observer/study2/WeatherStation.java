package chapter2_observer.study2;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        // First Method for register
//        weatherData.registerObserver(new CurrentConditionDisplay());
//        weatherData.registerObserver(new ForecastDisplay());
//        weatherData.registerObserver(new StatisticsDisplay());

        // Second Method for register
        Observer o1 = new CurrentConditionDisplay(weatherData);
        Observer o2 = new StatisticsDisplay(weatherData);
        Observer o3 = new ForecastDisplay(weatherData);
        Observer o4 = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(18, 65, 29.7f);
        weatherData.setMeasurements(23, 73, 27.5f);
        weatherData.setMeasurements(27, 85, 28.3f);

    }
}
