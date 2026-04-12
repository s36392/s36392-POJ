public class Pojazd extends Maszyna {
    protected double moc;
    protected double momentObrotowy;
    int nrPojazdu;
    static int maxLiczbaPojazdow;

    public Pojazd(int nrPojazdu, int maxLiczbaPojazdow){
        this.nrPojazdu = nrPojazdu;
    }
}