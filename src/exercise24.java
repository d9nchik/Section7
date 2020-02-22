public class exercise24 {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        boolean[] fourSuit = {false, false, false, false};
        int counter = 0;
        while (!(fourSuit[0] && fourSuit[1] && fourSuit[2] && fourSuit[3])) {
            int card = (int) (Math.random() * 52);
            int suit = card / 13;
            int rank = card % 13;
            if (!fourSuit[suit]) {
                fourSuit[suit] = true;
                System.out.println(ranks[rank] + " of " + suits[suit]);
            }
            counter++;
        }

        System.out.println("Number of picks: " + counter);
    }
}
