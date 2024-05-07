class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
         for (int i = 0; i < nums.length - 2; i++) //num-2 since we need triplet
        {
         // other two elements 
         int left = i + 1;
         int right = nums.length - 1;
         while (left < right) 
            {
             int sum = nums[i] + nums[left] + nums[right];

             if (sum == 0)
               {
               // Set removes duplicates
               result.add(Arrays.asList(nums[i], nums[left], nums[right]));
               left++;
                right--;
               }
             else if(sum < 0)
             left++;
             else
             right--;
            }
        }
     return new ArrayList<>(result);
    }
}



// Hash Set removes duplicates, add asList function , Two pointer Technique 
