package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {

        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            //adding 1 Celsius degree to current value
            //as a temporary weather forecast

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverage() {

        double average = 0.0;
        double sum = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            sum = sum + temperature.getValue();
            average = sum / temperatures.getTemperatures().size();
        }
        return average;
    }

    public double calculateMedian() {

        double median = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            List<Double> values = temperature.getValue();
            Double[] doubleArray = values.toArray(new Double[0]);
            Arrays.sort(doubleArray);
            if (doubleArray.length % 2 == 0) {
                median = ((double) doubleArray[doubleArray.length/2] + (double)doubleArray[doubleArray.length/2-1])/2;
            } else {
                median = ((double) doubleArray[doubleArray.length/2]);
            }
        }
        return median;
    }
}
