/*Library for Random*/
/*Java Lang imports automatically*/
import java.util.Random;
/* abs() for imports statics library's */
import static java.lang.Math.abs;

public class Shop {
    int i = 1;
    Integer x = 1;

    /*Java creates a Constructor automatically without arguments*/
    String name = "123";
    {
        name = "ABC";
    }
    public static void main(String[] args) {
        Shop s = new Shop();
        s.name = "Big Shop LCC";
        System.out.println(s.name);
    }
}
/* FINAL means a variable can be assigned only one time*/
/*.class archives can only contain one single class*/
