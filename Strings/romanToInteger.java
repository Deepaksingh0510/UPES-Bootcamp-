public class romanToInteger {
    
    int convert(String s){
        int n=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='M'){
                n+=1000;
            }else if(ch=='D'){
                n+=500;
            }else if(ch=='C'){
                if(i+1<s.length()&& s.charAt(i+1)=='M'){
                    n+=900;
                    i++;
                }else if(i+1<s.length()&&s.charAt(i+1)=='D'){
                    n+=400;
                    i++;
                }else{
                    n+=100;
                }
            }else if(ch=='L'){
                n+=50;
            }else if(ch=='X'){
                if(i+1<s.length()&&s.charAt(i+1)=='C'){
                    n+=90;
                    i++;
                }else if(i+1<s.length()&&s.charAt(i+1)=='L'){
                    n+=40;
                    i++;
                }else{
                    n+=10;
                }
            }else if(ch=='V'){
                n+=5;
            }else if(ch=='I'){
                if(i+1<s.length()&&s.charAt(i+1)=='X'){
                    n+=9;
                    i++;
                }else if(i+1<s.length()&&s.charAt(i+1)=='V'){
                    n+=4;
                    i++;
                }else{
                    n+=1;
                }
            }
        }

        return n;
    }
    public static void main(String[] args) {
        String s="MCMXCIV";

        romanToInteger r=new romanToInteger();
        System.out.print(r.convert(s));
    }
}
