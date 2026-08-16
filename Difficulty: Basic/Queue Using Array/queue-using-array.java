class myQueue {
    int []arr;
    int front , cap , size;
    

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr = new int[n];
        cap = n;
        front =0;
        size =0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return (size == 0);
    }

    public boolean isFull() {
        // Check if queue is full
        return (size == cap);
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull()){
            return;
        }
        
        int rear = (front + size)%cap;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()){
            return;
        }
        front = (front+1)%cap;
        size--;
    }

    public int getFront() {
        // Get front element
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()){
            return -1;
        }
    
        int rear =  (front + size -1)%cap;
        return arr[rear];
        
    }
}
