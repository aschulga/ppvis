package Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame {

    private String title;
    private Dimension d;

    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();

    private JMenuBar menubar = new JMenuBar();
    private JMenu menu = new JMenu("Меню");
    private JMenuItem menuItem1 = new JMenuItem("Старт");
    private JMenuItem menuItem2 = new JMenuItem("Стоп");

    private Timer swTimer;


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
        panel1 = t1.create();

        frame.add(panel1, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        Task2 t2 = new Task2();
        panel2 = t2.replacement();

        frame.add(panel2, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        Task3 t3 = new Task3();
        panel3 = t3.init();

        frame.add(panel3, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        Task4 t4 = new Task4();
        panel4 = t4.selection();

        frame.add(panel4, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        Task5 t5 = new Task5();
        panel5 = t5.actionsTable();

        frame.add(panel5, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        Task6 t6 = new Task6();

        ActionListener timerAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t6.update(t1.Mybutton);
                t6.update(t2.Mybutton1);
                t6.update(t2.Mybutton2);
                t6.update(t3.Mybutton);
                t6.update(t4.Mybutton);
                t6.update(t5.addbutton);
                t6.update(t5.movebutton);
                t6.update(t5.backmovebutton);
            }
        };

        swTimer = new Timer(100,timerAL);

        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swTimer.start();
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swTimer.stop();
            }
        });

        menu.add(menuItem1);
        menu.add(menuItem2);
        menubar.add(menu);
        frame.setJMenuBar(menubar);

        frame.setVisible(true);
        frame.pack();
    }

}
