import javax.swing.*;

public class StopButton extends JButton {

    private JButton button;

    StopButton(){

        ImageIcon icon = new ImageIcon("pause.png");
        button = new JButton(icon);
        button.setFocusable(false);

    }


    public JButton getButton() {
        return button;
    }
}
