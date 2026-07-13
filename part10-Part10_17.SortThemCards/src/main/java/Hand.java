import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        this.cards.stream()
                .forEach(c -> System.out.println(c));
    }
    
    public void sort(){
        Collections.sort(this.cards, (p1, p2) -> p1.compareTo(p2));
    }
    
    public ArrayList<Card> getCards(){
        return this.cards;
    }
    
    public void sortBySuit(){
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        Collections.sort(this.cards, comparator);
    }
    
    @Override
    public int compareTo(Hand hand){
        int hand1 = 0;
        int hand2 = 0;
        
        for(Card card: this.cards){
            hand1 += card.getValue();
        }
        
        for(Card card: hand.getCards()){
            hand2 += card.getValue();
        }
      
       return hand1 - hand2;         
    }
}
