
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 * 
 * Write code to remove duplicates from an unsorted linked list
 */
public class Question3 {
    
    
    public void removeDuplicates(LinkedList ll)
    {
        HashMap map = new HashMap();
        Iterator i = ll.iterator();
        
        while(i.hasNext())
        {
            Object val = i.next();
            if(map.containsKey(i.next())){
                //remove the current
            }
            else{
                //add to HashMap
            }
                
        }
    }
}
