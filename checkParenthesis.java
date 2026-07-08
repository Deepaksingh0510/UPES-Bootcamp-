import java.util.*;
class checkParenthesis{

    boolean check(String s){
        Stack<Character> st=new Stack<>();

        int size=s.length();

        for(int i=0;i<size;i++){
            char ch=s.charAt(i);

            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    if(st.peek()=='('){
                        st.pop();
                    }else{
                        return false;
                    }

                }
            }
        }
        return st.isEmpty();
    }

    boolean check1(String s){

        int count =0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }else{
                count--;
            }
        }

        if(count==0){
            return true;
        }
        return false;

    }
    public static void main(String args[]){
        String s=")(";
        checkParenthesis c=new checkParenthesis();
        System.out.print(c.check(s));
        System.out.println();
        System.out.print(c.check1(s));


    }
}