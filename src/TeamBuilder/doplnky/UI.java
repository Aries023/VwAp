package TeamBuilder.doplnky;

import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame window;
    JPanel titlePanel, startButtlonPanel, mainTextPanel, choiceButtonPanel, statusPanel;
    JLabel titleLabel, employePanel, employeNumberPanel, jobPanel, jobNumberPanel;
    JButton startButton, choice1, choice2, choice3;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
    Font normalFont = new Font("Times New Roman",Font.PLAIN,26);

    public void createUI(ChoiceHandler choiceHandler){

        // Window
        window = new JFrame();
        window.setSize(800,600);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window.setLayout(null);


        // Title Screen

          // Title
        titlePanel = new JPanel();
        titlePanel.setBounds(100,100,600,120);
        titlePanel.setBackground(Color.GRAY);
        titleLabel = new JLabel("Team Builder");
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel);

          // Button
        startButtlonPanel = new JPanel();
        startButtlonPanel.setBounds(300,400,200,100);
        //startButtlonPanel.setBackground(Color.cyan);
        startButton = new JButton("Start");
        startButton.setBackground(Color.GRAY);
        startButton.setForeground(Color.BLUE);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(choiceHandler);
        startButton.setActionCommand("start");
        startButtlonPanel.add(startButton);

        window.add(titlePanel);
        window.add(startButtlonPanel);

        //---------------------------------------------------------------------

        // Work Screen

          // Main Text
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.cyan);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("text area numero fantastic text");
        // mainTextArea.setBounds(100,100,600,250);
        // mainTextArea.setBackground(Color.green);
        mainTextArea.setForeground(Color.BLUE);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        // mainTextArea.setWrapStyleWord(true);
        // mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

          // Buttons
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,350,150);
        choiceButtonPanel.setBackground(Color.ORANGE);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        choice1 = new JButton("Create Team");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.BLUE);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("ch1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("modificate Team");
        choice2.setBackground(Color.LIGHT_GRAY);
        choice2.setForeground(Color.BLUE);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("ch2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Spin Team");
        // choice3.setBackground(Color.LIGHT_GRAY);
        choice3.setForeground(Color.BLUE);
        choice3.setFont(normalFont);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("ch3");
        choiceButtonPanel.add(choice3);

          // Status Panel

        statusPanel = new JPanel();
        statusPanel.setBounds(100,15,600,50);
        // statusPanel.setBackground(Color.LIGHT_GRAY);
        statusPanel.setLayout(new GridLayout(1,4));
        window.add(statusPanel);


        employePanel = new JLabel("Employe");
        // employePanel.setBackground(Color.LIGHT_GRAY);
        employePanel.setForeground(Color.BLUE);
        employePanel.setFont(normalFont);
        statusPanel.add(employePanel);

        employeNumberPanel = new JLabel();
        employeNumberPanel.setForeground(Color.BLUE);
        employeNumberPanel.setFont(normalFont);
        statusPanel.add(employeNumberPanel);

        jobPanel = new JLabel("Jobs");
        jobPanel.setForeground(Color.BLUE);
        jobPanel.setFont(normalFont);
        statusPanel.add(jobPanel);

        jobNumberPanel = new JLabel();
        jobNumberPanel.setForeground(Color.BLUE);
        jobNumberPanel.setFont(normalFont);
        statusPanel.add(jobNumberPanel);


        window.setVisible(true);
    }
}
