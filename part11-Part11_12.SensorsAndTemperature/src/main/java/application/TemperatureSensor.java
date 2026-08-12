
package application;
import java.util.Random;


public class TemperatureSensor implements Sensor{
    private int degree;
    private boolean on;
    
    public TemperatureSensor(){
        this.on = false;
    }
    
    @Override
    public boolean isOn(){
        return this.on;
    }
    
    @Override
    public void setOn(){
        this.on = true;
    }
    
    @Override
    public void setOff(){
        this.on = false;
    }
    
    @Override
    public int read(){
        if(!isOn()){
            throw new IllegalStateException();
        }
        this.degree = new Random().nextInt(61);
        return this.degree - 30;
    }
    
    
}
