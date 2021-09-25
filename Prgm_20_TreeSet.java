import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Prgm_20_TreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> tSet = new TreeSet<Integer>();
        tSet.add(40);
        tSet.add(15);
        tSet.add(20);
        tSet.add(10);
        tSet.add(90);
        tSet.add(3);
        tSet.add(1);

        System.out.println("TreeSet contains: " + tSet);

        Set<Integer> reverseSet = tSet.descendingSet();

        //get an iterator
        Iterator<Integer> itr = reverseSet.iterator();

        System.out.println("Reverse set contains: ");
        while(itr.hasNext()){
            System.out.println( itr.next() );
        }
    }
}
