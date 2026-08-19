class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> sumSubset = new ArrayList<>();
        getSum(0 , 0 , arr , sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
        
    }
    private void getSum(int indx , int sum , int []arr, ArrayList<Integer> sumSubset){
        if(indx == arr.length){
            sumSubset.add(sum);
            return;
        }
        getSum(indx+1 , sum+arr[indx] ,arr , sumSubset);
        
        getSum(indx+1 , sum , arr , sumSubset);
        
    }
}