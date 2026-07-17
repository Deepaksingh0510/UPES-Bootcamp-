import java.util.Arrays;
class subsetSum{
    boolean isSubsetSum(int coins[],int sum){

        int [][]dp=new int[coins.length+1][sum+1];
        for(int []x:dp){
            Arrays.fill(x,-1);
        }
        return helper(0, coins, sum,dp);
    }

    boolean helper(int i,int coins[],int sum,int dp[][]){
        if(sum==0){
            return true;
        }
        if(i==coins.length){
            return false;
        }

        if(dp[i][sum]!=-1){
            return dp[i][sum]==1;
        }

        boolean take=false;
        if(coins[i]<=sum){
            take=helper(i+1,coins,sum-coins[i],dp);
        }
        boolean notTake=helper(i+1,coins,sum,dp);

        if(take || notTake){
            dp[i][sum]=1;
        }else{
            dp[i][sum]=0;

        }

        return take || notTake;
    }
    public static void main(String[] args) {
       int arr[]={3, 34, 4, 12, 5, 2};
       int sum=9;
       
       subsetSum s=new subsetSum();
       System.out.print(s.isSubsetSum(arr, sum));
    }
}