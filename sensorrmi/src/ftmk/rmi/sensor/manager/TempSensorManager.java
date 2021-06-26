package ftmk.rmi.sensor.manager;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

import ftmk.rmi.sensor.TempSensor;

/**
 * This class manage the value of temperature from the sensor.
 * 
 * @author emalianakasmuri
 *
 */
public class TempSensorManager extends UnicastRemoteObject implements TempSensor {
	
	// temperatures for 7 days.
	private HashMap<String, Integer> temperatures = new HashMap<>();

	public TempSensorManager() throws RemoteException {
		super();
		// set the temperature whenever the object created.
		setTemperatures();
		
	}

	@Override
	public int getTemperature() throws RemoteException {
		
		return 35;
	}
	
	// return temperature of 7 day
	public HashMap<String, Integer> getTemperatureForSpecificDay() throws RemoteException{
		return temperatures;
		
	}
	
	// set the temperatures in hashmap
	public void setTemperatures() {
		temperatures.put("Monday", 32);
		temperatures.put("Tuesday", 31);
		temperatures.put("Wenesday", 33);
		temperatures.put("Thursday", 35);
		temperatures.put("Friday", 36);
		temperatures.put("Saturday", 33);
		temperatures.put("Sunday", 33);
	}
	
	// calculate and return the average temperature 
	public float getAverageTemparatureOfTheWeek() throws RemoteException{
		
		float totalTemperature = 0;
		for(int temperature: temperatures.values()) {
			totalTemperature += temperature;
		}
		return totalTemperature/temperatures.size();
		
	}

}