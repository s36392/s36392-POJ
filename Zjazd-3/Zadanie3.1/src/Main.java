import java.lang.String;
import java.lang.System;

//Zadanie 1


public static abstract class Maszyna{
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected rodzajSilnika silnik;

    protected enum rodzajSilnika{
        ELEKTRYCZNY,
        HYBRYDOWY,
        SPALINOWY,
    }

}



//Zadanie 2

public static class Lokomotywa extends Maszyna {
    protected double maksymalnaPredkosc;
    protected int iloscWagonow;

    public Lokomotywa(String marka,
                      String nazwa,
                      double pojemnoscSilnika,
                      rodzajSilnika silnik,
                      double maksymalnaPredkosc,
                      int iloscWagonow){
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.silnik = silnik;
        this.maksymalnaPredkosc = maksymalnaPredkosc;
        this.iloscWagonow = iloscWagonow;

    }

    public void wyswietl() {
        System.out.println("Lokomotywa jest marki: " + marka);
    }
}

//Zadanie 3

public static class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

}

//Zadanie 4

public static class Pojazd extends Maszyna {
    protected double moc;
    protected double momentObrotowy;
    int nrPojazdu;
    static int maxLiczbaPojazdow;

    public Pojazd(int nrPojazdu, int maxLiczbaPojazdow){
        this.nrPojazdu = nrPojazdu;
        this.maxLiczbaPojazdow = maxLiczbaPojazdow;
    }
}

public static void main(String[] args) {
    Lokomotywa lok = new Lokomotywa(
            "Ford",                         // marka
            "Intercity",                    // nazwa
            2.0,                            // pojemnoscSilnika
            Maszyna.rodzajSilnika.ELEKTRYCZNY,      // silnik
            200.0,                          // maksymalnaPredkosc
            5                               // iloscWagonow
    );

    lok.wyswietl(); // prints: Lokomotywa jest marki: Ford
}
