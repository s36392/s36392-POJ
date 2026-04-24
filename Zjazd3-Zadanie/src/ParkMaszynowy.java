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
        Kosiarka kosiarka2 = new Kosiarka(
                "Ursula",
                "Kosiarka",
                1.4,
                Maszyna.rodzajSilnika.SPALINOWY,
                true,
                false,
                5
        ){};
        Samochod samochod1 = new Samochod(
                "Ford",
                "Mustang",
                3.4,
                Maszyna.rodzajSilnika.SPALINOWY,
                Samochod.segmentAuta.A,
                12345678,
                0,
                12
        ){};
        Samochod samochod2 = new Samochod(
                "Tesla",
                "Model L",
                3.4,
                Maszyna.rodzajSilnika.ELEKTRYCZNY,
                Samochod.segmentAuta.C,
                12231358,
                0,
                12
        ){};
        `Jednoslad jednoslad1 = new Jednoslad(
                "Ford",
                "Focus",
                1.2,
                Maszyna.rodzajSilnika.SPALINOWY,
                Jednoslad.typJednosladu.MOTOCYKL,
                400,
                5
        ){};`
        Jednoslad jednoslad2 = new Jednoslad(
                0,
                12,
                "BMX",
                "Rower",
                4.3,
                Maszyna.rodzajSilnika.SPALINOWY,
                Jednoslad.typJednosladu.ROWER
        ){};

        for
    }
}
