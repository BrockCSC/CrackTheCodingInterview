/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 * 
 * Given 2 Strings, determine if one is a rotation of another
 * 
 * you are given a function isSubString(S1,S2) which returns true or false
 * you can only use this function once.
 */
public class Question1 {

    
    public static boolean isSubString(String s1, String s2)
    {
        return s1.contains(s2);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "Waterbottle"; //string A
        String b = "erbottleWat"; //string B
        String c = b+b;
        
        isSubString(c,a);
    }
    
}
