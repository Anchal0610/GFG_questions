/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    static int idx;
    public static void convertToMaxHeap(Node root) {
        // code here
        idx =0;
        ArrayList<Integer> in = new ArrayList<>();
        inorder(root , in);
        postorder(root , in);
    }
    private static void inorder(Node root , ArrayList<Integer> in){
        if(root ==  null){
            return;
        }
        inorder(root.left , in);
        in.add(root.data);
        inorder(root.right , in);
    }
     private static void postorder(Node root , ArrayList<Integer> in){
         if(root == null){
             return;
         }
         postorder(root.left , in);
         postorder(root.right , in);
         in.add(root.data);
         root.data = in.get(idx++);
     }
}