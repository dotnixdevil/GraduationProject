package mywebservice1soaphttpport;

import javax.xml.rpc.JAXRPCException;
import javax.xml.namespace.QName;
import javax.microedition.xml.rpc.Operation;
import javax.microedition.xml.rpc.Type;
import javax.microedition.xml.rpc.ComplexType;
import javax.microedition.xml.rpc.Element;

public class MyWebService1_Stub implements MyWebService1, javax.xml.rpc.Stub {

    private String[] _propertyNames;
    private Object[] _propertyValues;

    public MyWebService1_Stub() {
        _propertyNames = new String[] { ENDPOINT_ADDRESS_PROPERTY };
        _propertyValues = new Object[] { "http://192.168.0.2:7101/WebService-Project1-context-root/MyWebService1SoapHttpPort" };
    }

    public void _setProperty( String name, Object value ) {
        int size = _propertyNames.length;
        for (int i = 0; i < size; ++i) {
            if( _propertyNames[i].equals( name )) {
                _propertyValues[i] = value;
                return;
            }
        }
        String[] newPropNames = new String[size + 1];
        System.arraycopy(_propertyNames, 0, newPropNames, 0, size);
        _propertyNames = newPropNames;
        Object[] newPropValues = new Object[size + 1];
        System.arraycopy(_propertyValues, 0, newPropValues, 0, size);
        _propertyValues = newPropValues;

        _propertyNames[size] = name;
        _propertyValues[size] = value;
    }

    public Object _getProperty(String name) {
        for (int i = 0; i < _propertyNames.length; ++i) {
            if (_propertyNames[i].equals(name)) {
                return _propertyValues[i];
            }
        }
        if (ENDPOINT_ADDRESS_PROPERTY.equals(name) || USERNAME_PROPERTY.equals(name) || PASSWORD_PROPERTY.equals(name)) {
            return null;
        }
        if (SESSION_MAINTAIN_PROPERTY.equals(name)) {
            return new Boolean(false);
        }
        throw new JAXRPCException("Stub does not recognize property: " + name);
    }

    protected void _prepOperation(Operation op) {
        for (int i = 0; i < _propertyNames.length; ++i) {
            op.setProperty(_propertyNames[i], _propertyValues[i].toString());
        }
    }

    public String[] getNewsTitle(String arg0, String arg1, String arg2) throws java.rmi.RemoteException {
        Object inputObject[] = new Object[] {
            arg0,
            arg1,
            arg2
        };

        Operation op = Operation.newInstance( _qname_operation_getNewsTitle, _type_getNewsTitle, _type_getNewsTitleResponse );
        _prepOperation( op );
        op.setProperty( Operation.SOAPACTION_URI_PROPERTY, "" );
        Object resultObj;
        try {
            resultObj = op.invoke( inputObject );
        } catch( JAXRPCException e ) {
            Throwable cause = e.getLinkedCause();
            if( cause instanceof java.rmi.RemoteException ) {
                throw (java.rmi.RemoteException) cause;
            }
            throw e;
        }

        String[] _res = new String[((Object [])((Object []) resultObj)[0]).length];
        System.arraycopy(((Object []) resultObj)[0], 0, _res, 0, _res.length);
        return _res;
    }

    public String[] getNews(String arg0, String arg1, String arg2) throws java.rmi.RemoteException {
        Object inputObject[] = new Object[] {
            arg0,
            arg1,
            arg2
        };

        Operation op = Operation.newInstance( _qname_operation_getNews, _type_getNews, _type_getNewsResponse );
        _prepOperation( op );
        op.setProperty( Operation.SOAPACTION_URI_PROPERTY, "" );
        Object resultObj;
        try {
            resultObj = op.invoke( inputObject );
        } catch( JAXRPCException e ) {
            Throwable cause = e.getLinkedCause();
            if( cause instanceof java.rmi.RemoteException ) {
                throw (java.rmi.RemoteException) cause;
            }
            throw e;
        }

        String[] _res = new String[((Object [])((Object []) resultObj)[0]).length];
        System.arraycopy(((Object []) resultObj)[0], 0, _res, 0, _res.length);
        return _res;
    }

    public String[] getNewsType(String arg0, String arg1) throws java.rmi.RemoteException {
        Object inputObject[] = new Object[] {
            arg0,
            arg1
        };

        Operation op = Operation.newInstance( _qname_operation_getNewsType, _type_getNewsType, _type_getNewsTypeResponse );
        _prepOperation( op );
        op.setProperty( Operation.SOAPACTION_URI_PROPERTY, "" );
        Object resultObj;
        try {
            resultObj = op.invoke( inputObject );
        } catch( JAXRPCException e ) {
            Throwable cause = e.getLinkedCause();
            if( cause instanceof java.rmi.RemoteException ) {
                throw (java.rmi.RemoteException) cause;
            }
            throw e;
        }

        String[] _res = new String[((Object [])((Object []) resultObj)[0]).length];
        System.arraycopy(((Object []) resultObj)[0], 0, _res, 0, _res.length);
        return _res;
    }

    protected static final QName _qname_operation_getNewsType = new QName( "http://project1/", "getNewsType" );
    protected static final QName _qname_operation_getNews = new QName( "http://project1/", "getNews" );
    protected static final QName _qname_operation_getNewsTitle = new QName( "http://project1/", "getNewsTitle" );
    protected static final QName _qname_getNewsType = new QName( "http://project1/", "getNewsType" );
    protected static final QName _qname_getNews = new QName( "http://project1/", "getNews" );
    protected static final QName _qname_getNewsTitleResponse = new QName( "http://project1/", "getNewsTitleResponse" );
    protected static final QName _qname_getNewsResponse = new QName( "http://project1/", "getNewsResponse" );
    protected static final QName _qname_getNewsTypeResponse = new QName( "http://project1/", "getNewsTypeResponse" );
    protected static final QName _qname_getNewsTitle = new QName( "http://project1/", "getNewsTitle" );
    protected static final Element _type_getNewsType;
    protected static final Element _type_getNews;
    protected static final Element _type_getNewsTypeResponse;
    protected static final Element _type_getNewsTitle;
    protected static final Element _type_getNewsResponse;
    protected static final Element _type_getNewsTitleResponse;

    static {
        _type_getNewsType = new Element( _qname_getNewsType, _complexType( new Element[] {
            new Element( new QName( "", "arg0" ), Type.STRING, 0, 1, false ),
            new Element( new QName( "", "arg1" ), Type.STRING, 0, 1, false )}), 1, 1, false );
        _type_getNews = new Element( _qname_getNews, _complexType( new Element[] {
            new Element( new QName( "", "arg0" ), Type.STRING, 0, 1, false ),
            new Element( new QName( "", "arg1" ), Type.STRING, 0, 1, false ),
            new Element( new QName( "", "arg2" ), Type.STRING, 0, 1, false )}), 1, 1, false );
        _type_getNewsTitleResponse = new Element( _qname_getNewsTitleResponse, _complexType( new Element[] {
            new Element( new QName( "", "return" ), Type.STRING, 0, Element.UNBOUNDED, false )}), 1, 1, false );
        _type_getNewsTypeResponse = new Element( _qname_getNewsTypeResponse, _complexType( new Element[] {
            new Element( new QName( "", "return" ), Type.STRING, 0, Element.UNBOUNDED, false )}), 1, 1, false );
        _type_getNewsResponse = new Element( _qname_getNewsResponse, _complexType( new Element[] {
            new Element( new QName( "", "return" ), Type.STRING, 0, Element.UNBOUNDED, false )}), 1, 1, false );
        _type_getNewsTitle = new Element( _qname_getNewsTitle, _complexType( new Element[] {
            new Element( new QName( "", "arg0" ), Type.STRING, 0, 1, false ),
            new Element( new QName( "", "arg1" ), Type.STRING, 0, 1, false ),
            new Element( new QName( "", "arg2" ), Type.STRING, 0, 1, false )}), 1, 1, false );
    }

    private static ComplexType _complexType( Element[] elements ) {
        ComplexType result = new ComplexType();
        result.elements = elements;
        return result;
    }
}
