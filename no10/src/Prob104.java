import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prob104 {
  private static String labelPrefix = "Total: ";
  private int total = 0;
  private JTextField textField;
  private JLabel label;

  class AddAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      int number = Integer.valueOf(textField.getText());
      total += number;
      label.setText(labelPrefix + total);
    }
  }

  class ClearAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      total = 0;
      textField.setText("0");
      label.setText(labelPrefix + total);
    }
  }

  public Component createComponents() {
    textField = new JTextField("0");
    JButton addButton = new JButton("Add");
    JButton clearButton = new JButton("Clear");
    label = new JLabel(labelPrefix + total);

    AddAction addListener = new AddAction();
    ClearAction clearListener = new ClearAction();
    addButton.addActionListener(addListener);
    clearButton.addActionListener(clearListener);

    JPanel buttonPane = new JPanel(new GridLayout(1, 2));
    buttonPane.add(addButton);
    buttonPane.add(clearButton);

    JPanel pane = new JPanel();
    pane.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    pane.setLayout(new GridLayout(0, 1));
    pane.add(textField);
    pane.add(buttonPane);
    pane.add(label);

    return pane;
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Prob104");
    Prob104 app = new Prob104();
    Component contents = app.createComponents();
    frame.getContentPane().add(contents, BorderLayout.CENTER);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
