package view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichMessage;
import java.sql.*;
import oracle.jdbc.OracleDriver;

public class Support {
  private RichForm form1;
  private RichDocument document1;
  private RichPanelBox panelBox1;
  private RichInputText inputText1;
  private RichInputText inputText2;
  private RichCommandButton commandButton1;
  private RichMessage message1;

  public void setForm1(RichForm form1) {
    this.form1 = form1;
  }

  public RichForm getForm1() {
    return form1;
  }

  public void setDocument1(RichDocument document1) {
    this.document1 = document1;
  }

  public RichDocument getDocument1() {
    return document1;
  }

  public void setPanelBox1(RichPanelBox panelBox1) {
    this.panelBox1 = panelBox1;
  }

  public RichPanelBox getPanelBox1() {
    return panelBox1;
  }

  public void setInputText1(RichInputText inputText1) {
    this.inputText1 = inputText1;
  }

  public RichInputText getInputText1() {
    return inputText1;
  }

  public void setInputText2(RichInputText inputText2) {
    this.inputText2 = inputText2;
  }

  public RichInputText getInputText2() {
    return inputText2;
  }

  public  Connection getConnection() throws SQLException {
    String username = "system";
    String password = "tammam";
    String thinConn = "jdbc:oracle:thin:@localhost:1521:XE";
    DriverManager.registerDriver(new OracleDriver());
    Connection conn =
      DriverManager.getConnection(thinConn, username, password);
    conn.setAutoCommit(true);
    return conn;
  }


  public void setCommandButton1(RichCommandButton commandButton1) {
    this.commandButton1 = commandButton1;
  }

  public RichCommandButton getCommandButton1() {
    return commandButton1;
  }

  public void setMessage1(RichMessage message1) {
    this.message1 = message1;
  }

  public RichMessage getMessage1() {
    return message1;
  }

  public String commandButton1_action() throws SQLException {
    
    Connection c=getConnection();
    String n="";
      try {
        
        
         
        PreparedStatement Admin=c.prepareStatement("SELECT * FROM admin WHERE uname=? AND pass=?");
        PreparedStatement writter=c.prepareStatement("SELECT * FROM Writters WHERE wname=? AND wpass=?");
        Admin.setString(1,inputText1.getValue().toString());
        Admin.setString(2,inputText2.getValue().toString());
        ResultSet r1=Admin.executeQuery();
        writter.setString(1,inputText1.getValue().toString());
        writter.setString(2,inputText2.getValue().toString());
        
        ResultSet r2=writter.executeQuery();
        String n1="";
        String n2="";
        
        while(r1.next()){
          n1=r1.getObject("uname").toString();
          
        }
          while(r2.next()){
            n2=r2.getObject("wname").toString();
            
          }
        if(n1.equals(inputText1.getValue().toString())) {
          n="cp";
          
          return "cp";
          
        }else if(n2.equals(inputText1.getValue().toString())) {
        n="writter";
        
          return "writter";
          
          
        }else{
          message1.setMessage("User Name Or PassWord Incorrect");
          
        }
        
        
          
        }
       catch (SQLException e) {
        message1.setMessageType("error");
        message1.setMessage("Connection Error");
        
        
        
        }finally{
        try{
          c.close();
          
        }catch(Exception e)
        {
          e.printStackTrace();
          
        }
     
   
        
    // Add event code here...
    return n;
    
  }
}
}
