class Solution {
    public int search(int[] nums, int target) {
        int flag = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                flag = 1;
                index = i;
            }
        }
        if (flag == 1){
            return index;
        }else{
            return -1;
        }
    }
}