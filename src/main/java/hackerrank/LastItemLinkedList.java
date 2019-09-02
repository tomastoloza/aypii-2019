package hackerrank;

public class LastItemLinkedList {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head != null) {
            SinglyLinkedListNode next = new SinglyLinkedListNode();
            next.data = data;
            head.next = next;
        }
        return head;
    }
}
