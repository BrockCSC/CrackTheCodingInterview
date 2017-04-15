/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 * Implement an element to find the kth last element 
 */
 
public class Question5 {

    private static class LinkedList<E> {

        Node<E> head;
        int size = 0;

        private class Node<E> {
            E data;
            Node next;

            private Node(E data) {
                this.data = data;
                this.next = null;
            }

            private Node(E data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        private void add(E data) {
            if (head == null) {
                head = new Node<E>(data);
                size++;
            }

            else {
                Node p = head;

                while (p.next != null) {
                    p = p.next;
                }

                p.next = new Node<E>(data);
                size++;

            }
        }

        private Node findKthLastElement(int k) {

            /**
             * High level plan of attack:
             * 1. move a pointer (in this case q) k elements ahead
             * 2. then move them both at the same time
             * 3. when the fast runner reaches the end, return the slow node.
             */

            if (k > size) {
                return null;
            };

            Node p = head;
            Node q = head;

            int count = 1;

            while ( count != k && q.next != null) {
                q = q.next;
                count++;
            }

            while (q.next != null) {
                p = p.next;
                q = q.next;
            }

            return p;
        }

    }

    public static void main(String[] args) throws NullPointerException {
        LinkedList<Integer> integerList = new LinkedList<Integer>();

        integerList.add(0);
        integerList.add(5);
        integerList.add(3);
        integerList.add(10);

        System.out.println(integerList.findKthLastElement(2).data); //3
    }
}

