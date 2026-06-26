import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        User seller = new User.Builder()
                .firstName("Anna").lastName("Kowalska")
                .login("anna_k").email("anna@example.com")
                .trustScore(10).build();

        User buyer1 = new User.Builder()
                .firstName("Piotr").lastName("Nowak")
                .login("piotr_n").email("piotr@example.com")
                .trustScore(5).build();

        User buyer2 = new User.Builder()
                .firstName("Marek").lastName("Wisniewski")
                .login("marek_w").email("marek@example.com")
                .trustScore(3).build();

        List<User> participants = List.of(seller, buyer1, buyer2);
        AuctionSystem system = new AuctionSystem();

        Auction auction = new AuctionBuilder()
                .type(AuctionType.SIMPLE)
                .name("Antique Vase")
                .description("A beautiful 19th-century vase.")
                .startingPrice(100.0)
                .rounds(3)
                .minimumTrustScore(2.0)
                .seller(seller)
                .build();

        system.addAuction(auction);
        System.out.println("Unfinished auctions : " + system.getUnfinished().size());
        System.out.println("Auctions by anna_k  : " + system.getBySellerLogin("anna_k").size());
        System.out.println();

        auction.runAuction(participants, scanner);

        System.out.println("\nFinished auctions   : " + system.getFinished().size());

        User winner = auction.getWinner();
        if (winner != null) {
            auction.awardTrustPoint(winner);
            System.out.println("Winner trust score  : " + winner.getTrustScore());
        }

        scanner.close();
    }
}