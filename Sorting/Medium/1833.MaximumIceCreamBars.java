//Counting Sort

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int N = costs.length;
        int M = 0;
        for (int i = 0; i < N; i++) {
            M = Math.max(M, costs[i]);
        }
        int[] countArray = new int[M + 1];
        for (int i = 0; i < N; i++) {
            countArray[costs[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] outputArray = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[costs[i]] - 1] = costs[i];
            countArray[costs[i]]--;
        }
        int c=0,p=0;
        while(p<costs.length && coins>=outputArray[p] )
        {
            coins-=outputArray[p];
            c++;
            p++;
        }
        return c;
    }
}


/*
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        var maxCost = 1;
        var maxIceCream = 0;
        for (var i = 0; i < costs.length; i++)
            maxCost = Math.max(maxCost, costs[i]);

        var counters = new int[maxCost + 1];
        for (var i = 0; i < costs.length; i++)
            counters[costs[i]]++;

        for (var i = 0; i < counters.length; i++) {
            var cnt = counters[i];
            while (cnt-- > 0) {
                if ((coins -= i) >= 0)
                    maxIceCream++;
                else
                    return maxIceCream;
            }
        }
        return maxIceCream;
    }
}
*/
