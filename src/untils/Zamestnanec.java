package untils;

public class Zamestnanec {
    String meno = "este nema meno";
    String telCislo = "zatial nieje ziadne";
    String osobneCislo = "zatial nema";
    int cisloVyrobenychZamestnancov = 0;

    public Zamestnanec(String meno, String telCislo, String osobneCislo) {
        cisloVyrobenychZamestnancov++;
        this.meno = meno;
        this.telCislo = telCislo;
        this.osobneCislo = osobneCislo;
    }
}