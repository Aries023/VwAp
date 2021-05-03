import Rozcestie.Create.CreateV;
import doplnky.TraySysMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtomPanel;
    JLabel titleNameLabel;
    JButton create, modify, split;
    TraySysMenu traySysMenu;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,85);
    Font normalFont = new Font("Times New Roman",Font.PLAIN,28);
    StartMenuHandler startMenuHandler = new StartMenuHandler();


    public static void main(String[] args) {

        new Main();
    }
    public Main(){

        // Okno = Windiow
        window = new JFrame("Team Builder");
        window.setSize(800,600);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.LIGHT_GRAY);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        //---------------------------------------------

        // Nadpis = Title

           // Panel
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,100);
        titleNamePanel.setBackground(Color.GRAY);


           // Label
        titleNameLabel = new JLabel("Team Builder");
        titleNameLabel.setForeground(Color.BLUE);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        //---------------------------------------------

        // Tlacitka = Buttons

        // Panel of buttons = Panel tlacitok
        startButtomPanel = new JPanel();
        startButtomPanel.setBounds(300,300,200,150);
        startButtomPanel.setBackground(Color.lightGray);
        //startButtomPanel.setLayout(new GridLayout(3,1));

           // Create / Vytvorit
        create = new JButton("Create / Vytvorit");
        create.setBackground(Color.GRAY);
        create.setForeground(Color.BLUE);
        create.setFont(normalFont);
        startButtomPanel.add(create);

        create.addActionListener(startMenuHandler);

           // Modify / Upravit
        modify = new JButton("Modify / Upravit");
        modify.setBackground(Color.GRAY);
        modify.setForeground(Color.BLUE);
        modify.setFont(normalFont);
        startButtomPanel.add(modify);

           // Split / Rozdelit
        split = new JButton("Split / Rozdelit");
        split.setBackground(Color.GRAY);
        split.setForeground(Color.BLUE);
        split.setFont(normalFont);
        startButtomPanel.add(split);

        //------------------------------------------------

        // Container (okno)

        con.add(titleNamePanel);
        con.add(startButtomPanel);

        //------------------------------------------------

        // Miniatura = TraySystem

        // Tray Menu = ikonka v rohu s moznostami..
        traySysMenu = new TraySysMenu();
        traySysMenu.systemTray(window);
        window.addWindowStateListener(e -> traySysMenu.eventTray(window));


    }

    public class StartMenuHandler implements ActionListener{

        CreateV createV = new CreateV();

        @Override
        public void actionPerformed(ActionEvent e) {
            titleNamePanel.setVisible(false);
            startButtomPanel.setVisible(false);
            createV.createTBScreen(con,normalFont);
        }
    }

    }

