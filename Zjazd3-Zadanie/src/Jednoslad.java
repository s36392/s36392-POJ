public class Jednoslad extends Pojazd{

    private typJednosladu typ;
    enum typJednosladu{
        MOTOCYKL,
        ROWER,
        HULAJNOGA,
        SKUTER
    }

    public Jednoslad(String marka,
                     String nazwa,
                     double pojemnoscSilnika,
                     rodzajSilnika silnik,
                     typJednosladu typ,
                     double moc,
                     double momentObrotowy) {
        super(moc, momentObrotowy);
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.silnik = silnik;
        this.typ = typ;
    }

    public Jednoslad(String marka, String nazwa, typJednosladu typ) {
        super(0.0, 0.0);
        this.marka = marka;
        this.nazwa = nazwa;
        this.typ = typ;
    }

    public void wyswietl() {
        System.out.println("Jednoslad jest marki: " + marka);
        System.out.println("Nazywa sie: " + nazwa);
        if (pojemnoscSilnika > 0)
            System.out.println("Pojemnosc silnika wynosi: " + pojemnoscSilnika + " litrow");
        if (silnik != null)
            System.out.println("Rodzaj silnika: " + silnik);
        System.out.println("Rodzaj jednosladu: " + typ);
        System.out.println("Nr pojazdu: " + nrPojazdu + "/" + maxLiczbaPojazdow);
        System.out.println();
    }
}
