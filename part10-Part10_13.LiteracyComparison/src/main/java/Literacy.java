
public class Literacy implements Comparable<Literacy>{
    private String country;
    private int year;
    private String gender;
    private double percent;
    
    public Literacy(String country, int year, String gender, double percent){
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.percent = percent;
               
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public double getPercent(){
        return this.percent;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    @Override
    public String toString(){
        return this.country + " (" + this.year + ")," + this.gender + ", " + this.percent;
    }
    
    @Override
    public int compareTo(Literacy person){
        return Double.compare(this.percent, person.getPercent());
    }
    
}
