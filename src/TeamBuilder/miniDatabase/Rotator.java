package TeamBuilder.miniDatabase;

import TeamBuilder.doplnky.VisibilityManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Rotator {

    /**
     * tento class ma na starost preklopenia Listov Stringov do ineho Listu tak aby sa poradie vzdy posunulo
     * zaroven sa stara aj o cele rotovanie vratane dostupnosti
     *
     * @param employee zoznam zamestnancov..
     * @param listSkillListou zoznam skillsetov zamestnancov ( List Setov )
     * @param listSkillou zoznam pozicii
     * @param availability dostupnost zamestnancov
     * @param  vm Visibility manager.. tuto class pouzijem na zobrazenie kombinacii
     */

    public static void main(List<String> employee, List<List<String>> listSkillListou, List<String> listSkillou, List<Boolean> availability, VisibilityManager vm) {

        List<String> personsRotation = new ArrayList<>();
        List<List<String>> skillSetsRotation = new ArrayList<>();
        List<Boolean> dostupnost = new ArrayList<>();

        int posun = 1;  // o kolko sa posunie poradie (odkial zacne prve pole..)
        int i = 0;      // int do cyklu na presypanie pola do druheho pola (nove pole zacne od zaciatku "0")
        boolean pasuje = true; // ak kazdy ovlada svoju poziciu tak true

        for (int a = 0; a < employee.size(); a++){

            int posun2 = posun; // 1 or more

            while (posun2 < employee.size()){  // 1 (or more) < poctet zamestnancov
                personsRotation.set(i, employee.get(posun2));  // zamestnanecka rotacia
                skillSetsRotation.set(i,listSkillListou.get(posun2)); // rotacia zamestnaneckych skill setov
                dostupnost.set(i,availability.get(posun2));  // rotacia dostupnosti
                i++;
                posun2++;
            }

            posun2 = 0;

            while (posun2 < posun){  // 0 < 1 (or more)
                personsRotation.set(i, employee.get(posun2));// zamestnanecka rotacia (dodanie zaciatku)
                skillSetsRotation.set(i,listSkillListou.get(posun2)); // rotacia zamestnaneckych skill setov (dokoncenie)
                dostupnost.set(i,availability.get(posun2));  // rotacia dostupnosti (ukoncovak)
                i++;
                posun2++;
            }


            //tu overim ci ma zmysel vobec zapisat kombinaciu
                for (List<String> arg : listSkillListou) {
                    for (int b = 0; b<dostupnost.size(); b++){ // POZOR !! tu som dal velkost listu dostupnosti lebo List<List<String>> jave smrdi..<<---
                        if (dostupnost.get(b)){
                     if (!arg.contains(listSkillou.get(b))){
                         pasuje=false;
                         break;
                     }
                    }
                    }
                }

                // samotny zapis kombinacie
            if (pasuje){
                for (int b = 0; b<dostupnost.size() ;b++){ // POZOR !! tu som dal velkost listu dostupnosti lebo List<List<String>> jave smrdi..<<---
                    vm.putCombinationInTextArea();
                }
            }


            // personHelper[a] = personsRotation[a];

            posun++;
            i = 0;
            System.out.println();

        }

    }
}
