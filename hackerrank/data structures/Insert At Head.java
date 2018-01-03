public class Solution {

  class Node {
   int data;
   Node next;
  }

  Node Insert(Node head,int x) {
    Node newHead = new Node();
    newHead.data = x;
    newHead.next = head;
    return newHead;
  }
}
