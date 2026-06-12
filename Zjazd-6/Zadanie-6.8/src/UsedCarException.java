public class UsedCarException extends Exception {
    public UsedCarException(String vin) {
        super(vin);
    }
}