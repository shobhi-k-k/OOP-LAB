import java.util.*;
class Prgm_22_ArrayList
{
   public static void main(String args[]){
      
      ArrayList<String> flower_List=new ArrayList<String>();
      
      flower_List.add("rose");
      flower_List.add("lilly");
      flower_List.add("jasmine");
      flower_List.add("lotus");
      
      System.out.println("Initial ArrayList:" + flower_List);
      
      flower_List.add(1, "sunflower");
      
      System.out.println("\nArrayList after adding an element'daisy' at index 1:" + flower_List);
      
      ArrayList<String> add_flower = new ArrayList<String>(Arrays.asList("aster", "orchids","daisy","tulips"));
      
      flower_List.addAll(4,add_flower);
      
      System.out.println("\nArrayList after adding all list at index 4:" + flower_List);
      flower_List.remove(2);

      System.out.println("\nArrayList after removing element at index 2:" + flower_List);
      
      flower_List.remove("rose");

      System.out.println("\nArrayList after removing element 'rose':" + flower_List);
      flower_List.removeAll(add_flower);

      System.out.println("\nArrayList after call to removeAll from array 'add_flower':" + flower_List);
     
       System.out.println("ArrayList Size: "+flower_List.size());
       flower_List.add("hibiscus");
         flower_List.add("rose");
       flower_List.add("hibiscus");
         flower_List.add("snowdrop");
           System.out.println("\nArrayList after adding some elements:" + flower_List);

       flower_List.trimToSize();
        
        System.out.println("ArrayList Size after trimToSize() operation: "+flower_List.size());
        
      System.out.println("indexOf(hibiscus) : " + flower_List.indexOf("hibiscus"));
      System.out.println("lastIndexOf(hibiscus) : " + flower_List.lastIndexOf("hibiscus"));
      flower_List.clear();
      System.out.println("ArrayList after clearing all elements: "+flower_List);


   }
}
