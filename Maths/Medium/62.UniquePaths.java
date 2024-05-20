class Solution {
    public int uniquePaths(int m, int n) {
        int rem[][]=new int[m+1][n+1];
        return count(m,n,rem);
    }
    int count(int m,int n, int rem[][])
    {
       if( m < 1 || n < 1) return 0;
       if (m == 1 || n == 1) return 1;
       if (rem[m][n] == 0) {
        rem[m][n] = count(m - 1, n, rem) + count(m, n - 1, rem);
    }
       return rem[m][n];
    }
}
