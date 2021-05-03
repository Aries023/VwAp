package Rozcestie.Create;

import javax.swing.*;
import java.awt.*;

public class CreateV {
    JPanel mainTextPanel, statusPanel;
    JTextArea mainTextArea;

    public void createTBScreen(Container con, Font font){



        // Panel s textom
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.lightGray);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("""
                Vyber si ci chces vytvorit zamestnanca, poziciu alebo skontrolovat a ulozit.
                \s
                Make a choice to create employe, work position or just check and save.""");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.gray);
        mainTextArea.setForeground(Color.blue);
        mainTextArea.setFont(font);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        //---------------------------------------------

        // Panel s hodnotami
        statusPanel = new JPanel();
        statusPanel.setBounds(100,15,600,50);
        statusPanel.setBackground(Color.blue);
        statusPanel.setLayout(new GridLayout(1,4));
        con.add(statusPanel);

        // test
        JPanel panelTest = new JPanel();
        panelTest.setBounds(0,0,100,100);
        panelTest.setBackground(Color.cyan);
        con.add(panelTest);
    }

}
