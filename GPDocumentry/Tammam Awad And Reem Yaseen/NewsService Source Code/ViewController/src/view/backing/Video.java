package view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.output.RichMedia;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.adf.view.rich.component.rich.output.RichSeparator;

import org.apache.myfaces.trinidad.component.UIXIterator;


public class Video {
  private RichForm form1;
  private RichDocument document1;
  private RichMessages messages1;
  private UIXIterator iterator1;
  private RichOutputText outputText1;
  private RichSeparator separator1;
  private RichOutputText outputText2;
  private RichOutputText outputText3;
  private RichSeparator separator2;
  private RichOutputText outputText4;
  private RichMedia outputText21;

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

  public void setSeparator1(RichSeparator separator1) {
    this.separator1 = separator1;
  }

  public RichSeparator getSeparator1() {
    return separator1;
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

  public void setSeparator2(RichSeparator separator2) {
    this.separator2 = separator2;
  }

  public RichSeparator getSeparator2() {
    return separator2;
  }

  public void setOutputText4(RichOutputText outputText4) {
    this.outputText4 = outputText4;
  }

  public RichOutputText getOutputText4() {
    return outputText4;
  }


  public void setOutputText21(RichMedia outputText21) {
    this.outputText21 = outputText21;
  }

  public RichMedia getOutputText21() {
    return outputText21;
  }
}
