import javax.swing.*;
import java.awt.*;

public class OutputPanel extends JPanel {
    private JTextArea res1;
    private JTextArea res2;

    public OutputPanel(){
        res1 = new JTextArea("sum");
        res2 = new JTextArea("Dif");

        JTextArea equ = new JTextArea("=");
        equ.setEditable(false);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 2;
        c.ipadx = 10;
        add(equ, c);

        c.gridx=1;
        c.gridheight=1;
        c.ipadx=30;
        c.ipady=5;
        add(res1, c);

        c.gridy=1;
        add(res2, c);

    }

    public void setRes1(String string){
        res1.setText(string);
    }
    public void setRes2(String string){
        res2.setText(string);
    }
}
