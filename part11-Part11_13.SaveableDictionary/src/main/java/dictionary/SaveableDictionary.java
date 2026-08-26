
package dictionary;
import java.util.*;
import java.io.*;
import java.nio.file.Paths;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this.file = file;
        this.dictionary = new HashMap<>();
    }
    
    public boolean load(){
        try(Scanner reader = new Scanner(Paths.get(this.file))){
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                String[] words = data.split(":");
                
                add(words[0], words[1]);
            }
            return true;
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean save(){
        try(PrintWriter writer = new PrintWriter(this.file)){
            
            this.dictionary.forEach((word, translation) -> writer.println(word + ":" + translation));
                
            
        return true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
    }
    
    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        } else if(this.dictionary.containsValue(word)){
            for(String w: this.dictionary.keySet()){
                if(this.dictionary.get(w).equals(word)){
                    return w;
                }
            }
        } 
        
        return null;
    }
    
    public void delete(String word){
      this.dictionary.values().removeIf(v -> v.equals(word));
      this.dictionary.keySet().removeIf(k -> k.equals(word));
    }
}
