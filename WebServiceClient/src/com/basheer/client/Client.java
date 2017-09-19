package com.basheer.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;

import com.basheer.service.Calculator;
import com.basheer.service.CalculatorProxy;
import com.basheer.service.CalculatorService;
import com.basheer.service.CalculatorServiceLocator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*try {
			//CalculatorProxy proxy = new CalculatorProxy();
			//System.out.println("add :"+proxy.add(40, 50));
			
			
			CalculatorServiceLocator service = new CalculatorServiceLocator();

			//Calculator proxy = service.getP
			//((BindingProvider)proxy).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/JaxwsProject/services/Calculator");
			//System.out.println("GUID :"+proxy.add(50, 55));
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
