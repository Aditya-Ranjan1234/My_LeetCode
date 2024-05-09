class Solution {
    public boolean isMatch(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--) {
            for (int j = pattern.length() - 1; j >= 0; j--) {
                boolean first_match =
                    (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                            pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] || (first_match && dp[i + 1][j]);
                } else {
                    dp[i][j] = first_match && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}

/* Initial Approach

class Solution {
    public boolean isMatch(String s, String p) {
    int k=Math.max(s.length(),p.length());
    for(int i=0;i<k;i++)
    {
        if(i<p.length())
        {
            if(p.charAt(i)=='*')
            break;
            if(i<s.length() && i<p.length())
            {
            if(s.charAt(i)!=p.charAt(i) && p.charAt(i)!='.')
            return false;
            }
        }
        else
        {
            return false;
        }
    }
    return true;
   }
}

Error: s= "aab" , p= "c*a*b"
*/
