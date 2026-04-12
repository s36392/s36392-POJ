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
        System.out.println("Nazywa sie: " + nazwa);
        System.out.println("Pojemnosc silnika wynosi: " + pojemnoscSilnika + " litrow");
        System.out.println("Rodzaj silnika: " + silnik);
        System.out.println("Maksymalna predkosc wynosi: " + maksymalnaPredkosc + " Km/h");
        System.out.println("Jest w stanie pociagnac " + iloscWagonow + " wagonow");
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
    }
}

public static class Samochod extends Pojazd {
    public Samochod(int nrPojazdu, int maxLiczbaPojazdow) {
        super(nrPojazdu, maxLiczbaPojazdow);
    }

    enum segment{A,B,C,D,E,F,G,H,J,M};
    int VIN;
}

public static void main(String[] args) {

}
