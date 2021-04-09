package Pomocky;

import java.util.Scanner;

public class CisloDavac {

    Scanner sc = new Scanner(System.in);

    public int getCislo (){
        while (true){
            try {
                int a = sc.nextInt();
                return a;
            }catch (Exception e){
                System.out.println("musis zadat cislo");
            }
        }}
        public void scannerEnd (){
        sc.close();
        }
}
