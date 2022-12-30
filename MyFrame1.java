import java.awt.*;

public class MyFrame1 extends Frame {
  public MyFrame1() {
    // Set the size and title of the frame
    setSize(400, 300);
    setTitle("My Frame Window");
    setLayout(new FlowLayout());

    // Add a checkbox group
    CheckboxGroup group = new CheckboxGroup();
    Checkbox checkbox1 = new Checkbox("Option 1", group, false);
    Checkbox checkbox2 = new Checkbox("Option 2", group, true);
    Checkbox checkbox3 = new Checkbox("Option 3", group, false);
    add(checkbox1);
    add(checkbox2);
    add(checkbox3);

    // Add a choice control
    Choice choice = new Choice();
    choice.add("Option 1");
    choice.add("Option 2");
    choice.add("Option 3");
    add(choice);

    // Add a list control
    List list = new List(3, false);
    list.add("Option 1");
    list.add("Option 2");
    list.add("Option 3");
    add(list);

    // Add a text box
    TextField textField = new TextField(20);
    add(textField);

    // Add a text area
    TextArea textArea = new TextArea(5, 20);
    add(textArea);
    // checkbox1.setBounds(50, 50, 100, 30);
    // checkbox2.setBounds(150, 50, 100, 30);
    // checkbox3.setBounds(250, 50, 100, 30);
    // choice.setBounds(50, 100, 100, 30);
    // list.setBounds(150, 100, 100, 30);
    // textField.setBounds(250, 100, 100, 30);
    // textArea.setBounds(50, 150, 300, 100);
    
  }

  public static void main(String[] args) {
    // Create a new frame and make it visible
    MyFrame1 frame = new MyFrame1();
    frame.setVisible(true);
  }
}
