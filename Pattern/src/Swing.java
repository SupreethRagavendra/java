import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Swing {

    public static void main(String[] args) {

        JFrame jf = new JFrame("test");

        JButton btn1 = new JButton("ok");
        JButton btn2 = new JButton("exit");
        JButton btn3 = new JButton("cancel");

        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        JLabel l3 = new JLabel();

        jf.setLayout(new FlowLayout());
        jf.add(btn1);
        jf.add(btn2);
        jf.add(btn3);
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);


        jf.setSize(500,600);
        jf.setVisible(true);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String str = btn1.getText();
                l1.setText(str);




            }
        });




    }

}
