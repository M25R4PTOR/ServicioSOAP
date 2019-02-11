package com.smartbear;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class UsarServicio {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete14/webservices/Service.asmx?wsdl";
		SampleWebServiceSoapStub servicio = new SampleWebServiceSoapStub(new URL(url), null);
		String resultado = servicio.helloWorld();

		System.out.println("Resultado: " + resultado);
	}
}
