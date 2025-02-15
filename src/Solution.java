class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        int index = 0;
        for(int i = 0; i < ans.length; i++) {
            ans[i] = nums[index++];
            if (index == n) index = 0;
        }
        return ans;
    }
}