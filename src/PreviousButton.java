import javax.swing.*;

public class PreviousButton extends JButton {

    private JButton button;

    PreviousButton(){

        ImageIcon icon = new ImageIcon("previous.png");
        button = new JButton(icon);
        button.setFocusable(false);

    }


    public JButton getButton() {
        return button;
    }
}
