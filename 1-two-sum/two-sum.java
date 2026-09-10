class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length ; i++){
            for(int j = i+1; j <nums.length ; j++){
                int a = i;
                int b = j;

                if((nums[a] + nums[b]) == target){
                int[] arr = new int[2];
                arr[0] = a;
                arr[1] = b;
                return arr;
            }
            else{
                continue;
            }
            }
           

        }
         int[] arr = new int[2];
         return arr;
    }
}