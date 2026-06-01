
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")){
                System.out.print("Task: ");
                String task = scan.nextLine();
                
                list.add(task);
            }
            
            if (command.equals("list")){
                list.print();
            }
            
            if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int num = Integer.valueOf(scan.nextLine());
                
                list.remove(num);
            }

        }
    }
}
