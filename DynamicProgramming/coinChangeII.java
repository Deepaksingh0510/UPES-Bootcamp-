import java.util.*;
class coinChangeII {

    int coinChange(int[] coins, int sum) {
        int [][]dp=new int[coins.length+1][sum+1];
        for(int []x:dp){
            Arrays.fill(x,-1);
        }

        return helper(0, coins, sum, dp);

    }
    int helper(int i,int[] coins, int sum,int [][]dp){
        if(i==coins.length){
            if(sum==0){
                return 1;
            }else{
                return 0;
            }
        }

        if(dp[i][sum]!=-1){
            return dp[i][sum];
        }

        int take=0;
        if(coins[i]<=sum){
            take=helper(i, coins, sum-coins[i], dp);
        }
        int notTake=helper(i+1, coins, sum, dp);

        dp[i][sum]=take+notTake;
        return dp[i][sum];
    }

    public static void main(String[] args) {
        int coins[]={1,2,5};
        int sum=5;

        coinChangeII c=new coinChangeII();
        System.out.println(c.coinChange(coins, sum));
    }

}
