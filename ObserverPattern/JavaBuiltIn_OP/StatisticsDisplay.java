package ObserverPattern.JavaBuiltIn_OP;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			float actualTemp = weatherData.getTemperature();
			tempSum += actualTemp;
			numReadings++;

			if ( actualTemp > maxTemp) {
				maxTemp = actualTemp;
			}
	
			if (actualTemp < minTemp) {
				minTemp = actualTemp;
			}
			display();
		}
		
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}