import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class learningCollectionsAndStream {
    public static void main(String[] args) {
        List<Integer> phone = new ArrayList<Integer>();
        Map<Integer,String> reg = new HashMap<Integer,String>();
        Set<Integer> roll = new HashSet<Integer>();
        phone.add(912139121);
        phone.add(789345);
        phone.add(630286);
        phone.add(6789);
        roll.add(1);
        roll.add(2);
        roll.add(3);
        roll.add(4);
        reg.put(1, "Sairam");
        reg.put(2, "Nikitha");
        reg.put(3, "Vatsav");
        reg.put(4, "Avinash");
        System.out.println(phone);
        System.out.println(roll);
        System.out.println(reg.keySet());
        for(int i : reg.keySet()){
            System.out.println("Name : " + reg.get(i) + " "+ "Roll Number = "+ i);
        }

    }
}
