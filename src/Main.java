import postup.Jobs;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // premenne..
        HashMap <Byte,String> pozicie = new HashMap<Byte,String>();
        // postupove pomocky
        Jobs jobs = new Jobs();

        //priebeh
        jobs.jobMap(pozicie);
    }
}
