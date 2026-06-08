
public class OneItemBox extends Box{
    private boolean hasItem;
    private Item item;
    
    public OneItemBox(){
        this.hasItem = false;
    }
    
    @Override
    public void add(Item item){
        if(this.hasItem){
            return;
        }
        this.item = item;
        this.hasItem = true;
    }
    
    @Override
    public boolean isInBox(Item item){
        
        if(this.item == null){
            return false;
        }
        
        if(this.item.equals(item)){
            return true;
        }
        
        
        return false;
    }
}
