import java.util.*;
class NGE2{

    int[] find(int arr[]){
        Stack<Integer> s=new Stack<>();

        int ans[]=new int[arr.length];
        Arrays.fill(ans,-1);

        for(int i =0;i<2*arr.length;i++){
            int idx=i%arr.length;
            while(!s.isEmpty() && arr[idx]>arr[s.peek()]){
                int out=s.pop();
                ans[out]=arr[idx];
            }

            s.push(idx);
        }

        return ans;
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,3};

        NGE2 n=new NGE2();
        int res[]=n.find(arr);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}