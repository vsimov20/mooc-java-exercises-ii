import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("sumo");
        Student third = new Student("limo");
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);
        
        System.out.println(students);
        
        Collections.sort(students);
        System.out.println(students);
    }
}
