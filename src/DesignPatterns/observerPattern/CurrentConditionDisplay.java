package DesignPatterns.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer{
	private WeatherStation2 weatherStation;
	private float temperature;
	private float himudity;
	
	
	public CurrentConditionDisplay(WeatherStation2 weatherStation) {
		super();
		this.weatherStation = weatherStation;
		weatherStation.addObserver(this);
	}


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.temperature = ((WeatherStation2)o).getTemperature();
		this.himudity = ((WeatherStation2)o).getHimudity();
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature + " grad.C and " + himudity + "%");
	}

}
