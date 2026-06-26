import java.util.ArrayList;
import java.util.List;

public class AuctionSystem {
    private final List<Auction> auctions = new ArrayList<>();

    public void addAuction(Auction auction) { auctions.add(auction); }

    public List<Auction> getUnfinished()              { return auctions.stream().filter(a -> !a.isFinished()).toList(); }
    public List<Auction> getFinished()                { return auctions.stream().filter(Auction::isFinished).toList(); }
    public List<Auction> getBySellerLogin(String login) {
        return auctions.stream().filter(a -> a.getSeller().getLogin().equals(login)).toList();
    }
}