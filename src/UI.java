import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame window;
    JPanel titlePanel, startButtlonPanel;
    JLabel titleLabel;
    JButton startButton;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
    Font normalFont = new Font("Times New Roman",Font.PLAIN,26);

    public void createUI(){

        // Window
        window = new JFrame();
        window.setSize(800,600);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window.setLayout(null);


        // Title Screen
        titlePanel = new JPanel();
        titlePanel.setBounds(100,100,600,120);
        titlePanel.setBackground(Color.GRAY);
        titleLabel = new JLabel("Team Builder");
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel);

        startButtlonPanel = new JPanel();
        startButtlonPanel.setBounds(300,400,200,100);
        //startButtlonPanel.setBackground(Color.cyan);
        startButton = new JButton("Start");
        startButton.setBackground(Color.GRAY);
        startButton.setForeground(Color.BLUE);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButtlonPanel.add(startButton);

        window.add(titlePanel);
        window.add(startButtlonPanel);

        window.setVisible(true);
    }
}
