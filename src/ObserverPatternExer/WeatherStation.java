package ObserverPatternExer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		EverageConditionDisplay eveDisplay = new EverageConditionDisplay(weatherData);
		weatherData.setMeasurements(10.0f, 20.0f, 30.0f);
		weatherData.setMeasurements(12.0f, 22.0f, 32.0f);
		weatherData.removeObserver(eveDisplay);
		weatherData.setMeasurements(13.0f, 23.0f, 33.0f);
		
	}
}
