
public class Main {

    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(19, 2, 2006);
        SimpleDate date2 = new SimpleDate(18, 3, 2005);
        
        System.out.println(date1.equals(date2));
        System.out.println(date1.equals(date1));
        System.out.println(date2.equals(new SimpleDate(18, 3, 2005)));
        System.out.println(date1.equals(new SimpleDate(18, 3, 2005)));
    }
}
