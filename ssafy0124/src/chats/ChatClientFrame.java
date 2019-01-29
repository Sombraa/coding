package chats;

//package chats;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ChatClientFrame extends JFrame {
  JPanel contentPane;
  ChatClientJPanel cp;
  BorderLayout borderLayout1 = new BorderLayout();
  String ip="";
  int port =0;
  //Construct the frame
  public ChatClientFrame() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  //Component initialization
  private void jbInit() throws Exception  {
    ChatClientWindow win=new ChatClientWindow();
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(new Dimension(600, 500));
    this.setTitle("Chat Client Frame");
    cp=new ChatClientJPanel(this);
    contentPane.add(cp);
    this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
          cp.disConnection();
          System.exit(0);
        }});
  }
}
