class Solution {
    public int[] twoSum(int[] nums, int target) {
      int a[]=new int[2];
      int p=0,q=0;
      for(int i=0;i<nums.length;i++)
      {
          int t=target-nums[i];
          for(int j=i+1;j<nums.length;j++)
          if(t==nums[j])
          {a[0]=i;
          a[1]=j;}
      }
      return a;  
    }
}

/*

Optimised Code O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pairIdx.containsKey(target - num)) {
                return new int[] { i, pairIdx.get(target - num) };
            }
            pairIdx.put(num, i);
        }

        return new int[] {};        
    }
}
*/
