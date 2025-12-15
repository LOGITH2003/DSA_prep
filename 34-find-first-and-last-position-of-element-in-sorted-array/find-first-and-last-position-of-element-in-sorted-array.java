class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr = {-1, -1};
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1}; // Return the standard "not found" result
        }

        int start = 0, end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                // Need to add the condition and fill the both start and end value using while loop.

                int left = mid, right = mid;
                while(true){
                    if(left != -1 && nums[left] == target)
                        left--;

                    if(right != nums.length && nums[right] == target)
                        right++;

                    if((left == -1 || nums[left] != target) && (right == nums.length || nums[right] != target))
                        break;
                }
                return new int []{left+1, right -1};

            }else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return arr;
    }
}