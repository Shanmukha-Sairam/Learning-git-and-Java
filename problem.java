import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class problem {
    public static void main(String[] args) {
        //given a list of integers 
        //1.Remove duplicates
        //2.Keep only even numbers
        //3.Sort them
        //Store them in a list
        List<Integer>l = new ArrayList<Integer>();
        l.add(12);
        l.add(34);
        l.add(12);
        l.add(76);
        l.add(92);
        l.add(07);
        l.add(35);
        l.add(79);
        l.add(61);
        l.add(12);
        System.out.println(l);
        List<Integer> a = l.stream()
        .distinct()
        .filter(n->n%2==0)
        .sorted()
        .collect(Collectors.toList());
        // .toList();
        System.out.println(a);


    }
}
