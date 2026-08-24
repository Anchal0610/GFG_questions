class Solution {
    static class Item {
        int value ;
        int weight;
        
        Item(int value , int weight){
            this.value = value;
            this.weight = weight;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;

        Item[] items = new Item[n];
        for(int i=0 ; i<n ; i++){
            items[i] = new Item(val[i] , wt[i]); 
        }
        Arrays.sort(items , (a,b) ->{
            double r1 = (double)a.value/a.weight;
            double r2 = (double)b.value/b.weight;
            
            return Double.compare(r2 , r1);
        });
        
        double totalValue = 0;
        for(int i=0 ; i<n ; i++){
            if(items[i].weight <= capacity){
                totalValue += items[i].value;
                capacity -= items[i].weight;
            }
            else{
                totalValue += ((double) items[i].value / items[i].weight)
                * capacity;
                break;
            }
        }
        return totalValue;
        
    }
}