public class Solution {
  class Node {
       int data;
       Node next;
  }

  int CompareLists(Node headA, Node headB) {
    if(headA == null && headB == null){
        return 1;
    }
    if(headA == null || headB == null){
        return 0;
    }
    if(headA.data != headB.data){
        return 0;
    }
    return CompareLists(headA.next, headB.next);
  }
}
