public class Jednoslad extends Pojazd{

    public Jednoslad(int nrPojazdu,
                     int maxLiczbaPojazdow,
                     String marka,
                     String nazwa,
                     double pojemnoscSilnika,
                     rodzajSilnika silnik,
                     typJednosladu typ) {
        super(nrPojazdu, maxLiczbaPojazdow);
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.silnik = silnik;
    }

    enum typJednosladu{
        MOTOCYKL,
        ROWER,
        HULAJNOGA,
        SKUTER
    }

    public void wyswietl(){
        System.out.println("Samochod jest marki: " + marka);
        System.out.println("Nazywa sie: " + nazwa);
        System.out.println("Pojemnosc silnika wynosi: " + pojemnoscSilnika + " litrow");
        System.out.println("Rodzaj silnika: " + silnik);
        System.out.println("Rodzaj jednosladu: " + typ);
        System.out.println("Nr pojazdu: " + nrPojazdu + "/" + maxLiczbaPojazdow);
        System.out.println();
    }
}
