package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
/**
 * This interface represents temperature sensor
 * 
 * @author emalianakasmuri
 *
 */
public interface TempSensor extends Remote {
	
	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	public int getTemperature() throws RemoteException;
	
	public HashMap<String, Integer> getTemperatureForSpecificDay() throws RemoteException;
	
	public float getAverageTemparatureOfTheWeek() throws RemoteException;

}
