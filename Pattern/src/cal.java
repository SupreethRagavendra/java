
import java.awt.*;
import java.awt.event.*;



public class cal     {

    public static void main(String[] args) {
            Frame f = new Frame();

        Button add2 = new Button("Add");
        Button sub = new Button("sub");
        Button div = new Button("div");
        Button mul = new Button("mul");


      Label a = new Label("Enter the number 1 ");
      Label b = new Label("Enter the number 2");
        Label res = new Label("Result");


        TextField t1 = new TextField();

        TextField t2 = new TextField();

        TextField t3 = new TextField();



        a.setBounds(30,80,120,10);
        b.setBounds(30,130,120,10);
        res.setBounds(30,180,100,10);





        add2.setBounds(40,300,30,30);


        sub.setBounds(80,300,30,30);

        mul.setBounds(120,300,30,30);

        div.setBounds(260,300,30,30);




        t1.setBounds(130,80,160,30);
        t2.setBounds(130,130,160,30);
        t3.setBounds(130,180,160,30);

        f.add(add2);
        f.add(sub);
        f.add(mul);
        f.add(div);

        f.add(a);
        f.add(b);
        f.add(res);


        f.add(t1);
        f.add(t2);
        f.add(t3);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

        add2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                if (e.getSource()==add2)
                {
                    int c = a +b;
                    String re = Integer.toString(c);
                    t3.setText(re);
                }

            }
        });









    }




}
