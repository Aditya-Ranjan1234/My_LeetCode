class Solution {
    public int longestPalindrome(String s) {
        int p=0,odd=0;
       HashMap<Character, Integer> count = new HashMap<Character, Integer>();
       for(int i=0;i<s.length();i++)
       {
        if(count.containsKey(s.charAt(i)))
        count.put(s.charAt(i),count.get(s.charAt(i))+1);
        else
        count.put(s.charAt(i),1);
       }
       Iterator counter = count.entrySet().iterator();
        while (counter.hasNext()) {
            Map.Entry mapElement
                = (Map.Entry)counter.next();
            int c = (int)mapElement.getValue();
            if(c%2==0)
            p+=c;
            else
            {
            p+=(c-1);
            odd=1;
            }
        }
       if(odd==0)
       return p;
       else
       return p+1;
    }
}

/*
Optimal Solution

Same Logic , Array gives O(1)

class Solution {
    public int longestPalindrome(String s) {
        int oddCount = 0;
        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
            if (freq[ch] % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }

        if (oddCount > 1)
            return s.length() - oddCount + 1;
        return s.length();
    }
}
*/
