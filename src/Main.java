import Triedy.Zamestnanec;
import postup.Jobs;
import postup.Workers;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Frame ===========
        JFrame okno = new JFrame("V.w. Switch na pozicie");
        JButton but1 = new JButton("Novy team / pozicie");           // vytvori
        JButton but2 = new JButton("Existujuci team / pozicie");    // upravy existujuci team
        JButton but3 = new JButton("Rozdelit team");                // rozdeli existujuci team
        JLabel nadpis = new JLabel("<html><span style='font-size:30px'>Manager teamu</span></html>");

        // Okno..
        okno.setVisible(true);
        okno.setResizable(false);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(800,600);
        okno.setLayout(null);
        okno.add(nadpis);
        //okno.getContentPane().setBackground(Color.BLACK);
        nadpis.setBounds(250,50,600,150);
        nadpis.setForeground(Color.RED);


        // Tlacitka
        okno.add(but1);
        but1.setBounds(300,220,200,50);

        okno.add(but2);
        but2.setBounds(300,300, 200,50);

        okno.add(but3);
        but3.setBounds(300,380,200,50);



        // premenne..
        HashMap <Byte,String> pozicie = new HashMap<>();
        HashMap <Byte, Zamestnanec> slaves = new HashMap<>();


        // pomocne triedy
        Jobs jobs = new Jobs();
        Workers workers = new Workers();


        //priebeh
        jobs.jobMap(pozicie);  // tu si dostaneme pozicie alebo pracovne miesta
        workers.zamestnanecMapa(slaves);  // tu dostaneme momentalnych zamestnancov
        System.out.println(slaves);

        workers.koniec();
    }
}
