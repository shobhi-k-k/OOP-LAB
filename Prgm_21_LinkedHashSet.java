import java.util.*;
import java.util.LinkedHashSet;
class Prgm_21_LinkedHashSet
{
 public static void main(String args[]){
 //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet<String>();
               set.add("rose");
               set.add("lilly");
               set.add("Anju");
               set.add("Anu");
               set.add("Riya");
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
               System.out.println("Size of LinkedHashSet = " +set.size());
 }
}
