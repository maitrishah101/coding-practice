public class Solution {
    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
      return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBSTHelper(Node node, int min, int max){
      if(node == null){
        return true;
      }
      if(node.data < min || node.data > max){
        return false;
      }
      return checkBSTHelper(node.left, min, node.data - 1) && checkBSTHelper(node.right, node.data + 1, max);
    }
}
