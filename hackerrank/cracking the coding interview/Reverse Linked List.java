public class Solution {
  class Node {
    int data;
    Node next;

    public Node(int d){
      data = d;
    }
  }

  Node Reverse(Node head) {
    Node currNode = head;
    Node prevNode = null;
    Node nextNode = null;
    while(currNode != null){
        nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
    }
    return prevNode;
  }
}
