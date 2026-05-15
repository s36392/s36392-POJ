public class Main {
    public static void main(String[] args) {

        System.out.println("Poprawny pin");
        Safe safe1 = new Safe("1234");
        safe1.enterPin("1234");

        System.out.println("Bledny pin, bez alarmow");
        Safe safe2 = new Safe("1234");
        safe2.enterPin("0000");

        System.out.println("Bledny pin z alarmami i console loggerem");
        Safe safe3 = new Safe("1234");
        SoundAlarm soundAlarm = new SoundAlarm();
        soundAlarm.setLogger(new ConsoleLogger(Severity.LOW));
        safe3.addAlarm(soundAlarm);
        safe3.enterPin("9999");

        System.out.println("Bledny pin z wieloma alarmami i loggerami");
        Safe safe4 = new Safe("5678");

        PoliceAlarm policeAlarm = new PoliceAlarm();
        policeAlarm.setLogger(new ConsoleLogger(Severity.HIGH));

        PoliteAlarm politeAlarm = new PoliteAlarm();
        politeAlarm.setLogger(new FileLogger(Severity.LOW, "polite_log.txt"));

        DoorAlarm barsAlarm = new DoorAlarm();

        safe4.addAlarm(policeAlarm);
        safe4.addAlarm(politeAlarm);
        safe4.addAlarm(barsAlarm);

        safe4.enterPin("0000");

        System.out.println("Usuniecie alarmu z blednym pinem");
        Safe safe5 = new Safe("1234");
        SoundAlarm removedAlarm = new SoundAlarm();
        safe5.addAlarm(removedAlarm);
        safe5.removeAlarm(removedAlarm);
        safe5.enterPin("0000");

        System.out.println("Reset alarmu");
        safe3.resetAlarm();

        System.out.println("Testy zakonczone");


    }
}