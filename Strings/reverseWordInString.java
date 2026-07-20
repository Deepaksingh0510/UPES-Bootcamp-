class reverseWordInString{
    
    String soln(String s){
        String arr[]=s.split(" ");

        for(int i=0;i<arr.length;i++){
            arr[i]=new StringBuilder(arr[i]).reverse().toString();

        }

        return String.join(" ",arr);
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";


        reverseWordInString r=new reverseWordInString();
        System.out.print(r.soln(s));
    }
}