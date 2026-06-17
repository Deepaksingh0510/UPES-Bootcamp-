class bitMan{

    public static void main(String args[]){
        int a = 0b0010010;
        int b = 0b0100010;

        System.out.println(Integer.toBinaryString(a & b));
        
        int c=01001010;
        int d=00000001;
        
        System.out.println(Integer.toBinaryString(a | b));

    }
}
