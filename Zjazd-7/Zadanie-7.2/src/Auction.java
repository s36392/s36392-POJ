import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Auction {
    private static int counter = 0;

    private final int         index;
    private final String      auctionName;
    private final String      auctionDescription;
    private final double      startingPrice;
    private final int         startingRoundCount;
    private final double      minimumTrustScore;
    private final AuctionType auctionType;
    private final User        seller;

    protected boolean         finished    = false;
    protected List<List<Bid>> bidsByRound = new ArrayList<>();

    protected Auction(String name, String description, double startingPrice,
                      int rounds, double minimumTrustScore, AuctionType type, User seller) {
        this.index              = counter++;
        this.auctionName        = InputValidation.validateNonEmpty(name, "Auction name");
        this.auctionDescription = InputValidation.validateNonEmpty(description, "Description");
        this.startingPrice      = InputValidation.validateNonNegative(startingPrice, "Starting price");
        this.startingRoundCount = InputValidation.validatePositiveInt(rounds, "Round count");
        this.minimumTrustScore  = InputValidation.validateNonNegative(minimumTrustScore, "Minimum trust score");
        this.auctionType        = type;
        this.seller             = seller;
    }

    public static Auction create(AuctionType type, String name, String description,
                                 double startingPrice, int rounds, double minimumTrustScore, User seller) {
        return switch (type) {
            case SIMPLE   -> new SimpleAuction  (name, description, startingPrice, rounds, minimumTrustScore, type, seller);
            case EXTENDED -> new ExtendedAuction(name, description, startingPrice, rounds, minimumTrustScore, type, seller);
            case REVERSE  -> new ReverseAuction (name, description, startingPrice, rounds, minimumTrustScore, type, seller);
        };
    }

    public abstract void display();
    public abstract void runAuction(List<User> participants, Scanner scanner);
    public abstract User getWinner();

    public void awardTrustPoint(User buyer) {
        if (!finished) throw new IllegalStateException("Auction not yet finished.");
        buyer.addTrustPoint();
        System.out.println(seller.getLogin() + " awarded a trust point to " + buyer.getLogin());
    }

    public void removeTrustPoint(User buyer) {
        if (!finished) throw new IllegalStateException("Auction not yet finished.");
        buyer.removeTrustPoint();
        System.out.println(seller.getLogin() + " removed a trust point from " + buyer.getLogin());
    }

    protected List<User> getEligibleBidders(List<User> participants) {
        return participants.stream()
                .filter(u -> !u.getLogin().equals(seller.getLogin()))
                .filter(u -> u.getTrustScore() >= minimumTrustScore)
                .toList();
    }

    protected List<Bid> collectRoundBids(List<User> eligible, int round, Scanner scanner) {
        List<Bid> bids = new ArrayList<>();
        for (User user : eligible) {
            System.out.print("  " + user.getLogin() + " — bid amount (0 to skip): ");
            try {
                double amount = Double.parseDouble(scanner.nextLine().trim());
                if (amount > 0) {
                    bids.add(new Bid(user, amount, round));
                    System.out.println("  Placed: " + amount + " PLN");
                }
            } catch (NumberFormatException e) {
                System.out.println("  Invalid input, skipping.");
            }
        }
        return bids;
    }

    public int         getIndex()              { return index; }
    public String      getAuctionName()        { return auctionName; }
    public String      getAuctionDescription() { return auctionDescription; }
    public double      getStartingPrice()      { return startingPrice; }
    public int         getStartingRoundCount() { return startingRoundCount; }
    public double      getMinimumTrustScore()  { return minimumTrustScore; }
    public AuctionType getAuctionType()        { return auctionType; }
    public User        getSeller()             { return seller; }
    public boolean     isFinished()            { return finished; }
}