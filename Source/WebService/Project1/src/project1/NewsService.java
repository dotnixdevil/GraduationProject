package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebService;

import oracle.jdbc.driver.OracleDriver;

@WebService(name = "MyWebService1", serviceName = "MyWebService1", portName = "MyWebService1SoapHttpPort")
public class NewsService {
  public NewsService() {
  }

  @WebMethod(exclude = true)
  public int auth(String user,String pass) {
    int x=0;
    try{
   
       int mob=0;
       Connection c=getConnection();
       PreparedStatement p=c.prepareStatement("SELECT * FROM customer WHERE cname=? AND cpass=?");
       p.setString(1, user);
       p.setString(2, pass);
       ResultSet r=p.executeQuery();
       while(r.next())
       {
           if(user.equals(r.getObject("cname").toString()))
           {
         x=1;
         Statement s=c.createStatement();
         ResultSet rr=s.executeQuery("SELECT * FROM STATISTICS");
         PreparedStatement pp=c.prepareStatement("UPDATE STATISTICS SET mobile_st=?");
         while(rr.next())
         {
             mob=Integer.parseInt(rr.getObject("mobile_st").toString());
         }
         mob++;
         pp.setInt(1, mob);
         pp.executeUpdate();
         c.commit();
           }
         c.close();
         
         }
    }catch(Exception e){
           System.out.println(e.getMessage());
         }
       return x;
       
  }
  
    

  
  public String[] getNewsType(String user,String pass)throws Exception{
    String ret[]=null;
    
   Connection c=getConnection();
    Object []v=null;
   List l=new ArrayList();
   
  
   Statement s=c.createStatement();
    ResultSet r=s.executeQuery("SELECT * FROM newstype");
    if(auth(user,pass)==1) {
   
      
      while(r.next())
      {
        l.add(r.getObject("type"));
      }
      v=l.toArray();
      ret=new String[v.length];
    
      for(int i=0;i<v.length;i++) {
        ret[i]=v[i].toString();
      } 
     
    }
    c.close();
    return ret;
    
  }

  @WebMethod(exclude = true)
  public Connection getConnection() throws SQLException {
    String username = "system";
    String password = "tammam";
    String thinConn = "jdbc:oracle:thin:@localhost:1521:XE";
    DriverManager.registerDriver(new OracleDriver());
    Connection conn =
      DriverManager.getConnection(thinConn, username, password);
    conn.setAutoCommit(true);
    return conn;
  }
  public String[] getNewsTitle(String user,String pass,String type) {
   String ret[]=null;
   
   Object [] v=null;
   
   List l=new ArrayList();
   
    try{
        if(auth(user, pass)==1)
        {
          int size=0;
          
        Connection c=getConnection();
        PreparedStatement p=c.prepareStatement("SELECT * FROM news WHERE ntype=? ORDER BY nid DESC");
        p.setString(1, type);
        ResultSet r=p.executeQuery();
        
        while(r.next())
        {
          l.add(r.getObject("tittle"));
          
           
        }
        v=l.toArray();
          ret=new String[v.length];
          
          for(int i=0;i<v.length;i++) {
            ret[i]=v[i].toString();
          } 
        

      
      c.close();
      
        }
    }catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    return ret;
    
    
    }
 
  public String[] getNews(String user,String pass ,String title) {
    Object [] v=null;
    List l=new ArrayList();
    String []ret=null;
    
    
     try{
         if(auth(user, pass)==1)
         {
           int size=0;
         Connection c=getConnection();
         PreparedStatement p=c.prepareStatement("SELECT * FROM news WHERE tittle=?");
         p.setString(1, title);
         ResultSet r=p.executeQuery();
           while(r.next())
           {
             l.add(r.getObject("subject"));      
           }
           v=l.toArray();
           ret=new String[v.length];
           
           for(int i=0;i<v.length;i++) {
             ret[i]=v[i].toString();
           } 
           
         
         
         }
     }catch(Exception e)
     {
         System.out.println(e.getMessage());
     }
     return ret;
     
    
  }




}


