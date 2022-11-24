package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {

        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageWithMock() {

        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszów", 20.8);
        temperaturesMap.put("Kraków", 20.0);
        temperaturesMap.put("Wrocław", 20.0);
        temperaturesMap.put("Warszawa", 20.0);
        temperaturesMap.put("Gdańsk", 20.2);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageOfSensors = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(20.2, averageOfSensors);
    }

    @Test
    void testCalculateMedianWithMock() {

        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszów", 19.0);
        temperaturesMap.put("Kraków", 22.0);
        temperaturesMap.put("Wrocław", 21.0);
        temperaturesMap.put("Warszawa", 18.0);
        temperaturesMap.put("Gdańsk", 20.0);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianOfSensors = weatherForecast.calculateMedian();

        //Then
        Assertions.assertEquals(20, medianOfSensors);
    }
}
