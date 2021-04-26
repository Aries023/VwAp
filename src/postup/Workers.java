package postup;

import Pomocky.ScanDavac;
import Triedy.Zamestnanec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Workers {
    ScanDavac sc = new ScanDavac();

    public void zamestnanecMapa(HashMap<Byte,Zamestnanec> arg){
        byte IDZamestnanca = 0;

        do {

            // meno zamestnanca..
            System.out.println("zadaj meno zamestnanca");
            String name = sc.getSlovo();

            // tel. cislo zamestnanca
            if (IDZamestnanca == 0) {
                System.out.println("ako spravny nadriadeny, ktory pouziva aj tento program by si mal mat tel. cislo");
            }
            System.out.println("zadaj tel. cislo zamestnanca");
            String telCislo = sc.getSlovo();

            // osobne cislo zamestnanca
            if (IDZamestnanca == 0) {
                System.out.println("Velke firmy pouzivaju osobne cislo ako identifikator zamestnanca, ak vsak vo firme nemate osobne cisla,");
                System.out.println("mozete namiesto osobneho cisla pouzit prezyvku");
            }
            System.out.println("zadajte osobne cislo / prezyvku zamestnanca");
            String osobneCislo = sc.getSlovo();


            // List pozicii ktore zamestnanec ovlada
            List<String> pozicie = new ArrayList<>();
            /**
             *
             * sem treba vlozit okno kde budem vyberat z ktore pozicie zamestnanec ovlada
             *
             */


            // ucelenie zamestnanca a samotna tvorba (instancia Zaestnanca)
//            Zamestnanec z = new Zamestnanec(name, telCislo, osobneCislo);
//            arg.put(++IDZamestnanca, z);
//            System.out.println("ak mame vsetkych zamestnancov napis koniec inak pokracujeme dalej");

        } while (!sc.getSlovo().equalsIgnoreCase("koniec"));
    }

    public void koniec (){
        sc.scannerEnd();
    }
}
