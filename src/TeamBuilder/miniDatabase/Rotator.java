package TeamBuilder.miniDatabase;

import TeamBuilder.doplnky.VisibilityManager;

import java.util.ArrayList;
import java.util.List;

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
                personsRotation.add(i, employee.get(posun2));  // zamestnanecka rotacia
                skillSetsRotation.add(i,listSkillListou.get(posun2)); // rotacia zamestnaneckych skill setov
                dostupnost.add(i,availability.get(posun2));  // rotacia dostupnosti
                i++;
                posun2++;
            }

            posun2 = 0;

            while (posun2 < posun){  // 0 < 1 (or more)
                personsRotation.add(i, employee.get(posun2));// zamestnanecka rotacia (dodanie zaciatku)
                skillSetsRotation.add(i,listSkillListou.get(posun2)); // rotacia zamestnaneckych skill setov (dokoncenie)
                dostupnost.add(i,availability.get(posun2));  // rotacia dostupnosti (ukoncovak)
                i++;
                posun2++;
            }


            //tu overim ci ma zmysel vobec zapisat kombinaciu
                for (List<String> arg : skillSetsRotation) {
                    for (int b = 0; b<listSkillou.size(); b++){ // listSkillou pretoze => skillSetsRotation by malo index mimo range.. (kedze .size pocita aj vnutorne indexi)
                        if (dostupnost.get(b)){ // ci je zamestnanec dostupny
                     if (!arg.contains(listSkillou.get(b))){ // ak danu poziciu neovlada, cela kombinacia je zla a ide sa dalej
                         pasuje=false;
                         break;
                     }
                    }
                    }
                }

                // samotny zapis kombinacie
            if (pasuje){                                           // ak kazdy ovlada svoju poziciu
                for (int b = 0; b<skillSetsRotation.size() ;b++){ // podla poctu Listov pozicii..<<---
                    if (dostupnost.get(b)){                      // ak je zamestnanec dostupny
                        vm.putCombinationInTextArea(  listSkillou.get(b) + "=" + personsRotation.get(b) + "  ");
                    }
                }
            }


            // personHelper[a] = personsRotation[a];

            posun++;
            i = 0;
            System.out.println();

        }

    }
}
