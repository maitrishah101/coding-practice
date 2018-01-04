public class Solution {

  class Node {
   int data;
   Node next;
  }

  Node Delete(Node head, int position) {
  if(position == 0){
      head = head.next;
      return head;
  }
  Node pointer = head;
  while(position > 1){
      pointer = pointer.next;
      position --;
  }
  pointer.next = pointer.next.next;
  return head;
  }
  
}
