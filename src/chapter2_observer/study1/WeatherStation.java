package chapter2_observer.study1;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        weatherData.setMeasurements(18, 65, 29.7f);
        weatherData.setMeasurements(23, 73, 27.5f);
        weatherData.setMeasurements(27, 85, 28.3f);

    }
}
