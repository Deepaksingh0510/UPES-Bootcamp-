class Solution{

    int findDay(int prices[]){
        int left=0;
        int right=1;
        int profit=0;

        while(right<prices.length){
            if(prices[left]<prices[right]){
                profit=Math.max(profit,prices[right]-prices[left]);
            }else{
                left=right;
            }   

            right++;
        }
        return profit;
    }
}
class bestTimeToBuyStocks{
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};

        Solution s=new Solution();
        System.out.print(s.findDay(prices));
    }
}
