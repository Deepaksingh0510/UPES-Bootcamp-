public class repeatedSubstringPattern {
    boolean find(String s){
        boolean ans=(s+s).indexOf(s,1)!=s.length();
        return ans;

    }

    public static void main(String[] args) {
        String s="abcabcabcabcabc";
        repeatedSubstringPattern r=new repeatedSubstringPattern();
        System.out.print(r.find(s));
    }   
}
