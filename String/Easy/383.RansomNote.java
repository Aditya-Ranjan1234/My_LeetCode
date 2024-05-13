class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
        
        HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
        for(int i=0;i<magazine.length();i++)
        if(!counter.containsKey(magazine.charAt(i)))
        counter.put(magazine.charAt(i),1);
        else
        counter.put(magazine.charAt(i),counter.get(magazine.charAt(i))+1);

        for(int i=0;i<ransomNote.length();i++)
        if(!counter.containsKey(ransomNote.charAt(i)))
        return false;
        else
        {
        counter.put(ransomNote.charAt(i),counter.get(ransomNote.charAt(i))-1);
        if(counter.get(ransomNote.charAt(i))<0)
        return false;
        }

        return true;
    }
}

/*
Optimal

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    int[] magazineArray = new int[26];

    for (int i = 0; i < magazine.length(); i++) {
      magazineArray[magazine.charAt(i) - 'a']++;
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      if (magazineArray[ransomNote.charAt(i) - 'a'] < 1) {
        return false;
      } else {
        magazineArray[ransomNote.charAt(i) - 'a']--;
      }
    }

    return true;
    }
}

why I typed c-'a'
It is because in ascii if you subtract any char with 'a' , it gives you index of that alphabet.
Still confused?
Let us assume a = 0 and z = 25. Now subtract a - a. You got 0 in ASCII, right?
now subtract d-a, in ASCII it is 100-97, it leaves you with 3. Isn't that the index of that character in our alphabet counter and isn't that the fact the a=0, b=1, c=2 and d=3. Got it?

*/
