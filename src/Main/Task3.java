package Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3 {

    private ButtonGroup buttongroup = new ButtonGroup();
    private JRadioButton radiobutton1 = new JRadioButton("a");
    private JRadioButton radiobutton2 = new JRadioButton("b");
    private JRadioButton radiobutton3 = new JRadioButton("c");
    public JButton Mybutton = new JButton(" Выполнить действие ");
    private JTextField text1Field = new JTextField(10);


    public JPanel init() {

        JPanel p = new JPanel();

        p.setLayout(new GridBagLayout());

        p.add(text1Field, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(Mybutton, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(radiobutton1, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(radiobutton2, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(radiobutton3, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        Mybutton.addActionListener(new MyButtonActionListener());

        buttongroup.add(radiobutton1);
        buttongroup.add(radiobutton2);
        buttongroup.add(radiobutton3);

        return p;
    }

    public class MyButtonActionListener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            if(text1Field.getText().trim().isEmpty()) {}

            else

            if(radiobutton1.getText().equals(text1Field.getText())) radiobutton1.setSelected(true);
            else if(radiobutton2.getText().equals(text1Field.getText())) radiobutton2.setSelected(true);
            else if(radiobutton3.getText().equals(text1Field.getText())) radiobutton3.setSelected(true);
            else
                JOptionPane.showMessageDialog(new JFrame(),"Данного имени не существует");

        }
    }
}