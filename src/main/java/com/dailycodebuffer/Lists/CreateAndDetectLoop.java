package com.dailycodebuffer.Lists;


public class CreateAndDetectLoop {

	/**
	 * Prints the linked list.
	 * 
	 * @param	head	head node of the linked list
	 */
	static String printList(Node head) {
        StringBuilder builder = new StringBuilder();
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            builder.append(cur.value + " ");
            cur = cur.next;
        }
        return builder.toString();
    }

	/**
	 * Creates a loop in the linked list.
	 * @see 	<a href="https://www.geeksforgeeks.org/make-loop-k-th-position-linked-list/">
	 * 			GeeksForGeeks: Make a loop at K-th position</a>
	 * @param	head	head node of the linked list
	 * @param	k		position of node where loop is to be created
	 */
    static void createLoop(Node head, int k) {
    	if (head == null)
    		return;
        Node temp = head;
        int count = 1;
        while (count < k) { 		// Traverse the list till the kth node
            temp = temp.next;
            count++;
        }

        Node connectedPoint = temp;

        while (temp.next != null) 	// Traverse remaining nodes
            temp = temp.next;

        temp.next = connectedPoint; // Connect last node to k-th element
    }

    /**
	 * Detects the presence of a loop in the linked list.
	 * @see 	<a href="https://en.wikipedia.org/wiki/Cycle_detection#Floyd's_tortoise_and_hare">
	 * 			Floyd's Cycle Detection Algorithm</a>
	 * 
	 * @param 	head 	the head node of the linked list
	 * 
	 * @return 	true if loop exists else false
	 */
    static boolean detectLoop(Node head) {
    	Node sptr = head;
    	Node fptr = head;
    	
    	while (fptr != null && fptr.next != null) {
    		sptr = sptr.next;
    		fptr = fptr.next.next;
    		if (fptr == sptr)
    			return true;
    	}
    	
    	return false;
    }
}
