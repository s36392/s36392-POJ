public class AuctionBuilder {
    private AuctionType type;
    private String      name;
    private String      description;
    private double      startingPrice;
    private int         rounds;
    private double      minimumTrustScore;
    private User        seller;

    public AuctionBuilder type(AuctionType type)              { this.type              = type;              return this; }
    public AuctionBuilder name(String name)                   { this.name              = name;              return this; }
    public AuctionBuilder description(String description)     { this.description       = description;       return this; }
    public AuctionBuilder startingPrice(double startingPrice) { this.startingPrice     = startingPrice;     return this; }
    public AuctionBuilder rounds(int rounds)                  { this.rounds            = rounds;            return this; }
    public AuctionBuilder minimumTrustScore(double score)     { this.minimumTrustScore = score;             return this; }
    public AuctionBuilder seller(User seller)                 { this.seller            = seller;            return this; }

    public Auction build() {
        if (type   == null) throw new IllegalStateException("Auction type is required.");
        if (seller == null) throw new IllegalStateException("Seller is required.");
        return Auction.create(type, name, description, startingPrice, rounds, minimumTrustScore, seller);
    }
}