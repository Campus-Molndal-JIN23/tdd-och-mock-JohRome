package org.campusmolndal.theweather;

public class WeatherService {
    private SmhiAPI smhiAPI;

    public WeatherService(SmhiAPI smhiAPI) {
        this.smhiAPI = smhiAPI;
    }

    // Fake implementation of a fromJson() method that returns a WeatherForecast object
    public String getTodaysWeather(String city) {
        if (null == city) {
            throw new IllegalArgumentException("City cannot be null");
        }
        if (city.isEmpty()) {
            throw new IllegalArgumentException("City cannot be empty");
        }
        WeatherForecast weatherForecast = new WeatherForecast(city, "Cloudy", 13.37);
        return this.smhiAPI.getWeatherData(weatherForecast);
    }
}
