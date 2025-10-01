class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int num[]=new int[n*2];

        for(int i=0; i<n; i++){
            num[i]=nums[i];
            num[n+i]=nums[i];
        }
        return num;
    }
}