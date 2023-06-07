package org.campusmolndal.theweather;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

/**
 * Unit tests for the {@link WeatherService} class.
 */
class WeatherServiceTest {

    private SmhiAPI smhiAPIMock;
    private WeatherService sut;

    /**
     * Sets up the test environment by creating a mock instance of {@link SmhiAPI}
     * and initializing the {@link WeatherService} under test with the mock.
     */
    @BeforeEach
    void setUp() {
        smhiAPIMock = mock(SmhiAPI.class);
        sut = new WeatherService(smhiAPIMock);

        when(smhiAPIMock.getWeatherData(Mockito.any(WeatherForecast.class)))
                .thenReturn("TODAYS WEATHER: \nCity name: Gothenburg\nDescription: Cloudy\nTemperature: 13.37°C");
    }

    /**
     * Verifies that passing a null city to {@link WeatherService#getTodaysWeather(String)}
     * throws an {@link IllegalArgumentException}.
     */
    @Test
    void nullCityShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            sut.getTodaysWeather(null);
        });
    }

    /**
     * Verifies that passing an empty city to {@link WeatherService#getTodaysWeather(String)}
     * throws an {@link IllegalArgumentException}.
     */
    @Test
    void emptyCityShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            sut.getTodaysWeather("");
        });
    }

    /**
     * Verifies that calling {@link WeatherService#getTodaysWeather(String)} with a valid city
     * returns a non-null result.
     */
    @Test
    void getTodaysWeatherShouldReturnAResult() {
        String searchResult = sut.getTodaysWeather("Gothenburg");
        assertNotNull(searchResult);
    }

    /**
     * Verifies that calling {@link WeatherService#getTodaysWeather(String)} with the city "Gothenburg"
     * returns a result that contains the correct temperature.
     */
    @Test
    void getTodaysWeatherFromGothenburgShouldReturnCorrectTemperature() {
        String searchResult = sut.getTodaysWeather("Gothenburg");
        assertTrue(searchResult.contains("Temperature: 13.37°C"));
    }

    /**
     * Verifies that calling {@link WeatherService#getTodaysWeather(String)} with the city "Yakutsk"
     * returns a result that contains the correct temperature. The weather data for "Yakutsk" is stubbed
     * to simulate a negative temperature.
     */
    @Test
    void getTodaysWeatherFromYaktuskShouldReturnCorrectTemperature() {
        when(smhiAPIMock.getWeatherData(Mockito.any(WeatherForecast.class)))
                .thenReturn("TODAYS WEATHER: \nCity name: Yakutsk\nDescription: Cloudy\nTemperature: -40.3°C");
        String searchResult = sut.getTodaysWeather("Yakutsk");
        assertTrue(searchResult.contains("Temperature: -40.3°C"));
    }
}
