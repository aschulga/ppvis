package Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task5 {

    private JTextField text1Field = new JTextField(10);
    public JButton addbutton = new JButton(" Добавить ");
    public JButton movebutton = new JButton(" Переместить  ");
    public JButton backmovebutton = new JButton(" Переместить обратно ");

    ModelTable model = new ModelTable();

    JTable table = new JTable(model);
    JScrollPane jsp = new JScrollPane(table);


    public JPanel actionsTable()
    {
        JPanel p = new JPanel();

        p.setLayout(new GridBagLayout());

        p.add(text1Field, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(addbutton, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(movebutton, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(backmovebutton, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        p.add(jsp, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        table.setColumnSelectionAllowed(true);
        jsp.setPreferredSize(new Dimension(200,100));

        addbutton.addActionListener(new addbuttonActionListener());
        movebutton.addActionListener(new movebuttonActionListener());
        backmovebutton.addActionListener(new backmovebuttonActionListener());

        return p;
    }

    public class addbuttonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String []str = new String[2];
            str[0] = text1Field.getText();
            model.addDate(str);
        }
    }

    public class movebuttonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for(int i = 0; i < model.getRowCount(); i++) {
                if ((table.isRowSelected(i) == true) && (table.isColumnSelected(1) == false) && (model.getValueAt(i,0)) != "")
                    model.Move(i);
            }

        }
    }

    public class backmovebuttonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for(int i = 0; i < model.getRowCount(); i++) {
                if ((table.isRowSelected(i) == true) && (table.isColumnSelected(0) == false) && (model.getValueAt(i,0)) == "")
                    model.BackMove(i);
            }

        }
    }
}
