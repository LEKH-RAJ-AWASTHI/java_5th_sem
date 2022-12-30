import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboBoxExample extends JFrame {

  // Create the combo box
  JComboBox<String> cB = new JComboBox<>(new String[] { "Item 1", "Item 2", "Item 3" });

  // Create the text field
  JTextField tF = new JTextField(20);

  public ComboBoxExample() {
    // Set the layout to flow layout
    setLayout(new FlowLayout());

    // Add the combo box and text field to the frame
    add(cB);
    add(tF);

    // Add an action listener to the combo box
    cB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Get the selected item from the combo box
        String selectedItem = (String) cB.getSelectedItem();

        // Display the selected item in the text field
        tF.setText(selectedItem);
      }
    });
  }

  public static void main(String[] args) {
    ComboBoxExample frame = new ComboBoxExample();
    frame.setTitle("Combo Box Example");
    frame.setSize(300, 100);
    frame.setLocationRelativeTo(null); // center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
