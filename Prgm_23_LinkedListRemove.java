import java.util.*;
public class Prgm_23_LinkedListRemove
{
  public static void main(String[] args) {
        
        LinkedList<String> l_list = new LinkedList<String>();
        
        l_list.add("Apple");
        l_list.add("Banana");
        l_list.add("Carrot");
        l_list.add("Grapes");
        

        
        System.out.println("The Original linked list: " + l_list);

        
        l_list.clear();

        System.out.println("The New linked list: " + l_list);
    }
}
