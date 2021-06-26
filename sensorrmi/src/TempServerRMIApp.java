import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ftmk.rmi.sensor.TempSensor;
import ftmk.rmi.sensor.manager.TempSensorManager;

/**
 * This class represent the server-side application using RMI
 * 
 * @author emalianakasmuri
 *
 */
public class TempServerRMIApp {

	public static void main(String[] args) {
		
		
		try {
			
			// Create interface object
			TempSensor sensorJasin = new TempSensorManager();
			
			// Get registry
			Registry rmiRegistry = LocateRegistry.createRegistry(1000);
			
			// Register interface object as remote object
			rmiRegistry.rebind("SensorJasin", sensorJasin);
			
			System.out.println("SensorJasin is successfully registered");
			
			TempSensor sensorAyerKeroh = new TempSensorManager();
			
			rmiRegistry.rebind("SensorAyerKeroh", sensorAyerKeroh);
			
			System.out.println("Sensor AyerKeroh is successfully registered");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
