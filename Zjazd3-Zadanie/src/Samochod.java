public class Samochod extends Pojazd {
    private segmentAuta segment;
    private int VIN;

    public Samochod(
            String marka,
            String nazwa,
            double pojemnoscSilnika,
            rodzajSilnika silnik,
            segmentAuta segment,
            int VIN,
            int nrPojazdu,
            int maxLiczbaPojazdow) {
        super(nrPojazdu, maxLiczbaPojazdow);
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.silnik = silnik;
        this.segment = segment;
        this.VIN = VIN;
    }

    enum segmentAuta{A,B,C,D,E,F,G,H,J,M};

    public void wyswietl(){
        System.out.println("Samochod jest marki: " + marka);
        System.out.println("Nazywa sie: " + nazwa);
        System.out.println("Pojemnosc silnika wynosi: " + pojemnoscSilnika + " litrow");
        System.out.println("Rodzaj silnika: " + silnik);
        System.out.println("Segment auta: " + segment);
        System.out.println("Nr VIN: " + VIN);
        System.out.println("Nr pojazdu: " + nrPojazdu + "/" + maxLiczbaPojazdow);
        System.out.println();
    }
}