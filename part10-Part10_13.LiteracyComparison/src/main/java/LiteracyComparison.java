
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Literacy> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 6)
                    .map(parts -> new Literacy(parts[3].trim(), Integer.valueOf(parts[4].trim()), parts[2].replace(" (%)", ""), Double.valueOf(parts[5].trim())))
                    .sorted()
                    .forEach(s -> rows.add(s));


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        for(Literacy row: rows){
            System.out.println(row);
        }
        

    }
}
