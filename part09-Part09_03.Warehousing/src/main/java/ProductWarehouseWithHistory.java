
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance){
        super(name, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        double taken = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return taken;
    } 
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
    
    public String history(){
        return history.toString();
    }
}
