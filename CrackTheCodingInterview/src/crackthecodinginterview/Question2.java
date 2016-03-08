
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 * 
 * Given 2 strings determine if one is a permutation of another.
 * 
 */
public class Question2 {
    
    public static boolean isPermutation(String s1, String s2)
    {
        HashMap map = new HashMap();
        
        //iterate through first string
        for(int i = 0; i < s1.length(); i++)
        {
            //check if already found
            if(s1.containsKey(s1.charAt(i))){
                //add to value
            }
            else{
                //add item to list
            }
        }
        
        //iterate through second string
        for(int i = 0; i < s2.length(); i++)
        {
            //check if already found
            if(s2.containsKey(s1.charAt(i))){
                //remove from value
            }
            else{
                return false;
            }
        }
        
        //go through the hashmap to ensure everything is 0  
        return true;
    }
    
    
    public static void main(String[] args)
    {
        
        String a = "computer";
        String b = "putcormpe";
        isPermutation(a,b);
        
        
    }
    
}
