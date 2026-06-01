
import java.util.Scanner;

public class UserInterface {

    private Container first;
    private Container second;
    private Scanner scan;

    public UserInterface(Container first, Container second, Scanner scan) {
        this.first = first;
        this.second = second;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("add " + amount)) {
                first.add(amount);
            }

            if (input.equals("move " + amount)) {
                if (first.contains() < amount) {
                    second.add(first.contains());
                    first.remove(first.contains());
                    
                } else {
                    first.remove(amount);
                    second.add(amount);
                }

            }

            if (input.equals("remove " + amount)) {
                second.remove(amount);
            }
        }
    }
}
