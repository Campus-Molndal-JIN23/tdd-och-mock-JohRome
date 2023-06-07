[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/-Un0hjO8)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=11299649)
# Project name
tdd-och-mock-JohRome

## Description
By the usage of TDD i can be more sure that my application provides robust and more accurate weather forecasts and thrives to retrieve accurate weather information about a specific city.
I learned that mocking can be quite fun and useful when you fake your API responses.

## Usage
Click on the green <> Code -button and download as .zip.
Open the map and then open the java class of your liking and explore.

## Dependencies
Take a futher look inside the pom.xml file

## Test Report

## Test Summary

| Test ID | Test Description | Expected Result | Actual Result | Status | Comments |
|---------|-----------------|-----------------|---------------|--------|----------|
| 1       | Passing null value to `getTodaysWeather(String)` | An `IllegalArgumentException` | An `IllegalArgumentException` |   OK    |     No problems identified     |
| 2       | Passing empty String to `getTodaysWeather(String)` | An `IllegalArgumentException` | An `IllegalArgumentException` |   OK    |     No problems identified     |
| 3       | Method call of `getTodaysWeather(String)` returns result | Weather description | Weather description |   OK    |     No problems identified     |
| 4       | Assuring positive temperature is shown | "Temperature: 13.37°C" | "Temperature: 13.37°C" |   OK    |     No problems identified     |
| 5       | Assuring negative temperature is shown | "Temperature: -40.3°C" | "Temperature: -40.3°C" |   OK    |     No problems identified     |


