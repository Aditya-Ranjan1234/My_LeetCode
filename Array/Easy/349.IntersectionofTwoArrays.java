class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>(); 
    for(int i=0;i<nums1.length;i++)
    set1.add(nums1[i]);
    HashSet<Integer> set2 = new HashSet<>(); 
    for(int i=0;i<nums2.length;i++)
    set2.add(nums2[i]);

    HashMap<Integer, Integer> map = new HashMap<>();

    for (Integer element : set1) {
    if(map.containsKey(element))
    map.put(element,map.get(element)+1);
    else
    map.put(element,1);
    }

    for (Integer element : set2) {
    if(map.containsKey(element))
    map.put(element,map.get(element)+1);
    else
    map.put(element,1);
    }

    int c=0;
    for (Integer key : map.keySet()) {
        if(map.get(key)==2)
        c++;
    }

    int n[]=new int[c];
    int t=0;
    for (Integer key : map.keySet()) {
        if(map.get(key)==2)
        n[t++]=key;
    }

    return n;
    }
}



/*
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] dp = new int[1000];

        for (int i : nums1) {
            dp[i]++;
        }

        int[] ans = new int[1000];
        int ptr = 0;

        for (int i : nums2) {
            if (dp[i] != 0) {
                dp[i] = 0;
                ans[ptr] = i;
                ptr++;
            }
        }
        

        return Arrays.copyOfRange(ans, 0, ptr);
    }
}
*/
