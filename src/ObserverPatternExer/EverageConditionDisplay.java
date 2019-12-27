package ObserverPatternExer;

public class EverageConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public EverageConditionDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("평균 : 지금 상태 온도 : " + (temperature+humidity)/2 + " 습도 : " + humidity);
	}

	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
