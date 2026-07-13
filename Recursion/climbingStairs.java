class climbingStairs{


    //without DP
    int soln(int n){
        if(n==1||n==2){
            return n;
        }

        return soln(n-1)+soln(n-2);
    }

    public static void main(String[] args) {
        int n=4;

        climbingStairs s=new climbingStairs();
        System.out.print(s.soln(n));
    }
}