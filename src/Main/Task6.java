package Main;

        import javax.swing.*;

public class Task6 {

    public String str2 = new String();

    void update(JButton button)
    {
        int i = 2;
        String str1 = button.getText();

        str2 = str1.replaceAll(str1.substring(0, i), "");
        str2 = str2.concat("" + str1.substring(0, i));
        button.setText(str2);
        if (i == str1.length()) i = -1;
        i++;
    }
}
