package Observation_pattern;

public class Weather {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        Current current=new Current(weatherData);
        weatherData.setmeasurements(80,60,30.4f);
        weatherData.setmeasurements(82,70,29.2f);
        weatherData.setmeasurements(78,90,29.2f);
    }
}
