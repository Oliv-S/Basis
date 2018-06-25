package DesignPatterns.observerPattern;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherStation extends Observable{
	
	private float temperature;
	private float himudity;
	
	private ArrayList<Observer> observers;

	public WeatherStation() {
		observers = new ArrayList<>();
	}

	@Override
	public synchronized void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		if (observer!=null)
			observers.add(observer);
		else
			throw new IllegalArgumentException("Observer cannot be null");
	}

	@Override
	public synchronized void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		//super.deleteObserver(observer);
		if (observers.contains(observer))
			observers.remove(observer);
		else throw new IllegalArgumentException("The is no registred Observer: " + observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		//super.notifyObservers();
		for (Observer observer : observers) {
			observer.update(this, null);
		}
	}
	
	public void measurmentChanged() {
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
