public class Solution {
    Node RemoveDuplicates(Node head) {
      Node pointer = head;
      while(pointer.next != null){
          if(pointer.next.data == pointer.data){
              pointer.next = pointer.next.next;
          }
          else {
              pointer = pointer.next;
          }

      }
      return head;
    }
}
