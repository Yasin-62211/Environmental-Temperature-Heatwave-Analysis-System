package com.temperature;

import java.util.List;

public class TemperatureAnalyzer {

    public double calculateAverage(List<TemperatureRecord> records) {

        double total = 0;

        for (TemperatureRecord record : records) {
            total += record.getTemperature();
        }

        return total / records.size();
    }

    public double findMaximum(List<TemperatureRecord> records) {

        double maximum = records.get(0).getTemperature();

        for (TemperatureRecord record : records) {
            if (record.getTemperature() > maximum) {
                maximum = record.getTemperature();
            }
        }

        return maximum;
    }

    public double findMinimum(List<TemperatureRecord> records) {

        double minimum = records.get(0).getTemperature();

        for (TemperatureRecord record : records) {
            if (record.getTemperature() < minimum) {
                minimum = record.getTemperature();
            }
        }

        return minimum;
    }

    public boolean isHeatwaveRisk(List<TemperatureRecord> records) {

        int highTemperatureDays = 0;

        for (TemperatureRecord record : records) {

            if (record.getTemperature() >= 35) {
                highTemperatureDays++;
            }
        }

        return highTemperatureDays >= 3;
    }
    public String analyzeTemperatureTrend(List<TemperatureRecord> records) {

        if (records.size() < 2) {
            return "Not enough data to determine trend.";
        }

        double firstTemperature = records.get(0).getTemperature();
        double lastTemperature = records.get(records.size() - 1).getTemperature();

        if (lastTemperature > firstTemperature) {
            return "Temperature is increasing.";
        } else if (lastTemperature < firstTemperature) {
            return "Temperature is decreasing.";
        } else {
            return "Temperature is stable.";
        }
    }
    public void showCategorySummary(List<TemperatureRecord> records) {

        int low = 0;
        int normal = 0;
        int high = 0;
        int critical = 0;

        for (TemperatureRecord record : records) {

            String status = record.getTemperatureStatus();

            switch (status) {
                case "Low":
                    low++;
                    break;

                case "Normal":
                    normal++;
                    break;

                case "High":
                    high++;
                    break;

                case "Critical":
                    critical++;
                    break;
            }
        }

        System.out.println("\nTemperature Category Summary");
        System.out.println("----------------------------");
        System.out.println("Low: " + low);
        System.out.println("Normal: " + normal);
        System.out.println("High: " + high);
        System.out.println("Critical: " + critical);
    }
    public TemperatureRecord findHottestDay(List<TemperatureRecord> records) {

        TemperatureRecord hottest = records.get(0);

        for (TemperatureRecord record : records) {
            if (record.getTemperature() > hottest.getTemperature()) {
                hottest = record;
            }
        }

        return hottest;
    }
}