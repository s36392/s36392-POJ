public class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka,
                    String nazwa,
                    double pojemnoscSilnika,
                    rodzajSilnika silnik,
                    boolean czyMelekser,
                    boolean czyNaped,
                    int liczbaOstrzy){
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.silnik = silnik;
    }

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