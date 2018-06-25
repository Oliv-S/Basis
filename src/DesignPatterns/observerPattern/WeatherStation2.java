package DesignPatterns.observerPattern;

import java.util.Observable;


public class WeatherStation2 extends Observable{
	
	private float temperature;
	private float himudity;
	
	public WeatherStation2() {
	}

	
	public void measurmentChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurment(float temperature, float himudity) {
		this.temperature = temperature;
		this.himudity = himudity;
		measurmentChanged();
	}
	
	public float getTemperature() {
		return this.temperature;
	}
	
	public float getHimudity() {
		return this.himudity;
	}
}
