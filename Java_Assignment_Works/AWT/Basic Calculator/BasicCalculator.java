import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BasicCalculator extends JFrame implements MouseListener {

    JTextField num1Field, num2Field;
    JLabel resultLabel;

    public BasicCalculator() {

        // Frame settings
        setTitle("Sum & Difference App");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultLabel = new JLabel("Result: ");

        // Add components
        add(new JLabel("Number 1:"));
        add(num1Field);

        add(new JLabel("Number 2:"));
        add(num2Field);

        add(resultLabel);

        // Register mouse listener
        addMouseListener(this);

        setVisible(true);
    }

    // Mouse pressed → Sum
    @Override
    public void mousePressed(MouseEvent e) {
        try {
            int a = Integer.parseInt(num1Field.getText());
            int b = Integer.parseInt(num2Field.getText());
            resultLabel.setText("Sum: " + (a + b));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter valid numbers!");
        }
    }

    // Mouse released → Difference
    @Override
    public void mouseReleased(MouseEvent e) {
        try {
            int a = Integer.parseInt(num1Field.getText());
            int b = Integer.parseInt(num2Field.getText());
            resultLabel.setText("Difference: " + (a - b));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter valid numbers!");
        }
    }

    // Required empty methods
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new BasicCalculator();
    }
}

