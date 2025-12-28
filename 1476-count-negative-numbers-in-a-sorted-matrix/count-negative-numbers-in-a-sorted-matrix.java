class Solution {
    public int countNegatives(int[][] grid) {
        
        int count = 0;

        for(int [] num :  grid){
            int val = findNegativeIndex(num);
            count += num.length - val;
        }
        
        return count;
    }

    // Using binary search find the negative index in the array.
    public int findNegativeIndex(int [] arr){
        int start = 0, end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= 0 ){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}