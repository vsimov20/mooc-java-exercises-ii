
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(-4);
        nums.add(16);
        nums.add(-15);
        nums.add(0);
        nums.add(5);
        
        System.out.println(positive(nums));

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> nums = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return nums;
        
    }

}
