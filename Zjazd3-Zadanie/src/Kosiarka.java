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
    }
    public void setCzyNaped(boolean czyNaped) {
    }
    public void setLiczbaOstrzy(int liczbaOstrzy) {
    }

    public void wyswietl(){
        System.out.println("Kosiarka jest marki: " + marka);
        System.out.println("Nazywa sie: " + nazwa);
        System.out.println("Pojemnosc silnika wynosi: " + pojemnoscSilnika + " litrow");
        System.out.println("Rodzaj silnika: " + silnik);
        if(czyMelekser) {
            System.out.println("Jest melekserem");
        } else {
            System.out.println("Nie jest melekserem");
        }
        if(czyNaped) {
            System.out.println("Posiada naped");
        } else {
            System.out.println("Nie posiada napedu");
        }
        System.out.println("Posiada: " + liczbaOstrzy + " ostrzy");
        System.out.println();
    }
}