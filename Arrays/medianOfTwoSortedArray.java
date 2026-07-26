public class medianOfTwoSortedArray {

    int[] merge(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;


        int i=0;
        int k=0;
        int j=0;

        int arr[]=new int[n+m];

        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                k++;
                i++;
            }else{
                arr[k]=arr2[j];
                k++;
                j++;
            }
        }

        while(i<n){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            arr[k]=arr2[j];
            k++;
            j++;
        }

        return arr;

        
    }

    double median(int[] arr){

        int len=arr.length;

        if(len%2==1){
            return arr[len/2];
        }else{
            return (arr[len/2]+arr[len/2-1])/2.0;
        }

    }
    public static void main(String[] args) {
        int []arr1={1,2};
        int []arr2={3,4};
        medianOfTwoSortedArray m=new medianOfTwoSortedArray();
        int merged[]=m.merge(arr1, arr2);
        double res=m.median(merged);

        System.out.println(res);

    }
}
