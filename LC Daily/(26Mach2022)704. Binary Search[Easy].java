class Solution {
    public int search(int[] nums, int target) {
        int left = 0; //start
        int right = nums.length - 1; // end
        
        while(left <= right){ //stoping condition
            int mid = (left + right) / 2; // find mid
            
            if(nums[mid] == target) return mid; // if tar is at mid
            else if(nums[mid] > target) right = mid - 1; // if tar is on left side
            else if(nums[mid] < target) left = mid + 1; // if tar is on right side
        }
        return -1;// if mid != tar
    }
}