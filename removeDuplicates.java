import java.util.*;

class removeDuplicates {

    void remove(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int x : arr) {
            hs.add(x);
        }

        System.out.println("Origial array ");

        for (int x : arr) {
            System.err.print(x + " ");
        }

        System.out.println("");

        System.out.println("New array ");

        int res[]=new int[hs.size()];
        int i=0;
        for (int x : hs) {
            res[i++]=x;
        }

        for(int x:res){
            System.out.print(x+" ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 2, 3, 4, 5, 1, 4};

        removeDuplicates rm = new removeDuplicates();
        rm.remove(arr);
    }

}
