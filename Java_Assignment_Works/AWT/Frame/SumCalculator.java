import java.awt.*;
import java.awt.event.*;

public class SumCalculator extends Frame implements ActionListener {

    // Declare components
    TextField num1, num2;
    Label resultLabel;
    Button addButton;

    public SumCalculator() {

        // Frame settings
        setTitle("Simple Adder");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Initialize components
        num1 = new TextField(10);
        num2 = new TextField(10);
        addButton = new Button("Calculate Sum");
        resultLabel = new Label("Result will be shown here");

        // Add components to frame
        add(new Label("Enter Number 1:"));
        add(num1);

        add(new Label("Enter Number 2:"));
        add(num2);

        add(addButton);
        add(resultLabel);

        // Register button with ActionListener
        addButton.addActionListener(this);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Event handling for button click
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            int sum = a + b;

            resultLabel.setText("Total Sum: " + sum);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new SumCalculator();
    }
}
