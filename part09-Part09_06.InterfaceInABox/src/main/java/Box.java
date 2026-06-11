import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> box;
    private double maxWeight;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.box = new ArrayList<>();
    }
    
    public double weight(){
        double total = 0.0;
        for(Packable item: this.box){
            total += item.weight();
        }
        return total;
    }
    
    public void add(Packable packable){
        if (this.weight() + packable.weight() > this.maxWeight){
            return;
        }
        this.box.add(packable);
    }
    
    public String toString(){
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
}
