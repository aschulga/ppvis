package Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task4 {

    private JTextField text1Field = new JTextField(10);
    private JCheckBox checkbox1 = new JCheckBox("privet");
    private JCheckBox checkbox2 = new JCheckBox("kak dela");
    private JCheckBox checkbox3 = new JCheckBox("poka");
    private JButton Mybutton = new JButton("Действие");

    public Object Selection(JPanel p)
    {

        p.setLayout(new GridBagLayout());

        p.add(text1Field, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(Mybutton, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(checkbox1, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(checkbox2, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(checkbox3, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        Mybutton.addActionListener(new MyButtonActionListener());

        return p;
    }



    public class MyButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (text1Field.getText().trim().isEmpty()) {
            } else {

                String str1 = text1Field.getText();
                String str2 = new String();

                if (str1.indexOf(checkbox1.getText()) != -1) {
                    checkbox1.setSelected(true);
                    str2 = str1.replaceAll(checkbox1.getText(), "");
                    str1 = str2;
                }

                if (str1.indexOf(checkbox2.getText()) != -1) {
                    checkbox2.setSelected(true);
                    str2 = str1.replaceAll(checkbox2.getText(), "");
                    str1 = str2;
                }

                if (str1.indexOf(checkbox3.getText()) != -1) {
                    checkbox3.setSelected(true);
                    str2 = str1.replaceAll(checkbox3.getText(), "");
                    str1 = str2;
                }

                if (str1.trim().isEmpty()) {
                } else
                    JOptionPane.showMessageDialog(new JFrame(), "Элемента " + str1.trim() + " не существует");
            }

        }
    }
}
