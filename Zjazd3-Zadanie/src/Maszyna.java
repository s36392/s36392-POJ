public abstract class Maszyna{
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