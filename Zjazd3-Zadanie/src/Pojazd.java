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
        maxLiczbaPojazdow = 1;
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
    }
}