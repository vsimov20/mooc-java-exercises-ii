

public class Main {

    public static void main(String[] args) {
        Item item = new Item("phone", 5);
        Suitcase suit = new Suitcase(10);
        suit.addItem(item);
        Hold hold = new Hold(20);
        hold.addSuitcase(suit);
        
        
        suit.printItems();
        hold.printItems();
        
        System.out.println(suit.totalWeight());
        System.out.println(hold.totalWeight());
    }

}
