/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {
    Node head;
    int size;

    public myStack() {
        // Initialize your data members
        head = null;
        size =0;
    
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return (head == null);
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        
        size++;
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        
    }

    public void pop() {
        // Removes the front element of the stack.
        if(isEmpty()){
            return ;
        }
        int res = head.data;
        head = head.next;
        size --;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
