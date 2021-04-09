package Pomocky;

import java.util.Scanner;

public class ScanDavac {

    Scanner sc = new Scanner(System.in);

    public int getCislo (){
        while (true){
            try {
                return sc.nextInt();
            }catch (Exception e){
                System.out.println("musis zadat cislo");
            }
        }}
        public void scannerEnd (){
        sc.close();
        }


    public String getSlovo (){
        while (true){
            try {
                return sc.nextLine();
            }catch (Exception e){
                System.out.println("je tu chyba so Stringom.. dajte prosim vediet mojim tvorcom");
            }
        }}
}
