package view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.adf.view.rich.component.rich.output.RichSeparator;

import org.apache.myfaces.trinidad.component.UIXIterator;
import java.sql.*;
import oracle.jdbc.OracleDriver;

public class Index {
  private RichForm form1;
  private RichDocument document1;
  private RichMessages messages1;
  private UIXIterator iterator1;
  private RichOutputText outputText1;
  private RichOutputText outputText2;
  private RichOutputText outputText3;
  private RichOutputText outputText4;
  private RichOutputText outputText6;
  private RichSeparator separator1;
  private RichImage outputText5;
  private RichSeparator separator2;

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

  public Index() {
  try{
      int mob=0;
      

      Connection c=getConnection();
      Statement s=c.createStatement();
      ResultSet r=s.executeQuery("SELECT * FROM STATISTICS");

      PreparedStatement p=c.prepareStatement("UPDATE STATISTICS SET home_st=?");

      while(r.next())
      {
          mob=Integer.parseInt(r.getObject("home_st").toString());

      }
      mob++;

      p.setInt(1, mob);
      p.executeUpdate();
      c.commit();
      
  }catch(Exception e)
  {
      e.printStackTrace();
  }

}
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


  public void setMessages1(RichMessages messages1) {
    this.messages1 = messages1;
  }

  public RichMessages getMessages1() {
    return messages1;
  }

  public void setIterator1(UIXIterator iterator1) {
    this.iterator1 = iterator1;
  }

  public UIXIterator getIterator1() {
    return iterator1;
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

  public void setOutputText4(RichOutputText outputText4) {
    this.outputText4 = outputText4;
  }

  public RichOutputText getOutputText4() {
    return outputText4;
  }


  public void setOutputText6(RichOutputText outputText6) {
    this.outputText6 = outputText6;
  }

  public RichOutputText getOutputText6() {
    return outputText6;
  }

  public void setSeparator1(RichSeparator separator1) {
    this.separator1 = separator1;
  }

  public RichSeparator getSeparator1() {
    return separator1;
  }

  public void setOutputText5(RichImage outputText5) {
    this.outputText5 = outputText5;
  }

  public RichImage getOutputText5() {
    return outputText5;
  }

  public void setSeparator2(RichSeparator separator2) {
    this.separator2 = separator2;
  }

  public RichSeparator getSeparator2() {
    return separator2;
  }
}
