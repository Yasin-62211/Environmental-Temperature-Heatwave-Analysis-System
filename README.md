# Environmental Temperature & Heatwave Analysis System

## About the Project

The Environmental Temperature & Heatwave Analysis System is a Java-based application designed to analyze temperature data and provide useful environmental information.

The system allows users to enter temperature records for different dates and automatically analyzes the collected data.

## Features

- Enter temperature records for multiple dates
- Calculate average temperature
- Find minimum temperature
- Find maximum temperature
- Identify the hottest day
- Classify temperature as Low, Normal, High, or Critical
- Analyze temperature trends
- Detect potential heatwave risk
- Display temperature category summary

## Temperature Classification

| Temperature | Status |
|-------------|--------|
| Below 15°C | Low |
| 15°C - 29.9°C | Normal |
| 30°C - 39.9°C | High |
| 40°C or above | Critical |

## Heatwave Risk

The system marks a high heatwave risk when at least three recorded temperature values are 35°C or higher.

This is a simplified analytical rule used for this project and is not an official heatwave definition.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- IntelliJ IDEA
- Java Collections Framework

## Project Structure

```text
EnvironmentalTemperatureAnalysis
│
└── src
    └── com.temperature
        ├── Main.java
        ├── TemperatureRecord.java
        └── TemperatureAnalyzer.java
## Purpose

This project demonstrates how programming and basic data analysis can be applied to environmental temperature monitoring.

## Author

**Md. Yasin**

Bachelor's Degree Programme in Environmental Science and Civil Protection  
Università Politecnica delle Marche, Italy
