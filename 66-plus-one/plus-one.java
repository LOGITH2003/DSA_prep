class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = true;
        for(int i = digits.length-1 ;i >=0; i--){
            if(flag){
                digits[i] +=1;
                if(digits[i] == 10) flag = true;
                else flag = false;
                digits[i]%=10;
            }
        }

        return digits[0] == 0 ? increaseOneIndex(digits) :digits;
    }

    public int [] increaseOneIndex(int [] digits){
        int [] nums = new int [digits.length+1];
        nums[0] = 1;
        for(int i = 0;i<digits.length;i++){
            nums[i+1] = digits[i];
        }

        return nums;
    }
}