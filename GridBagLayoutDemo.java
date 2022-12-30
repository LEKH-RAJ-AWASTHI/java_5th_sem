import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo {
  public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("GridBagLayout Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the layout manager to GridBagLayout
    frame.setLayout(new GridBagLayout());

    // Create some buttons
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");


    // Create a GridBagConstraints object
    GridBagConstraints gbc = new GridBagConstraints();

    // Add the buttons to the frame
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    gbc.gridheight = 2;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1.0;
    gbc.weighty = 1.0;
    gbc.insets = new Insets(5, 5, 5, 5);
    frame.add(b1, gbc);

    gbc.gridx = 2;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1.0;
    gbc.weighty = 1.0;
    gbc.insets = new Insets(5, 5, 5, 5);
    frame.add(b2, gbc);

    frame.setSize(800, 800);
    frame.setVisible(true);

  }
}

