import javax.swing.*;
import java.awt.event.*;

public class ToggleButtonExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Toggle Button Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a toggle button with the label "On/Off"
    JToggleButton toggleButton = new JToggleButton("On/Off");

    // Add an action listener to the toggle button
    toggleButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Get the toggle button's current state
        boolean selected = toggleButton.isSelected();
        if (selected) {
          // The toggle button is selected (on)
          System.out.println("Toggle button is ON");
        } else {
          // The toggle button is not selected (off)
          System.out.println("Toggle button is OFF");
        }
      }
    });

    // Add the toggle button to the frame
    frame.add(toggleButton);
    frame.setSize(200, 100);
    frame.setVisible(true);
  }
}
