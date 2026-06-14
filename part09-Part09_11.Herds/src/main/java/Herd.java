import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable mov: this.herd){
            mov.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for(Movable mov: this.herd){
            str += mov.toString() + "\n";
        }
        return str;
    }
}
