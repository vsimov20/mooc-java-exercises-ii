import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate lp, String owner){
        if(!this.registry.containsKey(lp)){
            this.registry.put(lp, owner);
            return true;
        }
        
        return false;
    }
    
    public String get(LicensePlate lp){
        if(!this.registry.containsKey(lp)){
            return null;
        }
        
        return this.registry.get(lp);
    }
    
    public boolean remove(LicensePlate lp){
        if(!this.registry.containsKey(lp)){
            return false;
        }
        
        this.registry.remove(lp);
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate plates: this.registry.keySet()){
            System.out.println(plates);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String owner: this.registry.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        
        for(String owner: owners){
            System.out.println(owner);
        }
    }
}
