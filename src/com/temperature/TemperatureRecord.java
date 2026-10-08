package com.temperature;

public class TemperatureRecord {

    private String date;
    private double temperature;

    public TemperatureRecord(String date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getTemperatureStatus() {

        if (temperature < 15) {
            return "Low";
        } else if (temperature < 30) {
            return "Normal";
        } else if (temperature < 40) {
            return "High";
        } else {
            return "Critical";
        }
    }
}