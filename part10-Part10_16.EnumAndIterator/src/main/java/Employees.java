
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {

    private ArrayList<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(p -> this.people.add(p));

    }

    public void print() {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education ed){
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            Person p = iterator.next();
            if(p.getEducation() == ed){
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education ed){
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            if(iterator.next().getEducation() == ed){
                iterator.remove();
            }
        }
    }
}