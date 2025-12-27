class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != i && nums[i] <nums.length ){
                swap(nums, nums[i], i);
                i--;
            }
        }

        for(int i = 0;i<nums.length;i++)
            if(i != nums[i])
                return i;
        return nums.length;
    }

    static void  swap(int [] nums, int firstIndex, int secondIndex){
        nums[firstIndex] = nums[firstIndex] ^ nums[secondIndex];
        nums[secondIndex] = nums[firstIndex] ^ nums[secondIndex];
        nums[firstIndex] = nums[firstIndex] ^ nums[secondIndex];
    }
}