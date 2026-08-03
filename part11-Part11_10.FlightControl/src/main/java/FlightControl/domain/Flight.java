
package FlightControl.domain;


public class Flight {
    private Airplane plane;
    private Place departFrom;
    private Place departTo;
    
    public Flight(Airplane plane, Place departFrom, Place departTo){
        this.plane = plane;
        this.departFrom = departFrom;
        this.departTo = departTo;
    }
    
    public Airplane getPlane(){
        return this.plane;
    }
    
    public Place getFrom(){
        return this.departFrom;
    }
    
    public Place getTo(){
        return this.departTo;
    }
    
    @Override
    public String toString(){
        return this.plane + " (" + this.departFrom + "-" + this.departTo + ")";
    }
}
