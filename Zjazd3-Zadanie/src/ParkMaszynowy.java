public class ParkMaszynowy {
    public static void main(String[] args){
        Lokomotywa lokomotywa1 = new Lokomotywa(
                "Ursus",
                "Pociag",
                2.0,
                Maszyna.rodzajSilnika.SPALINOWY,
                200.0,
                20){};
        Lokomotywa lokomotywa2 = new Lokomotywa(
                "Japan",
                "Maglev",
                0,
                Maszyna.rodzajSilnika.ELEKTRYCZNY,
                600.0,
                14){};
        Kosiarka kosiarka1 = new Kosiarka(
                "Ursus",
                "Kosa",
                1.4,
                Maszyna.rodzajSilnika.SPALINOWY,
                true,
                false,
                5
        ){};

        lokomotywa1.wyswietl();
        lokomotywa2.wyswietl();
        kosiarka1.wyswietl();
    }
}
