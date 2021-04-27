import javax.swing.*;
import java.awt.*;

public class Main {

    JFrame window;

    public static void main(String[] args) {

        new Main();
    }
    public Main(){
        window = new JFrame("Team Builder");
        window.setSize(800,600);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.LIGHT_GRAY);
        window.setLayout(null);
        window.setVisible(true);

    }
}
