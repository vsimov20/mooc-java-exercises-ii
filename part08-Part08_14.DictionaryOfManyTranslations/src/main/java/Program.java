
public class Program {

    public static void main(String[] args) {
        
        DictionaryOfManyTranslations dict = new DictionaryOfManyTranslations();
        
        dict.add("pen", "pencil");
        dict.add("pen", "pluma");
        dict.add("pen", "penna");
        dict.add("neck", "collar");
        dict.add("neck", "pluma");
       
        System.out.println(dict.translate("pen"));
        System.out.println(dict.translate("neck"));
        
        dict.remove("pen");
        
        System.out.println(dict.translate("pen"));
        
    }
}
