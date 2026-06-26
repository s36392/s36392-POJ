import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SimpleAuction extends Auction {
    private User winner = null;

    public SimpleAuction(String name, String description, double startingPrice,
                         int rounds, double minimumTrustScore, AuctionType type, User seller) {
        super(name, description, startingPrice, rounds, minimumTrustScore, type, seller);
    }

    @Override
    public void display() {
        System.out.println(" [SIMPLE] " + getAuctionName() + " (#" + getIndex() + ") ===");
        System.out.println("  " + getAuctionDescription());
        System.out.println("  Start: " + getStartingPrice() + " PLN | Rounds: " + getStartingRoundCount() + " | Min trust: " + getMinimumTrustScore());
        System.out.println("  Seller: " + getSeller().getLogin());
        System.out.println("  Winner = highest bidder in the final round.");
    }

    @Override
    public void runAuction(List<User> participants, Scanner scanner) {
        display();
        List<User> eligible = getEligibleBidders(participants);
        System.out.println("Eligible: " + eligible.stream().map(User::getLogin).toList());

        for (int round = 1; round <= getStartingRoundCount(); round++) {
            System.out.println("\n--- Round " + round + "/" + getStartingRoundCount() + " ---");
            bidsByRound.add(collectRoundBids(eligible, round, scanner));
        }

        resolveWinner();
        finished = true;
    }

    private void resolveWinner() {
        List<Bid> lastRound = bidsByRound.get(bidsByRound.size() - 1);
        lastRound.stream()
                .max(Comparator.comparingDouble(Bid::amount))
                .ifPresentOrElse(
                        b -> { winner = b.bidder ();
                            System.out.println("\nWinner: " + winner + " with " + b.amount () + " PLN"); },
                        ()  -> System.out.println("\nNo bids in the final round — no winner.")
                );
    }

    @Override
    public User getWinner() { return winner; }
}