public class Solution {

  class Node {
       int data;
       Node next;
  }

  int GetNode(Node head,int n) {
      int index = 0;
      //2 pointers
      Node current = head;
      Node result = head;
      //keep moving the current pointer
      //the distance between the current and result pointers will be n
      while(current != null){
          current = current.next;
          if(index++ > n){
              result = result.next;
          }
      }
      return result.data;
  }
}
