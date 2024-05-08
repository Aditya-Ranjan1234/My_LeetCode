//Backtracking

class Solution {
    public List<String> letterCombinations(String digits) {

    Map<Character, String> Letters = new HashMap<>();
    Letters.put('2', "abc");
    Letters.put('3', "def");
    Letters.put('4', "ghi");
    Letters.put('5', "jkl");
    Letters.put('6', "mno");
    Letters.put('7', "pqrs");
    Letters.put('8', "tuv");
    Letters.put('9', "wxyz");

    List<String> answer = new ArrayList<>();

    if (digits.length() > 0) 
    solve(0, digits, Letters, "", answer);

    return answer;
    }

    void solve(int k, String digits, Map<Character, String> Letters, String updated, List<String> answer)
    {
        if (k == digits.length()) {
            answer.add(updated);
            return;
        }

         String values = Letters.get(digits.charAt(k));

        for (int i = 0; i < values.length(); i++) {
            char c = values.charAt(i);
            solve(k+1,digits, Letters, updated + c, answer);
        }

    }
}

/* Most Optimal Solution

  class Solution {
  public List<String> letterCombinations(String digits) {
    if (digits.isEmpty())
      return new ArrayList<>();

    List<String> ans = new ArrayList<>();

    dfs(digits, 0, new StringBuilder(), ans);
    return ans;
  }

  private static final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
                                                  "jkl", "mno", "pqrs", "tuv", "wxyz"};

  private void dfs(String digits, int i, StringBuilder sb, List<String> ans) {
    if (i == digits.length()) {
      ans.add(sb.toString());
      return;
    }

    for (final char c : digitToLetters[digits.charAt(i) - '0'].toCharArray()) {
      sb.append(c);
      dfs(digits, i + 1, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}
*/
