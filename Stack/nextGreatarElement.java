
import java.util.*;

class nextGreatarElement {

    //IMPORTANT TOPIC 
    // Brute force 
    int[] find1(int arr[]) {
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    ans[i] = arr[j];
                    break;
                } else {
                    ans[i] = 0;
                }
            }
        }

        return ans;
    }

    //Optimized (USING STACK AND ARRAY)
    int[] find2(int arr[]) {
        Stack<Integer> PG = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        Arrays.fill(ans, 0);

        for (int s = 0; s < n; s++) {
            while (!PG.isEmpty() && arr[s] > arr[PG.peek()]){
                int out = PG.pop();
                ans[out] = arr[s];


                
            }

            PG.push(s);
        }
        return ans;

    }

    public static void main(String args[]) {
        int arr[] = {4, -1, 2, 3, -3};

        nextGreatarElement n = new nextGreatarElement();
        int res[] = n.find2(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
