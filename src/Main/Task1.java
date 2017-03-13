package Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 {

    private JComboBox<String> combobox= new JComboBox<>();
    private JTextField text1Field = new JTextField(10);
    private JButton Mybutton = new JButton("Добавить строку");


    public Object Add_str(JPanel p)
    {
        p.setLayout(new GridBagLayout());

        p.add(text1Field, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(Mybutton, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(combobox, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        Mybutton.addActionListener(new MyButtonActionListener());
        return p;
    }

    public class MyButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            if ((text1Field.getText()).trim().isEmpty()) {}
            else
            {
                for (int j = 0; j < combobox.getItemCount(); j++)
                {
                    if (text1Field.getText().equals(combobox.getItemAt(j)))
                    {
                        JOptionPane.showMessageDialog(new JFrame(),"Данная строка есть в списке");
                        return;
                    }
                }
                combobox.addItem(text1Field.getText());
            }
        }
    }

}
