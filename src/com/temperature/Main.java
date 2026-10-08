package com.temperature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<TemperatureRecord> records = new ArrayList<>();

        System.out.println("========================================");
        System.out.println(" Environmental Temperature Analysis");
        System.out.println("========================================");

        System.out.print("Enter number of temperature records: ");
        int numberOfRecords = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfRecords; i++) {

            System.out.println("\nRecord " + i);

            System.out.print("Enter date: ");
            String date = scanner.nextLine();

            System.out.print("Enter temperature in Celsius: ");
            double temperature = scanner.nextDouble();
            scanner.nextLine();

            TemperatureRecord record =
                    new TemperatureRecord(date, temperature);

            records.add(record);
        }

        TemperatureAnalyzer analyzer = new TemperatureAnalyzer();

        double average = analyzer.calculateAverage(records);
        double maximum = analyzer.findMaximum(records);
        double minimum = analyzer.findMinimum(records);
        boolean heatwaveRisk = analyzer.isHeatwaveRisk(records);

        String temperatureTrend = analyzer.analyzeTemperatureTrend(records);

        analyzer.showCategorySummary(records);
        TemperatureRecord hottestDay =
                analyzer.findHottestDay(records);

        System.out.println("\n========================================");
        System.out.println(" Temperature Analysis Report");
        System.out.println("========================================");

        for (TemperatureRecord record : records) {

            System.out.println(
                    record.getDate()
                            + " | "
                            + record.getTemperature()
                            + "°C | "
                            + record.getTemperatureStatus()
            );
        }

        System.out.println("----------------------------------------");
        System.out.printf("Average Temperature: %.2f°C%n", average);
        System.out.println("Maximum Temperature: " + maximum + "°C");

        System.out.println(
                "Hottest Day: "
                        + hottestDay.getDate()
                        + " ("
                        + hottestDay.getTemperature()
                        + "°C)"
        );
        System.out.println("Minimum Temperature: " + minimum + "°C");

        System.out.println("Temperature Trend: " + temperatureTrend);

        if (heatwaveRisk) {
            System.out.println("Heatwave Risk: HIGH");
        } else {
            System.out.println("Heatwave Risk: LOW");
        }

        System.out.println("========================================");

        scanner.close();
    }
}