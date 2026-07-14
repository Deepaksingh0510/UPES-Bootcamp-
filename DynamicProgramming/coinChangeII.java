
class coinChangeII {

    int coinChange(int i, int[] coins, int sum) {
        if (i == coins.length) {
            if (sum == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (sum < 0) {
            return 0;
        }
        int take = 0;
        if (coins[i] <= sum) {
            take = coinChange(i, coins, sum - coins[i]);
        }
        int not_take = coinChange(i + 1, coins, sum);

        return take + not_take;

    }

}
