class Solution {
    public int maxNumberOfBalloons(String text) {
    int count[]=new int[26];
    for (int i = 0; i < text.length(); i++) {
      count[text.charAt(i) - 'a']++;
    }  
    int k=0;
    String t="balloon";
    while(1>0)
    {
        for (int i = 0; i < t.length(); i++) 
        {
        count[t.charAt(i) - 'a']--;
        if(count[t.charAt(i) - 'a']<0)
           return k;
        } 
        k++;
    }
    }
}
