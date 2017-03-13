package Main;


import javax.swing.*;
import java.awt.*;

public class MyFrame {

    private String title;
    private Dimension d;

    private JFrame frame = new JFrame();
    private JPanel panel_task1 = new JPanel();
    private JPanel panel_task2 = new JPanel();
    private JPanel panel_task3 = new JPanel();
    private JPanel panel_task4 = new JPanel();
    private JPanel panel_task5 = new JPanel();


    public MyFrame(String title, Dimension d)
    {
        this.title = title;
        this.d = d;
    }

    public void init()
    {
        frame.setTitle(title);
        frame.setSize(d);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Task1 t1 = new Task1();
        t1.Add_str(panel_task1);

        Task2 t2 = new Task2();
        t2.Replacement(panel_task2);

        Task3 t3 = new Task3();
        t3.Init(panel_task3);

        Task4 t4 = new Task4();
        t4.Selection(panel_task4);

        Task5 t5 = new Task5();
        t5.ActionsTable(panel_task5);

        frame.add(panel_task1, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(panel_task2, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(panel_task3, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(panel_task4, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(panel_task5, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.setVisible(true);
        frame.pack();
    }
}
