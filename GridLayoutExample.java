import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Grid Layout Example");
    frame.setLayout(new GridLayout(3, 2));
    frame.add(new JButton("Button 1"));
    frame.add(new JButton("Button 2"));
    frame.add(new JButton("Button 3"));
    frame.add(new JButton("Button 4"));
    frame.add(new JButton("Button 5"));
    frame.add(new JButton("Button 6"));
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
