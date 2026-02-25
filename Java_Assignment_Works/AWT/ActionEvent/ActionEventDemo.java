import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo extends Frame implements ActionListener {

    Button btn;

    public ActionEventDemo() {
        btn = new Button("Click Me");
        add(btn);

        btn.addActionListener(this);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        setTitle("Button Clicked");
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }
}
