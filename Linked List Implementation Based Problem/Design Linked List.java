/*Using Singly Linked List*/
class MyLinkedList {

   class Node {
		Integer val;
	    Node next;

		public Node(Integer val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	Node head;
	Node tail;
	int n;

	/** Initialize your data structure here. */
	public MyLinkedList() {
		head = null;
		tail = null;
		n = 0;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		if (!isValid(index)) {
			return -1;
		}
		Node x = getNode(index);
		return x.val;
	}

	/**
	 * return true if the index has value in current linked list else false
	 */
	private boolean isValid(int index) {
		return index >= 0 && index < n;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		if (head == null) {
			head = new Node(val, null);
			tail = head;
		} else {
			head = new Node(val, head);
		}
		n++;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		if (tail == null) {
			addAtHead(val);
		} else {
			tail.next = new Node(val, null);
			tail = tail.next;
		}
		n++;
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index < 0 || index > n) {
			return;
		}
		if (index == 0) {
			addAtHead(val);
		} else if (index == n) {
			addAtTail(val);
		} else {
			Node beforeNode = getNode(index - 1);
			beforeNode.next = new Node(val, beforeNode.next);
			n++;
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (!isValid(index)) {
			return;
		}
		if (index == 0 && n == 1) {
			head = tail = null;
		} else if (index == 0) {
			head = head.next;
		} else {
			Node beforeNode = getNode(index - 1);
			beforeNode.next = beforeNode.next.next;
			if (n - 1 == index) { // important have missed to add this if check.
				tail = beforeNode;
			}
		}
		n--;
	}

	private Node getNode(int index) {
		Node x = head;
		int i = 0;
		while (i < index) {
			x = x.next;
			i++;
		}
		return x;
	}
}

/*Using Doubly linked list*/
public class MyLinkedList {

	class Node {
		int val;
		Node next;
		Node pre;

		public Node(int val, Node next, Node pre) {
			this.val = val;
			this.next = next;
			this.pre = pre;
		}
	}

	int n;
	Node head;
	Node tail;

	/** Initialize your data structure here. */
	public MyLinkedList() {
		n = 0;
		head = null;
		tail = null;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		if (!isValid(index)) {
			return -1;
		}
		Node x = getNode(index);
		return x.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		if (head == null) {
			head = new Node(val, null, null);
			tail = head;
		} else {
			head = new Node(val, head, null);
			head.next.pre = head;
		}
		n++;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		if (tail == null) {
			addAtHead(val);
		} else {
			tail = new Node(val, null, tail);
			tail.pre.next = tail;
			n++;
		}
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index < 0 || index > n) {
			return;
		}
		if (index == 0) {
			addAtHead(val);
		} else if (index == n) {
			addAtTail(val);
		} else {
			Node x = getNode(index - 1);
			x.next = new Node(val, x.next, x);
			x.next.next.pre = x.next;
			n++;
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (!isValid(index)) {
			return;
		}
		if (index == 0 && n == 1) {
			head = null;
			tail = null;
		} else if (index == 0) {
			head = head.next;
			head.pre = null;
		} else if (index == n - 1) {
			tail = tail.pre;
			tail.next = null;
		} else {
			Node x = getNode(index);
			x.pre.next = x.next;
			x.next.pre = x.pre;
		}
		n--;
	}

	/**
	 * return true if the index has value in current linked list else false
	 */
	private boolean isValid(int index) {
		return index >= 0 && index < n;
	}

	private Node getNode(int index) {
		Node x = null;
		if (index <= n / 2) {
			x = head;
			int i = 0;
			while (i != index) {
				x = x.next;
				i++;
			}
		} else {
			x = tail;
			int i = n - 1;
			while (i != index) {
				i--;
				x = x.pre;
			}
		}
		return x;
	}
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
