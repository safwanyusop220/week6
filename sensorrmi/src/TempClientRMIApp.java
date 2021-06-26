import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ftmk.rmi.sensor.TempSensor;

/**
 * This class represent the client-side of RMI application
 * 
 * @author emalianakasmuri
 *
 */
public class TempClientRMIApp {

	public static void main(String[] args) {
		
		
		try {
			
			// get registry
			Registry rmiRegistry = LocateRegistry.getRegistry("localhost",1000);
			
			// Look-up for the remote object
			TempSensor remoteSensorJasin = (TempSensor) rmiRegistry.lookup("SensorJasin");
			
			// Invoke method from the remote object
			int currentTemperature = remoteSensorJasin.getTemperature();
			
			System.out.println("Current temperature in Jasin is " + currentTemperature + " Celcius");
			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
