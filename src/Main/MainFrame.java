package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


class MyFrame {

    private String title;
    private Dimension d;

    private int rowIndex;
    private int columnIndex;
    
    private JFrame frame = new JFrame();

    private JTextField text1Field = new JTextField(10);
    private JTextField text3Field = new JTextField(10);
    private JTextField text2Field = new JTextField(10);
    private JButton Mybutton1 = new JButton("Переместить");
    private JButton Mybutton2 = new JButton("Выполнить действие");
    private JButton Mybutton3 = new JButton("Добавить строку");
    private JButton Mybutton4 = new JButton("Кнопка");
    private JButton Mybutton5 = new JButton("Действие");
    private JComboBox<String> combobox= new JComboBox<>();



    private JPanel panel = new JPanel();
    private ButtonGroup buttongroup = new ButtonGroup();
    private JRadioButton radiobutton1 = new JRadioButton("a");
    private JRadioButton radiobutton2 = new JRadioButton("b");
    private JRadioButton radiobutton3 = new JRadioButton("c");

    private JCheckBox checkbox1 = new JCheckBox("privet");
    private JCheckBox checkbox2 = new JCheckBox("kak dela");
    private JCheckBox checkbox3 = new JCheckBox("poka");

    private JButton addbutton = new JButton("Добавить");
    private JButton movebutton = new JButton("Переместить");
    private JButton backmovebutton = new JButton("Переместить обратно");


    ModelTable model = new ModelTable();

    JTable table = new JTable(model);
    JScrollPane jsp = new JScrollPane(table);


///////////////


    public MyFrame(String title, Dimension d)
    {
        this.title = title;
        this.d = d;
    }

    public void init()
    {
        table.setColumnSelectionAllowed(true);


        frame.setTitle(title);
        frame.setSize(d);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
/////////
        jsp.setPreferredSize(new Dimension(400,400));

/////////
        Mybutton1.addActionListener(new MyButton1ActionListener());
        Mybutton2.addActionListener(new MyButton2ActionListener());
        Mybutton3.addActionListener(new MyButton3ActionListener());
        Mybutton4.addActionListener(new MyButton4ActionListener());
        Mybutton5.addActionListener(new MyButton5ActionListener());

        addbutton.addActionListener(new addbuttonActionListener());
        movebutton.addActionListener(new movebuttonActionListener());
        backmovebutton.addActionListener(new backmovebuttonActionListener());

        panel.setBackground(Color.GREEN);

        frame.add(text1Field, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(text3Field, new GridBagConstraints(2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Mybutton1, new GridBagConstraints(0, 1, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Mybutton2, new GridBagConstraints(2, 0, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Mybutton3, new GridBagConstraints(0, 2, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Mybutton4, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Mybutton5, new GridBagConstraints(4, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(combobox, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(panel, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(checkbox1, new GridBagConstraints(4, 1, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(checkbox2, new GridBagConstraints(4, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(checkbox3, new GridBagConstraints(4, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        /////////////////

        frame.add(addbutton, new GridBagConstraints(0, 4, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(movebutton, new GridBagConstraints(0, 5, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(backmovebutton, new GridBagConstraints(0, 6, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(text2Field, new GridBagConstraints(0, 7, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(jsp, new GridBagConstraints(0, 8, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        ////////////////




        panel.add(radiobutton1);
        panel.add(radiobutton2);
        panel.add(radiobutton3);

        buttongroup.add(radiobutton1);
        buttongroup.add(radiobutton2);
        buttongroup.add(radiobutton3);


        frame.setVisible(true);
        frame.pack();
    }

    ///////////////////////////////////////Действия с таблицей////////////////////////////////////

    public class addbuttonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String []str = new String[2];
            str[0] = text2Field.getText();
            model.addDate(str);
        }
    }

    public class movebuttonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for(int i = 0; i < model.getRowCount(); i++) {
                if (table.isRowSelected(i) == true)
                    model.Move(i);
            }

        }
    }

    public class backmovebuttonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for(int i = 0; i < model.getRowCount(); i++) {
                if (table.isRowSelected(i) == true)
                    model.BackMove(i);
            }

        }
    }

   ////////////////////////////////////////////////////////////////////////////////////////////////

    public class MyButton1ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str1 = text1Field.getText();
            Mybutton4.setText(str1);
        }
    }

    public class MyButton2ActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(text3Field.getText().trim().isEmpty()) {}

            else

            if(radiobutton1.getText().equals(text3Field.getText())) radiobutton1.setSelected(true);
            else if(radiobutton2.getText().equals(text3Field.getText())) radiobutton2.setSelected(true);
            else if(radiobutton3.getText().equals(text3Field.getText())) radiobutton3.setSelected(true);
            else
                JOptionPane.showMessageDialog(new JFrame(),"Данного имени не существует");

            }
    }

    public class MyButton3ActionListener implements ActionListener {
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

    public class MyButton4ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str1 = Mybutton1.getText();
            String str2 = Mybutton4.getText();

            Mybutton1.setText(str2);
            Mybutton4.setText(str1);

        }
    }

    public class MyButton5ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            if(text3Field.getText().trim().isEmpty()) {}

            else {

                String str1 = text3Field.getText();
                String str2 = new String();

                if (str1.indexOf(checkbox1.getText()) != -1)
                {
                    checkbox1.setSelected(true);
                    str2 = str1.replaceAll(checkbox1.getText(),"");
                    str1 = str2;
                }

                if (str1.indexOf(checkbox2.getText()) != -1)
                {
                    checkbox2.setSelected(true);
                    str2 = str1.replaceAll(checkbox2.getText(),"");
                    str1 = str2;
                }

                if (str1.indexOf(checkbox3.getText()) != -1)
                {
                    checkbox3.setSelected(true);
                    str2 = str1.replaceAll(checkbox3.getText(),"");
                    str1 = str2;
                }

                if(str1.trim().isEmpty()){}

                else
                    JOptionPane.showMessageDialog(new JFrame(),"Элемента "+str1.trim()+" не существует");
            }

        }

    }


}