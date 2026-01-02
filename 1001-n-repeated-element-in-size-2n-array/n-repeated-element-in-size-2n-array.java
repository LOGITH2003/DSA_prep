class Solution {
    public int repeatedNTimes(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE, val = -1;

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);

            if(max<map.get(n)){
                max = map.get(n);
                val = n;
            }
        }

        return val;
    }
}