package Rozcestie.Create;

import javax.swing.*;
import java.awt.*;

public class CreateV {
    JPanel mainTextPanel;
    JTextArea mainTextArea;

    public void createTBScreen(Container con, Font font){
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("test");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.cyan);
        mainTextArea.setForeground(Color.red);
        mainTextArea.setFont(font);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);
    }

}
