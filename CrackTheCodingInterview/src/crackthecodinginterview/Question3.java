import java.util.HashMap;
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

    public static void removeDuplicates(LinkedList<Object> ll) {

        HashMap<Object, Integer> map = new HashMap<>();

        //iterate through the list
        for (int index = 0; index < ll.size(); index++) {

            //if it's in our hashmap
            if (map.containsKey(ll.get(index))) {
                //remove the element from the linkedlist
                ll.remove(index);
            }

            else {
                //otherwise, put the element in our map
                map.put(ll.get(index), 1);
            }

        }

    }

    public static void main(String[] args) {

        LinkedList<Object> testList = new LinkedList<>();

        testList.add(1);
        testList.add(2);
        testList.add(1);

        removeDuplicates(testList);

        for (int index = 0; index < testList.size(); index++) {
            System.out.println(testList.get(index));
        }

    }
}
