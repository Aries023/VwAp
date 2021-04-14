import Triedy.Zamestnanec;
import postup.Jobs;
import postup.Workers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
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
