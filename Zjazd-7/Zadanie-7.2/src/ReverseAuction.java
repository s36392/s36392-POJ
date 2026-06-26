import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseAuction extends Auction {
    private User   winner     = null;
    private double finalPrice = 0;

    public ReverseAuction(String name, String description, double startingPrice,
                          int rounds, double minimumTrustScore, AuctionType type, User seller) {
        super(name, description, startingPrice, rounds, minimumTrustScore, type, seller);
    }

    @Override
    public void display() {
        System.out.println(" [REVERSE] " + getAuctionName() + " (#" + getIndex() + ") ===");
        System.out.println("  " + getAuctionDescription());
        System.out.println("  Start: " + getStartingPrice() + " PLN | Max rounds: " + getStartingRoundCount() + " | Min trust: " + getMinimumTrustScore());
        System.out.println("  Seller: " + getSeller().getLogin());
        System.out.println("  Pay 1 PLN to reveal the current price; price drops 1 PLN per bid.");
    }

    @Override
    public void runAuction(List<User> participants, Scanner scanner) {
        display();
        List<User> eligible = getEligibleBidders(participants);
        System.out.println("Eligible: " + eligible.stream().map(User::getLogin).toList());

        double  currentPrice = getStartingPrice();
        boolean sold         = false;

        outer:
        for (int round = 1; round <= getStartingRoundCount() && currentPrice > 0; round++) {
            System.out.println("\n--- Round " + round + "/" + getStartingRoundCount() + " ---");
            List<Bid> roundBids = new ArrayList<>();

            for (User user : eligible) {
                System.out.print("  " + user.getLogin() + " — pay 1 PLN to reveal price? (yes/no): ");
                if (!scanner.nextLine().trim().equalsIgnoreCase("yes")) continue;

                currentPrice--;
                roundBids.add(new Bid(user, 1.0, round));
                System.out.println("  Revealed price: " + currentPrice + " PLN");
                System.out.print("  Buy at " + currentPrice + " PLN? (yes/no): ");

                if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
                    winner     = user;
                    finalPrice = currentPrice;
                    System.out.println("  " + user.getLogin() + " bought the item for " + finalPrice + " PLN!");
                    bidsByRound.add(roundBids);
                    sold = true;
                    break outer;
                }

                if (currentPrice <= 0) break;
            }
            bidsByRound.add(roundBids);
        }

        if (!sold) System.out.println("\nAuction ended with no buyer.");
        finished = true;
    }

    @Override
    public User   getWinner()     { return winner; }
    public double getFinalPrice() { return finalPrice; }
}