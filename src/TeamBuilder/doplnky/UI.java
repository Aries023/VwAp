package TeamBuilder.doplnky;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class UI {
    /**
     * UI je class pre surovy Frame.. pojdu sem iba hotove veci z triedy Main (cez konstruktor) v ktorej je spravena instancia tejto triedy
     * a rozposiela tu instanciu do dalsich class kde s touto class (UI) mozu pracovat bez zbytocnych problemov
     *
     * @param datumArg  => sem pride dnesny datum
     * @param denArg    => sem pride co je dneska za den
     */

    public UI(String datumArg, String denArg) {
        this.date = datumArg;
        this.day = denArg;
    }

    JFrame window;
    JPanel titlePanel, startButtlonP, mainTextPanel, choiceBP, jobsP, teamP, statusPanel, obrazokTitlePanel1, obrazokTitlePanel2, dateP, dayP, versionP, ariP, jobsTextAreaP, jobCButP;
    JLabel titleLabel, employeButP, employeNumberPanel, jobPanel, jobNumberPanel,titleImage, titleImage2;
    JButton startB, jobsB, teamB, divideB, backB, createJobs, modifiJobs, backJobsB, createEmploye, modifiTeam, backEmployeB, jobBImput, jobBIDone;
    JTextArea mainTextArea, dayTextArea, dateTextArea, verTA, ariTA, jobsTextArea;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
    Font normalFont = new Font("Times New Roman",Font.PLAIN,26);
    Font normalFontMini = new Font("Times New Roman",Font.PLAIN,15);
    String day,date,ver;
    byte jobsNumber , employeeNumber;

    public void createUI(ChoiceHandler choiceHandler, ClickerHandler clickerHandler){

        // Window
        window = new JFrame();
        window.setSize(800,600);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window.setLayout(null);


        // Title Screen

          // Title
        titlePanel = new JPanel();
        titlePanel.setBounds(100,150,600,120);
        titlePanel.setBackground(Color.GRAY);
        titleLabel = new JLabel("Team Builder");
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel);

          // Start Button
        startButtlonP = new JPanel();
        startButtlonP.setBounds(300,400,200,100);
        //startButtlonPanel.setBackground(Color.cyan);
        startB = new JButton("Start");
        startB.setBackground(Color.GRAY);
        startB.setForeground(Color.BLUE);
        startB.setFont(normalFont);
        startB.setFocusPainted(false);
        startB.addActionListener(choiceHandler);
        startB.setActionCommand("start");
        startButtlonP.add(startB);

          // Image -----------------
        try {
            titleImage = new JLabel(new ImageIcon(ImageIO.read(Objects.requireNonNull(UI.class.getResourceAsStream("/Res/icon.png")))));
            titleImage2 = new JLabel(new ImageIcon(ImageIO.read(Objects.requireNonNull(UI.class.getResourceAsStream("/Res/icon.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        obrazokTitlePanel1 = new JPanel();
        obrazokTitlePanel1.setBounds(0,0,100,100);
        obrazokTitlePanel2 = new JPanel();
        obrazokTitlePanel2.setBounds(685,0,100,100);

        obrazokTitlePanel1.add(titleImage);
        obrazokTitlePanel2.add(titleImage2);

          // Date / Day
        dateP = new JPanel();
        dateP.setBounds(0,540,82,20);
        //dateP.setLayout(new CardLayout());
        //datePanel.setBackground(Color.GRAY);
        dateTextArea = new JTextArea(date);

        dateTextArea.setForeground(Color.BLUE);
        dateTextArea.setFont(normalFontMini);
        dateTextArea.setEditable(false);
        dateP.add(dateTextArea);

        dayP = new JPanel();
        dayP.setBounds(0,520,82,20);
        //dayP.setLayout(new CardLayout());
        //dayPanel.setBackground(Color.red);
        dayTextArea = new JTextArea(day);
        dayTextArea.setForeground(Color.BLUE);
        dayTextArea.setFont(normalFontMini);
        dayTextArea.setEditable(false);
        dayP.add(dayTextArea);

          // Version
        versionP = new JPanel();
        versionP.setBounds(700,520,82,20);
        ver = "ver: 0.33";
        verTA = new JTextArea(ver);
        verTA.setForeground(Color.BLUE);
        verTA.setFont(normalFontMini);
        verTA.setEditable(false);
        versionP.add(verTA);

          // Autor
        ariP = new JPanel();
        ariP.setBounds(690,540,92,20);
        ariTA = new JTextArea("Autor: Aries023");
        ariTA.setForeground(Color.BLUE);
        ariTA.setFont(normalFontMini);
        ariTA.setEditable(false);
        ariP.add(ariTA);


        window.add(ariP);
        window.add(titlePanel);
        window.add(startButtlonP);
        window.add(obrazokTitlePanel1);
        window.add(obrazokTitlePanel2);
        window.add(dateP);
        window.add(dayP);
        window.add(versionP);

        //---------------------------------------------------------------------

        // Work Screen

          // Main Text
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("""
                Now choose whether you want to create jobs, employees or divide the team into jobs.
                \s
                And don't forget to make a smile on your workmates""");
        mainTextArea.setBounds(mainTextPanel.getBounds());
        mainTextArea.setBackground(Color.GRAY);
        mainTextArea.setForeground(Color.BLUE);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

          // Buttons
        choiceBP = new JPanel();
        choiceBP.setBounds(250,350,350,150);
        choiceBP.setBackground(Color.GRAY);
        choiceBP.setLayout(new GridLayout(4,1));
        window.add(choiceBP);

        jobsB = new JButton("Create");
        jobsB.setForeground(Color.BLUE);
        jobsB.setFont(normalFont);
        jobsB.setFocusPainted(false);
        jobsB.addActionListener(choiceHandler);
        jobsB.setActionCommand("ch1");
        choiceBP.add(jobsB);

        teamB = new JButton("Adjust");
        teamB.setForeground(Color.BLUE);
        teamB.setFont(normalFont);
        teamB.setFocusPainted(false);
        teamB.addActionListener(choiceHandler);
        teamB.setActionCommand("ch2");
        choiceBP.add(teamB);

        divideB = new JButton("Divide");
        divideB.setForeground(Color.BLUE);
        divideB.setFont(normalFont);
        divideB.addActionListener(choiceHandler);
        divideB.setActionCommand("ch3");
        choiceBP.add(divideB);

        backB = new JButton("Back to Menu");
        backB.setForeground(Color.BLUE);
        backB.setFont(normalFont);
        backB.addActionListener(choiceHandler);
        backB.setActionCommand("ch4");
        choiceBP.add(backB);

          // Status Panel

        statusPanel = new JPanel();
        statusPanel.setBounds(110,15,585,50);
        // statusPanel.setBackground(Color.LIGHT_GRAY);
        statusPanel.setLayout(new GridLayout(1,4));
        window.add(statusPanel);


        employeButP = new JLabel("Employees");
        // employePanel.setBackground(Color.LIGHT_GRAY);
        employeButP.setForeground(Color.BLUE);
        employeButP.setFont(normalFont);
        statusPanel.add(employeButP);

        employeNumberPanel = new JLabel();
        employeNumberPanel.setForeground(Color.BLUE);
        employeNumberPanel.setFont(normalFont);
        statusPanel.add(employeNumberPanel);

        employeeNumber = 0;
        employeNumberPanel = new JLabel(String.valueOf(employeeNumber));
        employeNumberPanel.setForeground(Color.BLUE);
        employeNumberPanel.setFont(normalFont);
        statusPanel.add(employeNumberPanel);

        jobPanel = new JLabel("Jobs");
        jobPanel.setForeground(Color.BLUE);
        jobPanel.setFont(normalFont);
        statusPanel.add(jobPanel);

        jobsNumber = 0;
        jobNumberPanel = new JLabel(String.valueOf(jobsNumber));
        jobNumberPanel.setForeground(Color.BLUE);
        jobNumberPanel.setFont(normalFont);
        statusPanel.add(jobNumberPanel);



        //---------------------------------------------------------------------

        // Creating Screen
        jobsP = new JPanel();
        jobsP.setBounds(250,350,350,150);
        jobsP.setBackground(Color.GRAY);
        jobsP.setLayout(new GridLayout(3,1));
        window.add(jobsP);

        createJobs = new JButton("Create your jobs");
        createJobs.setForeground(Color.BLUE);
        createJobs.setFont(normalFont);
        createJobs.addActionListener(choiceHandler);
        createJobs.setActionCommand("createJobs");
        jobsP.add(createJobs);

        modifiJobs = new JButton("Create your team");
        modifiJobs.setForeground(Color.BLUE);
        modifiJobs.setFont(normalFont);
        modifiJobs.addActionListener(choiceHandler);
        modifiJobs.setActionCommand("createTeam");
        jobsP.add(modifiJobs);

        backJobsB = new JButton("Back");
        backJobsB.setForeground(Color.BLUE);
        backJobsB.setFont(normalFont);
        backJobsB.addActionListener(choiceHandler);
        backJobsB.setActionCommand("start");
        jobsP.add(backJobsB);

        // Jobs create screen
        jobsTextAreaP = new JPanel();
        jobsTextAreaP.setBounds(180,150,450,50);
        window.add(jobsTextAreaP);

        jobsTextArea = new JTextArea();
        jobsTextArea.setBounds(jobsTextAreaP.getBounds());
        jobsTextArea.setForeground(Color.BLUE);
        jobsTextArea.setFont(normalFont);
        jobsTextArea.setLineWrap(true);
        jobsTextArea.setWrapStyleWord(true);
        jobsTextAreaP.add(jobsTextArea);

        jobCButP = new JPanel();
        jobCButP.setBounds(180,210,450,80);
        window.add(jobCButP);

        jobBImput = new JButton("Next");
        jobBImput.setForeground(Color.BLUE);
        jobBImput.setFont(normalFontMini);
        // jobBImput.addKeyListener(clickerHandler);
        jobBImput.addActionListener(choiceHandler);
        jobBImput.setActionCommand("takeJob");
        jobCButP.add(jobBImput);

        jobBIDone = new JButton("End");
        jobBIDone.setForeground(Color.BLUE);
        jobBIDone.setFont(normalFontMini);
        // jobBImput.addKeyListener(clickerHandler);
        jobBIDone.addActionListener(choiceHandler);
        jobBIDone.setActionCommand("ch1");
        jobCButP.add(jobBIDone);

        //---------------------------------------------------------------------

        // Team create Screen
        teamP = new JPanel();
        createEmploye = new JButton("next");
        createEmploye.setForeground(Color.BLUE);
        createEmploye.setFont(normalFontMini);
        // jobBImput.addKeyListener(clickerHandler);
        createEmploye.addActionListener(choiceHandler);
        createEmploye.setActionCommand("takeEmploye");
        teamP.add(createEmploye);

        window.setVisible(true);
    }
}
