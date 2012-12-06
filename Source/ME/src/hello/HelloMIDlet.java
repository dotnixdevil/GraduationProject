/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import java.rmi.RemoteException;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import mywebservice1soaphttpport.MyWebService1;
import mywebservice1soaphttpport.MyWebService1_Stub;
import org.netbeans.microedition.lcdui.WaitScreen;
import org.netbeans.microedition.util.SimpleCancellableTask;

/**
 * @author Dotnixdevil
 */
public class HelloMIDlet extends MIDlet implements CommandListener {

    String type[]=null;
    String title[]=null;

    String subject[]=null;


    private String user="tammam";
    private String pass="tammam";
    private boolean midletPaused = false;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command okCommand;
    private Command itemCommand;
    private Command exitCommand1;
    private Command itemCommand1;
    private Command okCommand1;
    private Command exitCommand2;
    private Command backCommand;
    private Form form;
    private ImageItem imageItem;
    private WaitScreen waitScreen;
    private Form form1;
    private ChoiceGroup choiceGroup;
    private Form form2;
    private ChoiceGroup choiceGroup1;
    private Form form3;
    private StringItem stringItem;
    private WaitScreen waitScreen1;
    private WaitScreen waitScreen2;
    private Ticker ticker1;
    private Image image1;
    private SimpleCancellableTask task;
    private SimpleCancellableTask task1;
    private Font font1;
    private SimpleCancellableTask task2;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|19-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|19-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|2|19-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|3|26-preAction
                // write pre-action user code here
                switchDisplayable(null, getWaitScreen());//GEN-LINE:|7-commandAction|4|26-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|56-preAction
        } else if (displayable == form1) {
            if (command == exitCommand1) {//GEN-END:|7-commandAction|5|56-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|6|56-postAction
                // write post-action user code here
            } else if (command == itemCommand1) {//GEN-LINE:|7-commandAction|7|59-preAction
                // write pre-action user code here
                switchDisplayable(null, getWaitScreen1());//GEN-LINE:|7-commandAction|8|59-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|68-preAction
        } else if (displayable == form2) {
            if (command == backCommand) {//GEN-END:|7-commandAction|9|68-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|7-commandAction|10|68-postAction
                // write post-action user code here
            } else if (command == exitCommand2) {//GEN-LINE:|7-commandAction|11|65-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|12|65-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|13|63-preAction
                // write pre-action user code here
                switchDisplayable(null, getWaitScreen2());//GEN-LINE:|7-commandAction|14|63-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|15|76-preAction
        } else if (displayable == form3) {
            if (command == backCommand) {//GEN-END:|7-commandAction|15|76-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|7-commandAction|16|76-postAction
                // write post-action user code here
            } else if (command == exitCommand1) {//GEN-LINE:|7-commandAction|17|74-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|18|74-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|19|32-preAction
        } else if (displayable == waitScreen) {
            if (command == WaitScreen.FAILURE_COMMAND) {//GEN-END:|7-commandAction|19|32-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|20|32-postAction
                // write post-action user code here
            } else if (command == WaitScreen.SUCCESS_COMMAND) {//GEN-LINE:|7-commandAction|21|31-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|7-commandAction|22|31-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|23|80-preAction
        } else if (displayable == waitScreen1) {
            if (command == WaitScreen.FAILURE_COMMAND) {//GEN-END:|7-commandAction|23|80-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|7-commandAction|24|80-postAction
                // write post-action user code here
            } else if (command == WaitScreen.SUCCESS_COMMAND) {//GEN-LINE:|7-commandAction|25|79-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|7-commandAction|26|79-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|27|87-preAction
        } else if (displayable == waitScreen2) {
            if (command == WaitScreen.FAILURE_COMMAND) {//GEN-END:|7-commandAction|27|87-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|7-commandAction|28|87-postAction
                // write post-action user code here
            } else if (command == WaitScreen.SUCCESS_COMMAND) {//GEN-LINE:|7-commandAction|29|86-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm3());//GEN-LINE:|7-commandAction|30|86-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|31|7-postCommandAction
        }//GEN-END:|7-commandAction|31|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|32|
    //</editor-fold>//GEN-END:|7-commandAction|32|




    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of form component.
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("", new Item[] { getImageItem() });//GEN-BEGIN:|14-getter|1|14-postInit
            form.setTicker(getTicker1());
            form.addCommand(getExitCommand());
            form.addCommand(getOkCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here

        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
    //</editor-fold>//GEN-END:|14-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|25-getter|0|25-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|25-getter|1|25-postInit
            // write post-init user code here
        }//GEN-BEGIN:|25-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|25-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: imageItem ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initiliazed instance of imageItem component.
     * @return the initialized component instance
     */
    public ImageItem getImageItem() {
        if (imageItem == null) {//GEN-END:|23-getter|0|23-preInit
            // write pre-init user code here
            imageItem = new ImageItem("", getImage1(), ImageItem.LAYOUT_CENTER, "<Missing Image>");//GEN-LINE:|23-getter|1|23-postInit
            // write post-init user code here
        }//GEN-BEGIN:|23-getter|2|
        return imageItem;
    }
    //</editor-fold>//GEN-END:|23-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: waitScreen ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of waitScreen component.
     * @return the initialized component instance
     */
    public WaitScreen getWaitScreen() {
        if (waitScreen == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            waitScreen = new WaitScreen(getDisplay());//GEN-BEGIN:|28-getter|1|28-postInit
            waitScreen.setTitle("waitScreen");
            waitScreen.setCommandListener(this);
            waitScreen.setFullScreenMode(true);
            waitScreen.setImage(getImage1());
            waitScreen.setText("Waitting......");
            waitScreen.setTask(getTask());//GEN-END:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return waitScreen;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ticker1 ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of ticker1 component.
     * @return the initialized component instance
     */
    public Ticker getTicker1() {
        if (ticker1 == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            ticker1 = new Ticker("News Service For All News Of Your Life");//GEN-LINE:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return ticker1;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initiliazed instance of image1 component.
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|24-getter|1|24-@java.io.IOException
                image1 = Image.createImage("/Graduation Project1.png");
            } catch (java.io.IOException e) {//GEN-END:|24-getter|1|24-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|24-getter|2|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|3|
        return image1;
    }
    //</editor-fold>//GEN-END:|24-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: task ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initiliazed instance of task component.
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask() {
        if (task == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            task = new SimpleCancellableTask();//GEN-BEGIN:|33-getter|1|33-execute
            task.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|33-getter|1|33-execute
                    // write task-execution user code here
                    MyWebService1 m=new MyWebService1_Stub();
                    type=m.getNewsType(user,pass);

                }//GEN-BEGIN:|33-getter|2|33-postInit
            });//GEN-END:|33-getter|2|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|3|
        return task;
    }
    //</editor-fold>//GEN-END:|33-getter|3|





    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initiliazed instance of itemCommand component.
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {//GEN-END:|44-getter|0|44-preInit
            // write pre-init user code here
            itemCommand = new Command("GetNews", Command.ITEM, 0);//GEN-LINE:|44-getter|1|44-postInit
            // write post-init user code here
        }//GEN-BEGIN:|44-getter|2|
        return itemCommand;
    }
    //</editor-fold>//GEN-END:|44-getter|2|





    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initiliazed instance of form1 component.
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            form1 = new Form("", new Item[] { getChoiceGroup() });//GEN-BEGIN:|51-getter|1|51-postInit
            form1.setTicker(getTicker1());
            form1.addCommand(getExitCommand1());
            form1.addCommand(getItemCommand1());
            form1.setCommandListener(this);//GEN-END:|51-getter|1|51-postInit
            // write post-init user code here
                for(int i=0;i<type.length;i++)
                    {
                        choiceGroup.append(type[i], null);
                    }
        }//GEN-BEGIN:|51-getter|2|
        return form1;
    }
    //</editor-fold>//GEN-END:|51-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initiliazed instance of choiceGroup component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Catogery", Choice.EXCLUSIVE);//GEN-BEGIN:|52-getter|1|52-postInit
            choiceGroup.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);//GEN-END:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return choiceGroup;
    }
    //</editor-fold>//GEN-END:|52-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|55-getter|0|55-preInit
    /**
     * Returns an initiliazed instance of exitCommand1 component.
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|55-getter|0|55-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|55-getter|1|55-postInit
            // write post-init user code here
        }//GEN-BEGIN:|55-getter|2|
        return exitCommand1;
    }
    //</editor-fold>//GEN-END:|55-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand1 ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initiliazed instance of itemCommand1 component.
     * @return the initialized component instance
     */
    public Command getItemCommand1() {
        if (itemCommand1 == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            itemCommand1 = new Command("GetNews", Command.ITEM, 0);//GEN-LINE:|58-getter|1|58-postInit
            // write post-init user code here
        }//GEN-BEGIN:|58-getter|2|
        return itemCommand1;
    }
    //</editor-fold>//GEN-END:|58-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form2 ">//GEN-BEGIN:|54-getter|0|54-preInit
    /**
     * Returns an initiliazed instance of form2 component.
     * @return the initialized component instance
     */
    public Form getForm2() {
        if (form2 == null) {//GEN-END:|54-getter|0|54-preInit
            // write pre-init user code here
            form2 = new Form("", new Item[] { getChoiceGroup1() });//GEN-BEGIN:|54-getter|1|54-postInit
            form2.setTicker(getTicker1());
            form2.addCommand(getOkCommand1());
            form2.addCommand(getExitCommand2());
            form2.addCommand(getBackCommand());
            form2.setCommandListener(this);//GEN-END:|54-getter|1|54-postInit
            // write post-init user code here




                for(int i=0;i<title.length;i++)
                {
                    choiceGroup1.append(title[i],null);
                }

        }//GEN-BEGIN:|54-getter|2|
        return form2;
    }
    //</editor-fold>//GEN-END:|54-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|61-getter|0|61-preInit
    /**
     * Returns an initiliazed instance of choiceGroup1 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {//GEN-END:|61-getter|0|61-preInit
            // write pre-init user code here
            choiceGroup1 = new ChoiceGroup("", Choice.EXCLUSIVE);//GEN-LINE:|61-getter|1|61-postInit
            // write post-init user code here
        }//GEN-BEGIN:|61-getter|2|
        return choiceGroup1;
    }
    //</editor-fold>//GEN-END:|61-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|62-getter|0|62-preInit
    /**
     * Returns an initiliazed instance of okCommand1 component.
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|62-getter|0|62-preInit
            // write pre-init user code here
            okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|62-getter|1|62-postInit
            // write post-init user code here
        }//GEN-BEGIN:|62-getter|2|
        return okCommand1;
    }
    //</editor-fold>//GEN-END:|62-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|64-getter|0|64-preInit
    /**
     * Returns an initiliazed instance of exitCommand2 component.
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {//GEN-END:|64-getter|0|64-preInit
            // write pre-init user code here
            exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|64-getter|1|64-postInit
            // write post-init user code here
        }//GEN-BEGIN:|64-getter|2|
        return exitCommand2;
    }
    //</editor-fold>//GEN-END:|64-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|67-getter|0|67-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|67-getter|0|67-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|67-getter|1|67-postInit
            // write post-init user code here
        }//GEN-BEGIN:|67-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|67-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form3 ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initiliazed instance of form3 component.
     * @return the initialized component instance
     */
    public Form getForm3() {
        if (form3 == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            form3 = new Form("", new Item[] { getStringItem() });//GEN-BEGIN:|70-getter|1|70-postInit
            form3.setTicker(getTicker1());
            form3.addCommand(getExitCommand1());
            form3.addCommand(getBackCommand());
            form3.setCommandListener(this);//GEN-END:|70-getter|1|70-postInit
            // write post-init user code here
            try{

                for(int i=0;i<subject.length;i++)
                {
                    stringItem.setText(subject[i]);
                }

            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }//GEN-BEGIN:|70-getter|2|
        return form3;
    }
    //</editor-fold>//GEN-END:|70-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|73-getter|0|73-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|73-getter|0|73-preInit
            // write pre-init user code here
            stringItem = new StringItem("", null);//GEN-LINE:|73-getter|1|73-postInit
            // write post-init user code here
        }//GEN-BEGIN:|73-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|73-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: waitScreen1 ">//GEN-BEGIN:|78-getter|0|78-preInit
    /**
     * Returns an initiliazed instance of waitScreen1 component.
     * @return the initialized component instance
     */
    public WaitScreen getWaitScreen1() {
        if (waitScreen1 == null) {//GEN-END:|78-getter|0|78-preInit
            // write pre-init user code here
            waitScreen1 = new WaitScreen(getDisplay());//GEN-BEGIN:|78-getter|1|78-postInit
            waitScreen1.setTitle("");
            waitScreen1.setCommandListener(this);
            waitScreen1.setFullScreenMode(true);
            waitScreen1.setImage(getImage1());
            waitScreen1.setText("Waiting.......");
            waitScreen1.setTextFont(getFont1());
            waitScreen1.setTask(getTask1());//GEN-END:|78-getter|1|78-postInit
            // write post-init user code here
        }//GEN-BEGIN:|78-getter|2|
        return waitScreen1;
    }
    //</editor-fold>//GEN-END:|78-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: task1 ">//GEN-BEGIN:|81-getter|0|81-preInit
    /**
     * Returns an initiliazed instance of task1 component.
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask1() {
        if (task1 == null) {//GEN-END:|81-getter|0|81-preInit
            // write pre-init user code here
            task1 = new SimpleCancellableTask();//GEN-BEGIN:|81-getter|1|81-execute
            task1.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|81-getter|1|81-execute
                    // write task-execution user code here
                    MyWebService1 m=new MyWebService1_Stub();
                    title=m.getNewsTitle(user, pass,choiceGroup.getString(choiceGroup.getSelectedIndex()));

                }//GEN-BEGIN:|81-getter|2|81-postInit
            });//GEN-END:|81-getter|2|81-postInit
            // write post-init user code here
        }//GEN-BEGIN:|81-getter|3|
        return task1;
    }
    //</editor-fold>//GEN-END:|81-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: font1 ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initiliazed instance of font1 component.
     * @return the initialized component instance
     */
    public Font getFont1() {
        if (font1 == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            font1 = Font.getDefaultFont();//GEN-LINE:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return font1;
    }
    //</editor-fold>//GEN-END:|82-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: waitScreen2 ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initiliazed instance of waitScreen2 component.
     * @return the initialized component instance
     */
    public WaitScreen getWaitScreen2() {
        if (waitScreen2 == null) {//GEN-END:|85-getter|0|85-preInit
            // write pre-init user code here
            waitScreen2 = new WaitScreen(getDisplay());//GEN-BEGIN:|85-getter|1|85-postInit
            waitScreen2.setTitle("");
            waitScreen2.setCommandListener(this);
            waitScreen2.setFullScreenMode(true);
            waitScreen2.setImage(getImage1());
            waitScreen2.setText("Waiting......");
            waitScreen2.setTextFont(getFont1());
            waitScreen2.setTask(getTask2());//GEN-END:|85-getter|1|85-postInit
            // write post-init user code here
        }//GEN-BEGIN:|85-getter|2|
        return waitScreen2;
    }
    //</editor-fold>//GEN-END:|85-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: task2 ">//GEN-BEGIN:|88-getter|0|88-preInit
    /**
     * Returns an initiliazed instance of task2 component.
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask2() {
        if (task2 == null) {//GEN-END:|88-getter|0|88-preInit
            // write pre-init user code here
            task2 = new SimpleCancellableTask();//GEN-BEGIN:|88-getter|1|88-execute
            task2.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|88-getter|1|88-execute
                    // write task-execution user code here
                    MyWebService1 m=new MyWebService1_Stub();
                    subject=m.getNews(user, pass, choiceGroup1.getString(choiceGroup1.getSelectedIndex()));

                }//GEN-BEGIN:|88-getter|2|88-postInit
            });//GEN-END:|88-getter|2|88-postInit
            // write post-init user code herem=new
        }//GEN-BEGIN:|88-getter|3|
        return task2;
    }
    //</editor-fold>//GEN-END:|88-getter|3|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

}
