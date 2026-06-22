
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> str = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            str.add(input);
        }
        
        str.stream()
                .forEach(s -> System.out.println(s));
        
    }
}
