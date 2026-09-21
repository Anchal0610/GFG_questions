/* Node Structure
class Node{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
} */
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if(root ==  null){
            return true;
        }
        if(root.left == null && root.right ==  null){
            return true;
        }
        int child = 0;
        if(root.left != null){
            child += root.left.data;
        }
        if(root.right != null){
            child += root.right.data;
        }
        if(root.data !=  child){
            return false;
        }
        
        return isSumProperty(root.left) &&  isSumProperty(root.right);
    }
    
}