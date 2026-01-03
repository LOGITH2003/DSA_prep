class Solution {
    public int smallestIndex(int[] nums) {
        int max = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(countValue(nums[i]) == i)
                max = Math.min(max, i);
        }

        return max == Integer.MAX_VALUE ? -1 : max;
    }

    public int countValue(int n){
        int count = 0;

        while(n !=0){
            count += n%10;
            n/=10;
        }

        System.out.println(count);
        return count;
    }
}