import  java.util.*;
class NGE{
    int[] find(int arr1[],int arr2[]){
        HashMap<Integer,Integer> hm=new HashMap<>();

        Stack<Integer> s=new Stack<>();

        int n=arr2.length;

        for(int i =0;i<n;i++){
            while(!s.isEmpty() && arr2[i]>=s.peek()){
                int out=s.pop();
                hm.put(out,arr2[i]);
            }
            s.push(arr2[i]);
        }

        int ans[]=new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            ans[i]=hm.getOrDefault(arr1[i],-1);
        }
        return ans;
    }

    public static void main(String args[]){
        int []arr1={4,1,2};
        int []arr2={1,3,4,2};

        NGE n=new NGE();
        int res[]=n.find(arr1,arr2);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}