class Solution {
    public void sortColors(int[] nums) {
        int k=0,freq[]={0,0,0};
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            freq[0]++;
            else if(nums[i]==1)
            freq[1]++;
            else
            freq[2]++;
        }
        for(int i=0;i<nums.length;)
        {
            if(freq[k]>0)
            {
            nums[i]=k;
            freq[k]--;
            i++;
            }
            else
            k++;
        }       
    }
}
