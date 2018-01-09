public class Solution {

  class Node {
    int data;
    Node next;

    public Node(int d){
      data = d;
    }
  }

  public void deleteMiddle(Node head){
    Node previous = head;
    Node slow = head;
    Node fast = head;
    while(slow != null && fast != null && fast.next != null){
      previous = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    previous.next = previous.next.next;
    slow.next = null;
  }

}
