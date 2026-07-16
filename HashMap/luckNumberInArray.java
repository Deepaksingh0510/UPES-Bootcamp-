import java.util.HashMap;
import java.util.Map;

public class luckNumberInArray {
    
    int find(int arr[]){
        HashMap<Integer,Integer> h=new HashMap<>();

        for(int x:arr){
            h.put(x,h.getOrDefault(x, 0)+1);
        }
        
        int ans=-1;
        for(Map.Entry<Integer,Integer> entry: h.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();

            if(key==value){
                ans=Math.max(ans,key);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int []arr={2,2,3,4};

        luckNumberInArray l=new luckNumberInArray();
        System.out.print(l.find(arr));
    }
}
