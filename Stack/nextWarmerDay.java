import java.util.*;
class nextWarmerDay{

    int[] find(int temp[]){

        HashMap<Integer,Integer> hm=new HashMap<>();
    
        Stack<Integer> s=new Stack<>();
    
        int n=temp.length;
    
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temp[i]>temp[s.peek()]){
                int out=s.pop();
                hm.put(out,i-out);
            }
            s.push(i);
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=hm.getOrDefault(i,0);
        }
    
        return res;
    }
    public static void main(String args[]) {

        int []temp={73,74,75,71,69,72,76,73};

        nextWarmerDay n=new nextWarmerDay();
        int res[]=n.find(temp);

        for(int x:res){
            System.out.print(x+" ");
        }
    }
}