import javax.swing.*;

public class PlayButton extends JButton {

    private JButton button;

    PlayButton(){

        ImageIcon icon = new ImageIcon("play.png");
        button = new JButton(icon);
        button.setFocusable(false);

    }


    public JButton getButton() {
        return button;
    }
}
