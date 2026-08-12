
package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList();
        this.readings = new ArrayList();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn(){
        int count = 0;
        for(Sensor sensor: this.sensors){
            if(sensor.isOn()){
                count++;
            }
        }
        
        if(count == this.sensors.size()){
            return true;
        }
        return false;
    }
    
    @Override
    public void setOn(){
        for(Sensor sensor: this.sensors){
            sensor.setOn();
        }
    }
    
    @Override
    public void setOff(){
        for(Sensor sensor: this.sensors){
            sensor.setOff();
        }
        
        
    }
    
    @Override
    public int read(){
        int sum = 0;
        
        for(Sensor sensor: this.sensors){
            sum += sensor.read();
        }
        
        if(!isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException();
        }
        
        int avg = (int) sum / this.sensors.size();
        this.readings.add(avg);
        return avg;
    }
    
    public List<Integer> readings(){
        return readings;
    }
          
}
