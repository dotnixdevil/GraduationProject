package mywebservice1soaphttpport;
import javax.xml.namespace.QName;

public interface MyWebService1 extends java.rmi.Remote {

    /**
     *
     */
    public String[] getNewsTitle(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;

    /**
     *
     */
    public String[] getNews(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;

    /**
     *
     */
    public String[] getNewsType(String arg0, String arg1) throws java.rmi.RemoteException;

}
