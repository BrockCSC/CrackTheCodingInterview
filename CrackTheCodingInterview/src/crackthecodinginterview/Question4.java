/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 * 
 * given a circularly linked list with extra items at the beginning, write a method to print out the head of the cycle
 * 
 */
 
public class Question4 {

    private static class CirclyLinkedList<E> {

        public Node<E> head;
        private int size;

        public class Node<E> {
            E data;
            Node next;

            public Node(E data) {
                this.data = data;
                this.next = null;
            }

            public Node(E data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        //method to add nodes in general
        public void add(E object) {

            if (head == null) {
                head = new Node<E>(object);
            }

            else {

                Node p = head;

                while (p.next != null) {
                    p = p.next;
                }

                p.next = new Node<>(object);
                size++;
            }
        }

        public void add(E data, int index) {
            if (index > size) return;

            if (head == null) {
                head = new Node<>(data);
            }

            Node p = head;

            while (p.next != null) {
                p = p.next;
            }

            p.next = new Node<E>(data, get(index));
        }

        private Node<E> get(int index) {
            int curr = 0;
            Node p = head;

            while (p.next != null && curr < index) {
                curr++;
                p = p.next;
            }

            return p;
        }

        private void printHeadOfCycle() {

            Node p = this.head; //fast
            Node q = this.head; //slow

            //while the pointers dont meet, iterate
            while (p.next.next != q) {
                p = p.next.next;
                q = q.next;
            }

            //the first time they meet, reset the fast pointer
            p = head;

            //get them to meet a second time
            while (p.next.next != q) {
                p = p.next.next;
                q = q.next;
            }

            //this is head of the cycle
            System.out.println(q.data);

        }
    }

    public static void main(String[] args) {

        CirclyLinkedList<Integer> listy = new CirclyLinkedList<Integer>();

        listy.add(0);
        listy.add(1);
        listy.add(2);
        listy.add(3);
        listy.add(4);
        listy.add(5);
        listy.add(6);
        listy.add(7);
        listy.add(8);
        //Make a new node that points back to the node at position 2
        listy.add(9, 2);

        listy.printHeadOfCycle();

    }
}
