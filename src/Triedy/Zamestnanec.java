package Triedy;

import java.util.ArrayList;
import java.util.List;

public class Zamestnanec {
    String meno;
    String telCislo;
    String osobneCislo;
    int cisloVyrobenychZamestnancov = 0; // poradie zamestnancov
    List <String> ovladanePozicie;

    public Zamestnanec(String meno, String telCislo, String osobneCislo, List<String> ovladanePozicie) {
        cisloVyrobenychZamestnancov++;
        this.meno = meno;
        this.telCislo = telCislo;
        this.osobneCislo = osobneCislo;
        this.ovladanePozicie = ovladanePozicie;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getTelCislo() {
        return telCislo;
    }

    public void setTelCislo(String telCislo) {
        this.telCislo = telCislo;
    }

    public String getOsobneCislo() {
        return osobneCislo;
    }

    public void setOsobneCislo(String osobneCislo) {
        this.osobneCislo = osobneCislo;
    }
}