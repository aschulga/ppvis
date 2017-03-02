package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame {

    private String title;
    private Dimension d;
    private static int i = 0;
    private static int s = 0;

    private JFrame frame = new JFrame();
    private JFrame over =new JFrame();
    private JTextField text1Field = new JTextField(10);
    private JTextField text2Field = new JTextField(10);
    private JTextField text3Field = new JTextField(10);
    private JButton Mybutton1 = new JButton("Переместить");
    private JButton Mybutton2 = new JButton("Выполнить действие");
    private JButton Mybutton3 = new JButton("Добавить строку");
    private JLabel label2 = new JLabel("Данного имени не существует");
    private JComboBox combobox = new JComboBox();

    private JPanel panel = new JPanel();
    private ButtonGroup buttongroup = new ButtonGroup();
    private JRadioButton radiobutton1 = new JRadioButton("a");
    private JRadioButton radiobutton2 = new JRadioButton("b");
    private JRadioButton radiobutton3 = new JRadioButton("c");

    private String f = radiobutton1.getText();

    public MyFrame(String title, Dimension d) {
        this.title = title;
        this.d = d;
    }

    public void init() {
        frame.setTitle(title);
        frame.setSize(d);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Mybutton1.addActionListener(new MyButton1ActionListener());
        Mybutton2.addActionListener(new MyButton2ActionListener());
        Mybutton3.addActionListener(new MyButton3ActionListener());

        panel.setBackground(Color.GREEN);

        frame.add(text1Field, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(text2Field, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(text3Field, new GridBagConstraints(2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Mybutton1, new GridBagConstraints(0, 1, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Mybutton2, new GridBagConstraints(2, 0, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Mybutton3, new GridBagConstraints(0, 2, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(combobox, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(panel, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        panel.add(radiobutton1);
        panel.add(radiobutton2);
        panel.add(radiobutton3);

        buttongroup.add(radiobutton1);
        buttongroup.add(radiobutton2);
        buttongroup.add(radiobutton3);


        frame.setVisible(true);
        frame.pack();
    }

    public class MyButton1ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str1 = text1Field.getText();
            String str2 = text2Field.getText();

            text1Field.setText(str2);
            text2Field.setText(str1);
        }
    }

    public class MyButton2ActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if(radiobutton1.getText().equals(text3Field.getText())) radiobutton1.setSelected(true);
            else if(radiobutton2.getText().equals(text3Field.getText())) radiobutton2.setSelected(true);
            else if(radiobutton3.getText().equals(text3Field.getText())) radiobutton3.setSelected(true);
            else {

                over.setSize(400,200);
                over.setLayout(new BorderLayout());
                over.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                over.setLocationRelativeTo(null);

                over.add(label2, BorderLayout.CENTER);

                over.setVisible(true);
                over.pack();
                }
            }
    }

    public class MyButton3ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str2 = text1Field.getText();

            for(int j = 0; j < 2; j++)
            {
                if (str2.equals(combobox.getItemAt(j))) System.out.print("wqrwr");
                else combobox.addItem(str2);
            }

        }
    }
}