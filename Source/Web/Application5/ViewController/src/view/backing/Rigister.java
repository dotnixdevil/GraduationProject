package view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichMessage;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import java.sql.*;
import oracle.jdbc.OracleDriver;

public class Rigister {
  private RichForm form1;
  private RichDocument document1;
  private RichInputText inputText1;
  private RichInputText inputText2;
  private RichInputText inputText3;
  private RichInputText inputText4;
  private RichInputText inputText5;
  private RichOutputText outputText1;
  private RichOutputText outputText2;
  private RichOutputText outputText3;
  private RichInputText inputText6;
  private RichOutputText outputText4;
  private RichOutputText outputText5;
  private RichOutputText outputText6;
  private RichOutputText outputText7;
  private RichInputDate inputDate1;
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

  public void setInputText3(RichInputText inputText3) {
    this.inputText3 = inputText3;
  }

  public RichInputText getInputText3() {
    return inputText3;
  }

  public void setInputText4(RichInputText inputText4) {
    this.inputText4 = inputText4;
  }

  public RichInputText getInputText4() {
    return inputText4;
  }

  public void setInputText5(RichInputText inputText5) {
    this.inputText5 = inputText5;
  }

  public RichInputText getInputText5() {
    return inputText5;
  }

  public void setOutputText1(RichOutputText outputText1) {
    this.outputText1 = outputText1;
  }

  public RichOutputText getOutputText1() {
    return outputText1;
  }

  public void setOutputText2(RichOutputText outputText2) {
    this.outputText2 = outputText2;
  }

  public RichOutputText getOutputText2() {
    return outputText2;
  }

  public void setOutputText3(RichOutputText outputText3) {
    this.outputText3 = outputText3;
  }

  public RichOutputText getOutputText3() {
    return outputText3;
  }

  public void setInputText6(RichInputText inputText6) {
    this.inputText6 = inputText6;
  }

  public RichInputText getInputText6() {
    return inputText6;
  }

  public void setOutputText4(RichOutputText outputText4) {
    this.outputText4 = outputText4;
  }

  public RichOutputText getOutputText4() {
    return outputText4;
  }

  public void setOutputText5(RichOutputText outputText5) {
    this.outputText5 = outputText5;
  }

  public RichOutputText getOutputText5() {
    return outputText5;
  }

  public void setOutputText6(RichOutputText outputText6) {
    this.outputText6 = outputText6;
  }

  public RichOutputText getOutputText6() {
    return outputText6;
  }

  public void setOutputText7(RichOutputText outputText7) {
    this.outputText7 = outputText7;
  }

  public RichOutputText getOutputText7() {
    return outputText7;
  }

  public void setInputDate1(RichInputDate inputDate1) {
    this.inputDate1 = inputDate1;
  }

  public RichInputDate getInputDate1() {
    return inputDate1;
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

  public  Connection getConnection() throws SQLException {
    String username = "system";
    String password = "tammam";
    String thinConn = "jdbc:oracle:thin:@localhost:1521:XE";
    DriverManager.registerDriver(new OracleDriver());
    Connection conn =
      DriverManager.getConnection(thinConn, username, password);
    conn.setAutoCommit(false);
    return conn;
  }


  public String commandButton1_action() {
    
    
    
    
    // Add event code here...
    try {
     Connection c = getConnection();
      PreparedStatement p=c.prepareStatement("INSERT INTO customer(cfname,clname,cname,cpass,cemail,ctype,bdate) VALUES(?,?,?,?,?,'web customer',?)");
      if(inputText6.getValue().equals(inputText4.getValue())) {
        p.setString(1,inputText1.getValue().toString());
        p.setString(2,inputText2.getValue().toString());
        p.setString(3,inputText3.getValue().toString());
        p.setString(4,inputText6.getValue().toString());
        p.setString(5,inputText5.getValue().toString());
        p.setString(6,inputDate1.getValue().toString());
        p.executeUpdate();
        c.commit();
        
        message1.setMessageType("confirmation");
        message1.setMessage("Successfully Rigistered");
    
      }else{
        message1.setMessageType("error");
        message1.setMessage("Password not properly confirmed, enter your password two times exactly the same");
      }
    } catch (SQLException e) {
      message1.setMessageType("error");
      message1.setMessage("This Customer is already exist");
      
    }
    return null;
  }
}
