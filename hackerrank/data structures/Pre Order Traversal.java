public class Solution {

  class Node {
      int data;
      Node left;
      Node right;
  }

  //root left right
  void preOrder(Node root) {
      System.out.print(root.data + " ");
      if(root.left != null){
         preOrder(root.left);
      }
      if(root.right != null){
         preOrder(root.right);
      }

  }
}
