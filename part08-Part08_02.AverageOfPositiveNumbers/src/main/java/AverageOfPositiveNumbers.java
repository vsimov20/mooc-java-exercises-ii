
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        int count = 0;
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            } else if (num < 0){
                continue;
            }
            avg += num;
            count++;
        }
        
        if(avg > 0){
            System.out.println((double) avg / count);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
