
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

import java.util.HashMap;
import java.util.Collection;

public class FlightControl {
    private HashMap<String, Airplane> planes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl(){
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
        this.planes = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity){
        this.planes.put(id, new Airplane(id, capacity));
    }
    
    public void addFlight(Airplane plane, String departureID, String destinationID){
        Place dep = new Place(departureID);
        Place dest = new Place(destinationID);
        
        this.places.putIfAbsent(departureID, dep);
        this.places.putIfAbsent(departureID, dest);
        
        Flight flight = new Flight(plane, dep, dest);
        
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getPlanes(){
        return this.planes.values();
    }
    
    public Airplane getPlane(String id){
        return this.planes.get(id);
    }
    
    public Collection<Flight> getFlights(){
        return this.flights.values();
    }
}
