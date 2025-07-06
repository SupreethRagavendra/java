import java.awt.*;
import java.awt.event.*;

public class EventExample {
    public static void main(String[] args) {
        Frame f = new Frame("Event Handling Example");

        // Create a button
        Button b = new Button("Click Me");
        b.setBounds(100, 100, 80, 30);

        // Add ActionListener (Event Listener)
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
