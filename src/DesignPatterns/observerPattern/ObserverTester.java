package DesignPatterns.observerPattern;

public class ObserverTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start1");
		WeatherStation2 weatherStation = new WeatherStation2();
		CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherStation);
		HeatIndexDisplay display2 = new HeatIndexDisplay(weatherStation);
		

		weatherStation.setMeasurment(20, 15);
		weatherStation.setMeasurment(22, 20);
		weatherStation.setMeasurment(23, 25);
		weatherStation.setMeasurment(25, 26);
	}

}
