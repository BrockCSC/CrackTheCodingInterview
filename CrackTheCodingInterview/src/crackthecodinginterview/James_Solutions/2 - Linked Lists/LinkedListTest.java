/*Experimental LinkedList class*/

public class LinkedListTest {

	Node<Character> head;
	int size;
	
	public LinkedListTest(Node<Character> n) {
		head = n;
		size = n == null ? 0 : 1;
	}

	public Node<Character> reverse(Node<Character> n) {

		if(n == null) return null;

		if(n.next == null) return n;

		Node<Character> temp = n.next;
		n.next = null;

		Node<Character> body = reverse(temp);

		temp.next = n;

		return body;
	}

	public static void main(String[] args) {

		Node<Character> head = new Node<Character>(null, 'J');
		head.add('a');
		head.add('m');
		head.add('e');
		head.add('s');

		head.print();

		head = new LinkedListTest(head).reverse(head);

		head.print();
	}

}