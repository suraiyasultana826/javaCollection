
package javaapplication27;

import java.util.*;
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
       list.add("tanu");
       list.add("sumaiya");
       list.add("Akhi");
       Iterator itr = list.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    
    }
    
}
