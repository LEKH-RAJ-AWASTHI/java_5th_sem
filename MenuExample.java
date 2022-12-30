import java.awt.*;
import java.awt.event.*;

public class MenuExample extends Frame implements ActionListener {

  // Create the menu bar
  MenuBar menuBar = new MenuBar();

  // Create the File menu
  Menu fileMenu = new Menu("File");
  MenuItem openItem = new MenuItem("Open");
  MenuItem saveItem = new MenuItem("Save");
  MenuItem exitItem = new MenuItem("Exit");

  // Create the Edit menu
  Menu editMenu = new Menu("Edit");
  MenuItem cutItem = new MenuItem("Cut");
  MenuItem copyItem = new MenuItem("Copy");
  MenuItem pasteItem = new MenuItem("Paste");

  public MenuExample() {
    // Set the menu bar for the frame
    setMenuBar(menuBar);

    // Add the File menu to the menu bar
    menuBar.add(fileMenu);

    // Add menu items to the File menu
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    // fileMenu.addSeparator();
    fileMenu.add(exitItem);

    // Add the Edit menu to the menu bar
    menuBar.add(editMenu);

    // Add menu items to the Edit menu
    editMenu.add(cutItem);
    editMenu.add(copyItem);
    editMenu.add(pasteItem);

    // Add action listeners for the menu items
    // openItem.addActionListener(this);
    // saveItem.addActionListener(this);
    exitItem.addActionListener(this);
    // cutItem.addActionListener(this);
    // copyItem.addActionListener(this);
    // pasteItem.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    // if (command.equals("Open")) {
    //   // Open a file
    // } else if (command.equals("Save")) {
      // Save the file
    // } 
    if (command.equals("Exit")) {
      System.exit(0);
    }
    //  else if (command.equals("Cut")) {
    //   // Cut the selected text
    // } else if (command.equals("Copy")) {
    //   // Copy the selected text
    // } else if (command.equals("Paste")) {
    //   // Paste the text from the clipboard
    // }
  }

  public static void main(String[] args) {
    MenuExample frame = new MenuExample();
    frame.setTitle("Menu Example");
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
