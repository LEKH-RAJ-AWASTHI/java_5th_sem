import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxRadioButtonExample extends JFrame {

  // Create the check boxes
  JCheckBox chb1 = new JCheckBox("Option 1");
  JCheckBox chb2 = new JCheckBox("Option 2");

  // Create the radio buttons
  JRadioButton rb1 = new JRadioButton("Option A");
  JRadioButton rb2 = new JRadioButton("Option B");

  public CheckBoxRadioButtonExample() {
    // Set the frame layout to grid layout
    setLayout(new GridLayout(3, 1));

    // Add the check boxes to the frame
    add(chb1);
    add(chb2);

    // Create a button group for the radio buttons
    ButtonGroup bg = new ButtonGroup();

    // Add the radio buttons to the button group
    bg.add(rb1);
    bg.add(rb2);

    // Add the radio buttons to the frame
    add(rb1);
    add(rb2);

    // Add action listeners for the check boxes
    chb1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Get the check box's current state
        boolean selected = chb1.isSelected();
        if (selected) {
          System.out.println("Option 1 is selected");
        } else {
          System.out.println("Option 1 is not selected");
        }
      }
    });
    chb2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Get the check box's current state
        boolean selected = chb2.isSelected();
        if (selected) {
          System.out.println("Option 2 is selected");
        } else {
          System.out.println("Option 2 is not selected");
        }
      }
    });

    // Add action listeners for the radio buttons
    rb1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Option A is selected");
      }
    });
    rb2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Option B is selected");
      }
    });
  }

  public static void main(String[] args) {
    CheckBoxRadioButtonExample frame = new CheckBoxRadioButtonExample();
    frame.setTitle("Check Box and Radio Button Example");
    frame.setSize(300, 150);
    frame.setLocationRelativeTo(null); // center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
