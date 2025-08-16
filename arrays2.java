import java.util.ArrayList;

public class arrays2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers.toString());
        System.out.println(numbers.get(3));
       numbers.set(0, 70);
        System.out.println(numbers);

       ArrayList<Integer> anotherlist = new ArrayList<Integer>();

       anotherlist.add(3);
       anotherlist.add(4);
       anotherlist.add(67);
       anotherlist.add(2);
       anotherlist.add(1);
       anotherlist.add(88);
       anotherlist.sort(null);
       System.out.println(anotherlist);



    
    
    }
}
