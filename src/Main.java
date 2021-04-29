import doplnky.TraySysMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Main {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtomPanel;
    JLabel titleNameLabel;
    JButton create, change, split;
    TraySysMenu traySysMenu;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,85);
    Font normalFont = new Font("Times New Roman",Font.PLAIN,28);

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

        // Nadpis = Title
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,100);
        titleNamePanel.setBackground(Color.GRAY);
        titleNameLabel = new JLabel("Team Builder");
        titleNameLabel.setForeground(Color.BLUE);
        titleNameLabel.setFont(titleFont);

        //---------------------------------------------
        // Tlacitka = Buttoms
        startButtomPanel = new JPanel();
        startButtomPanel.setBounds(300,300,200,150);
        startButtomPanel.setBackground(Color.lightGray);

        // Create / Vytvorit
        create = new JButton("Create / Vytvorit");
        create.setBackground(Color.GRAY);
        create.setForeground(Color.BLUE);
        create.setFont(normalFont);

        // Change / Upravit
        change = new JButton("Change / Upravit");
        change.setBackground(Color.GRAY);
        change.setForeground(Color.BLUE);
        change.setFont(normalFont);

        // Split / Rozdelit
        split = new JButton("Split / Rozdelit");
        split.setBackground(Color.GRAY);
        split.setForeground(Color.BLUE);
        split.setFont(normalFont);

        //------------------------------------------------
        // Panels Baby
        titleNamePanel.add(titleNameLabel);
        startButtomPanel.add(create);
        startButtomPanel.add(change);
        startButtomPanel.add(split);

        con.add(titleNamePanel);
        con.add(startButtomPanel);

        // Tray Menu = ikonka v rohu s moznostami..
        traySysMenu = new TraySysMenu();
        traySysMenu.systemTray(window);
        window.addWindowStateListener(new WindowStateListener() {
            @Override
            public void windowStateChanged(WindowEvent e) {
             traySysMenu.eventTray(window);
            }
        });



    }


    }

