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
		System.out.println("��� : ���� ���� �µ� : " + (temperature+humidity)/2 + " ���� : " + humidity);
	}

	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
