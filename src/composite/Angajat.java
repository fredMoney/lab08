package composite;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements iAngajat {
    String nume;
    String pozitie;
    int codAngajat;
    float salariu;
    List<Angajat> listaSubordonati;

    public Angajat(String nume, String pozitie, int codAngajat, float salariu, List<Angajat> listaSubordonati) {
        this.nume = nume;
        this.pozitie = pozitie;
        this.codAngajat = codAngajat;
        this.salariu = salariu;
        this.listaSubordonati = listaSubordonati;
    }

    public Angajat(String nume, String pozitie, float salariu) {
        this.nume = nume;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.listaSubordonati = new ArrayList<>();
    }

    @Override
    public void printDetalii() {
        System.out.println(nume + ", " + pozitie + ", " + salariu);
    }

    void printSubordonati() {
        for(Angajat subordonat : listaSubordonati) {
            subordonat.printDetalii();
            subordonat.printSubordonati();
        }
    }

    void addSubordonat(Angajat subordonat) {
        listaSubordonati.add(subordonat);
    }

    void delSubordonat(Angajat subordonat) {
        listaSubordonati.remove(subordonat);
    }

    boolean isFrunza() {
        return listaSubordonati.isEmpty();
    }
}
