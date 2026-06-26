public record Bid(User bidder, double amount, int round) {

    @Override
    public String toString () {
        return bidder.getLogin () + " bid " + amount + " PLN in round " + round;
    }
}