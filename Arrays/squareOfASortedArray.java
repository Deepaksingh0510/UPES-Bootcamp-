import java.util.*;
public class squareOfASortedArray {
    
    int[] soln(int[] num){
        int s=num.length;
        int ans[]=new int[s];

        // int left=0;
        // int right=s-1;
        // int index=s-1;

        // while(left<right){
        //     int ls=num[left]*num[left];
        //     int rs=num[right]*num[right];

        //     if(ls>rs){
        //         ans[index]=ls;
        //         left++;
        //     }else{
        //         ans[index]=rs;
        //         right--;
        //     }

        //     index--;
        // }
        
        for(int i=0;i<s;i++){
            ans[i]=num[i]*num[i];
        }

        Arrays.sort(ans);

        return ans;
    } 
    public static void main(String[] args) {

        int num[]={-4,-1,0,3,10};
        squareOfASortedArray s=new squareOfASortedArray();
        int res[]=s.soln(num);
        for(int x:res){
            System.out.print(x+ " ");
        }

        
    }
}
