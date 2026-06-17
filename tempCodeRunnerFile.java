class swap{
    void res(int a , int b){
        a=a^b;
        b=a^b;
        a=a^b

        System.out.print("a = "+a+"b = "+b);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();


        swap s=new swap();
        s.res(a,b);
    }
}