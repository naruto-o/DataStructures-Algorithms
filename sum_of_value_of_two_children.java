class solution{
  public boolean checkTree(TreeNode root){
    if(root.left.val + root.right.val == root.val){
      return true;
    }
    return false;
  }
}
//the above code is the main function for calculation the sum of two child nodes of a binary tree and checking if the sum is equal to the root node
// we can fully complete the code by adding the tree node and class of binary tree with any tree traversalv
