class Solution {
    public int coinChange(int[] arr, int t) {
        int n=arr.length;
        int prev[]=new int[t+1];
        int cur[]=new int[t+1];
        for(int i=0;i<=t;i++){
            if(i%arr[0]==0)prev[i]=i/arr[0];
            else prev[i]=(int)Math.pow(100,9);
        }
         for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= t; target++) {
                int notTake = 0 + prev[target];
                int take = (int) Math.pow(10, 9);
            if (arr[ind] <= target)
                    take = 1 + cur[target - arr[ind]];
                cur[target] = Math.min(notTake, take);
            }
           prev = cur.clone();
        }
         int ans = prev[t];
       if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }
}
