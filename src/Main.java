import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Isaac obj1 = new Isaac("Java");
        Isaac obj2 = new Isaac("Kotlin");
        Isaac obj3 = new Isaac("SQL");
        Isaac obj4 = new Isaac("C++");

        Isaac newIsaac = obj1.plus(obj2);
        System.out.println(newIsaac.skills);
    }
}
