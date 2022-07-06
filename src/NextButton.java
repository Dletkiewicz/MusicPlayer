import javax.swing.*;

public class NextButton extends JButton {

    private JButton button;

    NextButton(){

        ImageIcon icon = new ImageIcon("next.png");
        button = new JButton(icon);
        button.setFocusable(false);

    }


    public JButton getButton() {
        return button;
    }
}
