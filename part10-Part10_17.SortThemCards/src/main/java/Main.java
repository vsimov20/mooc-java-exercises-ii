import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));
        
        hand1.sortBySuit();
        

        hand1.getCards().stream()
                .forEach(s -> System.out.println(s));
        
        Collections.sort(hand1.getCards(), new BySuitInValueOrder());
        
        hand1.getCards().stream()
                .forEach(s -> System.out.println(s));
    }
}
