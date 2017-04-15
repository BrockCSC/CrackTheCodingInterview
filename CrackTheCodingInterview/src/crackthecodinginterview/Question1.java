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
**/

public class Question1 {

    /**
     * checks if target is a substring of source.
     * @param target - substring pattern we are checking
     * @param src - string we are checking against
     * @return - boolean, true if substring, false otherwise.
     */

    public static boolean isSubstring(String target, String src) {
        if (target == null || src == null) {
            return false;
        }
        
        return target.indexOf(src) > -1
    }

    /**
     * checks if target is a rotation of the src string
     * @param target - pattern we are checking
     * @param src - source string we are checking the rotation around
     * @return - boolean, true if rotation, false otherwise.
     */

    public static boolean isRotation(String target, String src) {
        if (target == null || src == null) {
            return false;
        }

        if (target.length() != src.length()) {
            return false;
        }

        return isSubstring(target+target, src);
    }

    public static void main(String[] args) {
        String a = "waterbottle";
        String b = "erbottlewat";

        System.out.println(isRotation(b, a));
    }
}
