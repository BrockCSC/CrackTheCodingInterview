import java.util.HashMap;
import java.util.Map;

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

    public static boolean isPermutation(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            if (map.containsKey(s1.charAt(i))) {
                //increment the count
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            }

            else {
                //add it to the map
                map.put(s1.charAt(i), 1);
            }

        }

        for (int i = 0; i < s2.length(); i++) {
            //check if already found
            if (map.containsKey(s2.charAt(i))) {
                //remove from value
                map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
            }

            else {
                return false;
            }

        }
        
        //check if each value in the hashmap is 0
        for (Map.Entry<Character, Integer> character : map.entrySet()) {
            if (character.getValue() != 0) return false;
        }
        //if so, we have a permutation
        return true;
    }

    public static void main(String[] args) {
        String a = "AAB";
        String b = "AA";
        System.out.println(isPermutation(a,b)); //false
    }
    
    
}
