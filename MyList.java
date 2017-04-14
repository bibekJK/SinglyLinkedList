package singlyLinkedList;

public class MyList {
	static Node head;

	public static void main(String[] args) {
		MyList m1 = new MyList();
		m1.insertion(4);
		m1.insertion(3);
		m1.insertion(2);
		m1.insertion(1);
		m1.display(head);

		System.out.println("data found:::" + m1.search(head, 10));
		m1.delete(head, 3);
		m1.display(head);

	}

	// Insertion order insertion
	public void insertion(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}

	// Deleting an element

	public void delete(Node head, int data) {
		Node tempNode = new Node(0);
		while (head != null) {
			if (head.data == data) {
				tempNode.next = head.next;
			}
			tempNode = head;
			head = head.next;
		}

	}

	// Searching in the LinkedList
	public boolean search(Node head, int data) {

		while (head != null) {
			if (head.data == data) {
				return true;
			}
			head = head.next;
		}

		return false;
	}

	// Display
	public void display(Node head) {
		Node currNode = head;
		while (currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}

	}
}
