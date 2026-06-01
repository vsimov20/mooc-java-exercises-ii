import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void remove(int num){
        this.list.remove(num - 1);
    }
    
    public void print(){
        for(String task: this.list){
            System.out.println((this.list.indexOf(task) + 1) + ": " + task);
        }
    }
}
