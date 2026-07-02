

public class Checker {
    
    public boolean isDayOfWeek(String str){
        if(str.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String str){
        if(str.matches("[aeiou]*")){
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String str){
        if(str.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")){
            return true;
        }
        return false;
    }

}
