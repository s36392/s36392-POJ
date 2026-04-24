import java.util.ArrayList;
import java.util.List;

public class ParkMaszynowy {
    static void main(){
        Lokomotywa lokomotywa1 = new Lokomotywa(
                "Bavarian",
                "S3/6",
                26200.0,
                Maszyna.rodzajSilnika.SPALINOWY,
                120.0,
                20);
        Lokomotywa lokomotywa2 = new Lokomotywa(
                "Mitsubishi",
                "L0",
                0,
                Maszyna.rodzajSilnika.ELEKTRYCZNY,
                550.0,
                10);
        Kosiarka kosiarka1 = new Kosiarka(
                "Ursus",
                "Kosa",
                1.4,
                Maszyna.rodzajSilnika.HYBRYDOWY,
                true,
                false,
                1
        );
        Kosiarka kosiarka2 = new Kosiarka(
                "STIHL",
                "Kosiarka co kosi",
                1.4,
                Maszyna.rodzajSilnika.SPALINOWY,
                true,
                false,
                5
        );
        Samochod samochod1 = new Samochod(
                "Toyota",
                "Supra",
                3.4,
                Maszyna.rodzajSilnika.SPALINOWY,
                Samochod.segmentAuta.G,
                12345678,
                147,
                212
        );
        Samochod samochod2 = new Samochod(
                "Shelby",
                "Mustang",
                7015,
                Maszyna.rodzajSilnika.SPALINOWY,
                Samochod.segmentAuta.G,
                12231358,
                550,
                570
        );
        Jednoslad jednoslad1 = new Jednoslad(
                "Suzuki",
                "GSX-R",
                749,
                Maszyna.rodzajSilnika.SPALINOWY,
                Jednoslad.typJednosladu.MOTOCYKL,
                148,
                86
        );
        Jednoslad jednoslad2 = new Jednoslad(
                "BSD",
                "BMX",
                Jednoslad.typJednosladu.ROWER
        );

        List<Maszyna> park = new ArrayList<>();
        park.add(lokomotywa1);
        park.add(lokomotywa2);
        park.add(kosiarka1);
        park.add(kosiarka2);
        park.add(samochod1);
        park.add(samochod2);
        park.add(jednoslad1);
        park.add(jednoslad2);

        for (Maszyna numer : park){
            numer.wyswietl();
        }

        kosiarka1.setLiczbaOstrzy(151900);
        System.out.println("Po zmianie kosiarki: ");
        kosiarka1.wyswietl();
    }
}
