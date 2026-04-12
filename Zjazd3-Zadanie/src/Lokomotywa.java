public class Lokomotywa extends Maszyna {
    private double maksymalnaPredkosc;
    private int iloscWagonow;

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
        System.out.println();
    }
}