class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]< nums.length && nums[i] > 0 && nums[nums[i]-1] != nums[i] && nums[i] != i +1){
                swap(nums, nums[i]-1, i);
                i--;
            }
        }

        for(int i = 0;i<nums.length;i++)
            if(i+1 != nums[i])
                return i+1;
        return nums.length+1;
    }

    static void  swap(int [] nums, int firstIndex, int secondIndex){
        nums[firstIndex] = nums[firstIndex] ^ nums[secondIndex];
        nums[secondIndex] = nums[firstIndex] ^ nums[secondIndex];
        nums[firstIndex] = nums[firstIndex] ^ nums[secondIndex];
    }
}