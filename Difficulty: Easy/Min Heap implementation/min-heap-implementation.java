class minHeap {
    ArrayList<Integer> arr;

    // Constructor
    public minHeap() {
        // Initialize your data members
        arr = new ArrayList<Integer>();
    }

    public void push(int x) {
        // Insert x into the heap
        arr.add(x);
        
        int i = arr.size() - 1;
        
        while(i > 0){
            int parent = (i-1)/2;
            if(arr.get(parent) <= arr.get(i)){
                break;
            }
            int temp = arr.get(parent);
            arr.set(parent , arr.get(i));
            arr.set(i , temp);
            
            i = parent;
        }
    }

    public void pop() {
        // Remove the top (minimum) element
        if(arr.size() == 0){
            return;
        }
        int last = arr.remove(arr.size() - 1);
        
        if(arr.size() == 0){
            return ;
        }
        arr.set(0 , last);
        
        int i =0 ;
        while(true){
            int left = 2*i + 1 ;
            int right  = 2*i + 2;
            int smallest  = i;
            
            if(left < arr.size() && arr.get(left) < arr.get(smallest)){
                smallest = left;
            }
            if(right < arr.size() && arr.get(right) < arr.get(smallest)){
                smallest  = right;
            }
            if(smallest == i){
                break;
            }
            
            int temp = arr.get(i);
            arr.set(i , arr.get(smallest));
            arr.set(smallest , temp);
            
            i = smallest;
        }
        
    }

    public int peek() {
        // Return the top element or -1 if empty
        if(arr.size() == 0){
            return -1;
        }
        return arr.get(0);
    }

    public int size() {
        // Return the number of elements in the heap
        return arr.size();
    }
}