public class Pojazd extends Maszyna {
    protected double moc;
    protected double momentObrotowy;
    int nrPojazdu;
    static int maxLiczbaPojazdow;
    private static int index = 0;

    public Pojazd(double moc,
                  double momentObrotowy){
        nrPojazdu = index;
        index++;
        maxLiczbaPojazdow = 8;
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
    }

    public void wyswietl() {
        System.out.println("Nr pojazdu: " + nrPojazdu + "/" + maxLiczbaPojazdow);
        System.out.println("Moc: " + moc);
        System.out.println("Moment obrotowy: " + momentObrotowy);
        System.out.println();
    }

}