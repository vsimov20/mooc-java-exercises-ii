import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String name, int price, int stock){
        this.price.put(name, price);
        this.stock.put(name, stock);
    }
    
    public int price(String product){
        if(!this.price.containsKey(product)){
            return -99;
        }
        return this.price.get(product);
    }
    
    public int stock(String product){
        if(!this.stock.containsKey(product)){
            return 0;
        }
        return this.stock.get(product);
    }
    
    public boolean take(String product){
        if(!this.stock.containsKey(product) || this.stock.get(product) == 0){
            return false;
        }
        this.stock.replace(product, this.stock(product), this.stock(product) - 1);
        return true;
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<>();
        for(String product: this.stock.keySet()){
            products.add(product);
        }
        return products;
    }
}
