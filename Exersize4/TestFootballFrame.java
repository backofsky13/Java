

import javax.swing.*;

public class TestFootballFrame {

    public static void main(String[] args) {
        FootballFrame footballFrame = new FootballFrame("Score Table");
        footballFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        footballFrame.pack();
        footballFrame.setSize(900, 600);
        footballFrame.setVisible(true);
    }
}
