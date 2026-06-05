import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit){
        if(!this.storage.containsKey(unit)){
            return new ArrayList<>();
        }
        return this.storage.get(unit);
    }
    
    public void remove(String unit, String item){
        this.storage.get(unit).remove(item);
        if(this.storage.get(unit).isEmpty()){
            this.storage.remove(unit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for(String unit: this.storage.keySet()){
            if(!unit.isEmpty()){
                units.add(unit);
            }
        }
        return units;
    }
}
