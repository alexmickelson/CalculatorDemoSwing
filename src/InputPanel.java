import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel implements ActionListener {
    private JTextArea input1;
    private JTextArea input2;

    private JButton add;
    private JButton sub;
    private JButton both;

    public InputPanel(){
        input1 = new JTextArea("first");
        input2 = new JTextArea("second");

        add = new JButton("+");
        sub = new JButton("-");
        both = new JButton("Both");

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 40;
        c.ipadx = 10;
        c.gridheight = 2;
        add(input1, c);

        c.gridx=1;
        c.gridy=0;
        c.ipady=0;
        c.ipadx=0;
        c.gridheight=1;
        add(add, c);

        c.gridx=1;
        c.gridy=1;
        add(sub, c);

        c.gridx = 2;
        c.gridy = 0;
        c.ipady = 40;
        c.ipadx = 10;
        c.gridheight = 2;
        add(input2, c);

        c.gridx=0;
        c.gridy=3;
        c.ipady=10;
        c.gridwidth=3;
        c.gridheight=1;
        add(both, c);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if (clicked == add) {
            //add stuff
        } else if (clicked == sub){
            //sub stuff
        } else if (clicked == both){
            //both stuff
        }
    }
}
