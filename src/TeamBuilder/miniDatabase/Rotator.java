package TeamBuilder.miniDatabase;

public class Rotator {

    public static void main(String[] args) {

        String[] persons = new String[]{"Peter ", "Brano ", "Karol ", "Daniel "};
        String[] personsRotation = new String[persons.length];
        String[] personCombinations = new String[persons.length];

        int posun = 1;  // o kolko sa posunie poradie
        int i = 0;      // int do cyklu

        for (int a = 0; a < persons.length; a++){

            int posun2 = posun; // 1

            while (posun2 < persons.length){  // 1 < 4
                personsRotation[i] = persons[posun2];
                i++;
                posun2++;
            }

            posun2 = 0;

            while (posun2 < posun){  // 0 < 1
                personsRotation[i] = persons[posun2];
                i++;
                posun2++;
            }

            for (String arg : personsRotation){
                System.out.println(arg + " ");
            }


            // personHelper[a] = personsRotation[a];

            posun++;
            i = 0;
            System.out.println();

        }

    }
}
