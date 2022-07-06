import javax.swing.*;

public class RepeatButton extends JButton {

    private JButton button;

    RepeatButton(){

        ImageIcon icon = new ImageIcon("repeat.png");
        button = new JButton(icon);
        button.setFocusable(false);

    }


    public JButton getButton() {
        return button;
    }
}
