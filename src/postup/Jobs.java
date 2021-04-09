package postup;

import Pomocky.ScanDavac;
import java.util.HashMap;

public class Jobs {

    // pomocky
    ScanDavac sc = new ScanDavac();

    // metoda ktora zoskupi pozicie
    public HashMap<Byte,String> jobMap (HashMap<Byte,String> pozicie){
        byte IDPozicie = 0;
        while (true) {
            System.out.println("zadaj prosim nazov pozicii ktoru chces pridat");
            pozicie.put(++IDPozicie, sc.getSlovo());
            System.out.println("ak su zadane vsetky pozicie, napis koniec. inak zadaj lubovolny text (pocet pozicii "+IDPozicie+")");
            if (sc.getSlovo().equalsIgnoreCase("koniec")){
                System.out.println("toto su vytvorene pozicie : "+ pozicie.values());
                return pozicie;
            }
        }
    }


}
