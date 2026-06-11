
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        Box boxBook = new Box(10);
        boxBook.add(book1);
        boxBook.add(book2);
        boxBook.add(book3);
        
        Box boxCD = new Box(10);
        boxCD.add(cd1);
        boxCD.add(cd2);
        boxCD.add(cd3);
        
        Box box = new Box(10);
        box.add(boxBook);
        box.add(boxCD);
        
        System.out.println(box);
    }

}
