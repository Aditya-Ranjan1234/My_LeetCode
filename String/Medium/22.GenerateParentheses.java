class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> combination =new ArrayList<>();
        Helper(combination, "", 0, 0, n);       
        return combination;
    }

    private void Helper(List<String> combination, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            combination.add(current);
            return;
        }

        if (open < max)
            Helper(combination, current + "(", open + 1, close, max);
        if (close < open)
            Helper(combination, current + ")", open, close + 1, max);
    }
}


/* Best Case Scenario

  class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();
    dfs(n, n, new StringBuilder(), ans);
    return ans;
  }

  private void dfs(int l, int r, final StringBuilder sb, List<String> ans) {
    if (l == 0 && r == 0) {
      ans.add(sb.toString());
      return;
    }

    if (l > 0) {
      sb.append("(");
      dfs(l - 1, r, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
    if (l < r) {
      sb.append(")");
      dfs(l, r - 1, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}

*/
