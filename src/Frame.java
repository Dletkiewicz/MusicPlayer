import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame {

    ArrayList<JButton> button;
    JFrame frame;
    Frame(){

        frame = new JFrame("Music Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        this.button = new Button().getButton();

        for(JButton button: this.button){
            frame.add(button);
        }

        frame.setVisible(true);

    }
}
