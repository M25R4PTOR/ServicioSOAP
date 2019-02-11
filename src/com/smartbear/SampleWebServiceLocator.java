/**
 * SampleWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.smartbear;

public class SampleWebServiceLocator extends org.apache.axis.client.Service implements com.smartbear.SampleWebService {

/**
 * This sample web service is used to demonstrate how to test web
 * services with SmartBear's TestComplete.
 */

    public SampleWebServiceLocator() {
    }


    public SampleWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SampleWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SampleWebServiceSoap
    private java.lang.String SampleWebServiceSoap_address = "http://secure.smartbearsoftware.com/samples/testcomplete14/webservices/Service.asmx";

    public java.lang.String getSampleWebServiceSoapAddress() {
        return SampleWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SampleWebServiceSoapWSDDServiceName = "SampleWebServiceSoap";

    public java.lang.String getSampleWebServiceSoapWSDDServiceName() {
        return SampleWebServiceSoapWSDDServiceName;
    }

    public void setSampleWebServiceSoapWSDDServiceName(java.lang.String name) {
        SampleWebServiceSoapWSDDServiceName = name;
    }

    public com.smartbear.SampleWebServiceSoap getSampleWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SampleWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSampleWebServiceSoap(endpoint);
    }

    public com.smartbear.SampleWebServiceSoap getSampleWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.smartbear.SampleWebServiceSoapStub _stub = new com.smartbear.SampleWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getSampleWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSampleWebServiceSoapEndpointAddress(java.lang.String address) {
        SampleWebServiceSoap_address = address;
    }


    // Use to get a proxy class for SampleWebServiceSoap12
    private java.lang.String SampleWebServiceSoap12_address = "http://secure.smartbearsoftware.com/samples/testcomplete14/webservices/Service.asmx";

    public java.lang.String getSampleWebServiceSoap12Address() {
        return SampleWebServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SampleWebServiceSoap12WSDDServiceName = "SampleWebServiceSoap12";

    public java.lang.String getSampleWebServiceSoap12WSDDServiceName() {
        return SampleWebServiceSoap12WSDDServiceName;
    }

    public void setSampleWebServiceSoap12WSDDServiceName(java.lang.String name) {
        SampleWebServiceSoap12WSDDServiceName = name;
    }

    public com.smartbear.SampleWebServiceSoap getSampleWebServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SampleWebServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSampleWebServiceSoap12(endpoint);
    }

    public com.smartbear.SampleWebServiceSoap getSampleWebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.smartbear.SampleWebServiceSoap12Stub _stub = new com.smartbear.SampleWebServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getSampleWebServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSampleWebServiceSoap12EndpointAddress(java.lang.String address) {
        SampleWebServiceSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.smartbear.SampleWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.smartbear.SampleWebServiceSoapStub _stub = new com.smartbear.SampleWebServiceSoapStub(new java.net.URL(SampleWebServiceSoap_address), this);
                _stub.setPortName(getSampleWebServiceSoapWSDDServiceName());
                return _stub;
            }
            if (com.smartbear.SampleWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.smartbear.SampleWebServiceSoap12Stub _stub = new com.smartbear.SampleWebServiceSoap12Stub(new java.net.URL(SampleWebServiceSoap12_address), this);
                _stub.setPortName(getSampleWebServiceSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SampleWebServiceSoap".equals(inputPortName)) {
            return getSampleWebServiceSoap();
        }
        else if ("SampleWebServiceSoap12".equals(inputPortName)) {
            return getSampleWebServiceSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://smartbear.com", "SampleWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://smartbear.com", "SampleWebServiceSoap"));
            ports.add(new javax.xml.namespace.QName("http://smartbear.com", "SampleWebServiceSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SampleWebServiceSoap".equals(portName)) {
            setSampleWebServiceSoapEndpointAddress(address);
        }
        else 
if ("SampleWebServiceSoap12".equals(portName)) {
            setSampleWebServiceSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
