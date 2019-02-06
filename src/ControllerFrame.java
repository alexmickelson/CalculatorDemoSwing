import javax.swing.*;
import java.awt.*;

public class ControllerFrame extends JFrame {
    private InputPanel inputPanel;
    private OutputPanel outputPanel;

    public ControllerFrame(){
        //initialize
        super("CALCULATOR DEMO");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        outputPanel = new OutputPanel();
        inputPanel = new InputPanel();

        //put frame together
        add(inputPanel);
        add(outputPanel);

        //display frame in middle of screen
        setSize(300, 200);
        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
        setVisible(true);
    }
}
