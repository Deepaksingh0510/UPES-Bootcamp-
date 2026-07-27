public class removeOuterParenthesis {
    
    String remove(String s){
        StringBuilder a=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                if(count>0){
                    a.append(ch);
                }
                count++;
            }else{
                count--;
                if(count>0){
                    a.append(ch);
                }
            }
        }
        return a.toString();
    }
    public static void main(String[] args) {
        
        String s="(()())(())(()(()))";

        removeOuterParenthesis r=new removeOuterParenthesis();
        System.out.print(r.remove(s));


    }
}
