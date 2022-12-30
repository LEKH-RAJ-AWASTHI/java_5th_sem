import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Flow Layout Example");
    frame.setLayout(new FlowLayout());
    frame.add(new JButton("Button 1"));
    frame.add(new JButton("Button 2"));
    frame.add(new JButton("Button 3"));
    frame.add(new JButton("Button 4"));
    frame.add(new JButton("Button 5"));
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}
