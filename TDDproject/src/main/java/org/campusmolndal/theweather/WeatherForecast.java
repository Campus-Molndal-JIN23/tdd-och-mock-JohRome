package org.campusmolndal.theweather;

public class WeatherForecast {
    private final String name;
    private final String description;
    private final double temp;

    public WeatherForecast(String name, String description, double temp) {
        this.name = name;
        this.description = description;
        this.temp = temp;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getTemp() {
        return this.temp;
    }

    @Override
    public String toString() {
        return  "\nTODAYS WEATHER: " +
                "\nCity name: " + this.name +
                "\nDescription: " + this.description +
                "\nTemperature: " + this.temp + "°C";
    }
}
