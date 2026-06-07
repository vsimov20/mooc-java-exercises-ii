import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        
        double max = this.history.get(0);
        for(double m: history){
            if(m > max){
                max = m;
            }
        }
        return max;
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        
        double min = this.history.get(0);
        for(double m: history){
            if(m < min){
                min = m;
            }
        }
        return min;
    }
    
    public double average(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        
        double sum = 0.0;
        for(double m: history){
            sum += m;
        }
        return sum / this.history.size();
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.history);
    }
}
