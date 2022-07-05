import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Button {

    ImageIcon play = new ImageIcon("play.png");
    ImageIcon pause = new ImageIcon("pause.png");
    ImageIcon repeat = new ImageIcon("repeat.png");
    ImageIcon nextSong = new ImageIcon("music-player.png");

    private ArrayList<JButton> button;

    Button() {

        this.button = new ArrayList<JButton>();
        button.add(0, new JButton(play));
        button.add(1, new JButton(pause));
        button.add(2, new JButton(repeat));
        button.add(3, new JButton(nextSong));

    }

    public ArrayList<JButton> getButton() {
        return button;
    }


}
