package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Task2 {

    private JTextField text1Field = new JTextField(10);
    private JButton Mybutton1 = new JButton("Переместить");
    private JButton Mybutton2 = new JButton("Кнопка");

    public Object Replacement(JPanel p)
    {
        p.setLayout(new GridBagLayout());

        p.add(text1Field, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(Mybutton1, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(Mybutton2, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        Mybutton1.addActionListener(new MyButton1ActionListener());
        Mybutton2.addActionListener(new MyButton2ActionListener());

        return p;
    }

    public class MyButton1ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str1 = text1Field.getText();
            Mybutton2.setText(str1);
        }
    }

    public class MyButton2ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str1 = Mybutton1.getText();
            String str2 = Mybutton2.getText();

            Mybutton1.setText(str2);
            Mybutton2.setText(str1);

        }
    }
}
