import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ExtendedAuction extends Auction {
    private User winner = null;

    public ExtendedAuction(String name, String description, double startingPrice,
                           int rounds, double minimumTrustScore, AuctionType type, User seller) {
        super(name, description, startingPrice, rounds, minimumTrustScore, type, seller);
    }

    @Override
    public void display() {
        System.out.println(" [EXTENDED] " + getAuctionName() + " (#" + getIndex() + ") ===");
        System.out.println("  " + getAuctionDescription());
        System.out.println("  Start: " + getStartingPrice() + " PLN | Base rounds: " + getStartingRoundCount() + " | Min trust: " + getMinimumTrustScore());
        System.out.println("  Seller: " + getSeller().getLogin());
        System.out.println("  Each bid extends the auction by 1 round. Ends when a round has no bids.");
    }

    @Override
    public void runAuction(List<User> participants, Scanner scanner) {
        display();
        List<User> eligible = getEligibleBidders(participants);
        System.out.println("Eligible: " + eligible.stream().map(User::getLogin).toList());

        int totalRounds = getStartingRoundCount();
        int round = 1;

        while (round <= totalRounds) {
            System.out.println("\n--- Round " + round + " (total planned: " + totalRounds + ") ---");
            List<Bid> roundBids = collectRoundBids(eligible, round, scanner);
            bidsByRound.add(roundBids);

            if (roundBids.isEmpty()) {
                System.out.println("No bids this round - auction ends.");
                break;
            }
            totalRounds += roundBids.size(); // each bid extends by 1 round
            System.out.println("Auction extended to " + totalRounds + " rounds.");
            round++;
        }

        resolveWinner();
        finished = true;
    }

    private void resolveWinner() {
        for (int i = bidsByRound.size() - 1; i >= 0; i--) {
            List<Bid> round = bidsByRound.get(i);
            if (!round.isEmpty()) {
                round.stream()
                        .max(Comparator.comparingDouble(Bid::amount))
                        .ifPresent(b -> {
                            winner = b.bidder ();
                            System.out.println("\nWinner: " + winner + " with " + b.amount () + " PLN");
                        });
                return;
            }
        }
        System.out.println("\nNo winner.");
    }

    @Override
    public User getWinner() { return winner; }
}