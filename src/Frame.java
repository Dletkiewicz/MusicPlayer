import javax.swing.*;
import java.awt.*;

public class Frame {

    JFrame frame;
    PlayButton playButton = new PlayButton();
    RepeatButton repeatButton = new RepeatButton();
    StopButton stopButton = new StopButton();
    NextButton nextButton = new NextButton();
    PreviousButton previousButton = new PreviousButton();

    Frame(){

        frame = new JFrame("Music Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());


        frame.add(playButton.getButton());
        frame.add(repeatButton.getButton());
        frame.add(stopButton.getButton());
        frame.add(nextButton.getButton());
        frame.add(previousButton.getButton());

        frame.setVisible(true);

    }
}
