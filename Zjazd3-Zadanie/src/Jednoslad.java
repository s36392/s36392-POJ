public class Jednoslad extends Pojazd{

    public Jednoslad(int nrPojazdu,
                     int maxLiczbaPojazdow,
                     String marka,
                     String nazwa,
                     double pojemnoscSilnika,
                     rodzajSilnika silnik,
                     typ typ) {
        super(nrPojazdu, maxLiczbaPojazdow);
    }

    enum typ{
        MOTOCYKL,
        ROWER,
        HULAJNOGA,
        SKUTER
    }
}
