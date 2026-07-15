class subsetSum{
    boolean isSubsetSum(int coins[],int sum){
        return helper(0, coins, sum);
    }

    boolean helper(int i,int coins[],int sum){
        if(sum==0){
            return true;
        }
        if(i==coins.length){
            return false;
        }

        boolean take=false;
        if(coins[i]<=sum){
            take=helper(i+1,coins,sum-coins[i]);
        }
        boolean notTake=helper(i+1,coins,sum);

        return take || notTake;
    }
    public static void main(String[] args) {
       int arr[]={3, 34, 4, 12, 5, 2};
       int sum=9;
       
       subsetSum s=new subsetSum();
       System.out.print(s.isSubsetSum(arr, sum));
    }
}