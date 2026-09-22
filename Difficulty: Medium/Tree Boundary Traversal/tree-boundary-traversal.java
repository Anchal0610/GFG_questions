/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(isLeaf(root) ==  false){
            ans.add(root.data);
        }
        addLeftBoundary(root ,ans);
        addLeaf(root , ans);
        addRightBoundary(root , ans);
        return ans;
    }
    public boolean isLeaf(Node root){
        if(root.left == null && root.right == null){
            return true;
        }
        return false;
    }
    
    public void addLeftBoundary(Node root , ArrayList<Integer> ans){
        Node curr = root.left;
        while(curr != null){
            if( isLeaf(curr) == false){
                ans.add(curr.data);
            }
            if(curr.left != null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }
    public void addLeaf(Node root , ArrayList<Integer> ans ){
        if(isLeaf(root)){
            ans.add(root.data);
        }
        if(root.left != null){
            addLeaf(root.left , ans);
        }
        if(root.right != null){
            addLeaf(root.right , ans);
        }
    }
    public void addRightBoundary(Node root ,ArrayList<Integer> ans){
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr != null){
        if(isLeaf(curr) == false){
            temp.add(curr.data);
        }
        if(curr.right != null){
            curr = curr.right;
        }
        else{
            curr = curr.left;
        }
        }
        for(int i = temp.size()-1 ; i>=0 ; i--){
            ans.add(temp.get(i));
        }
    }
    
}