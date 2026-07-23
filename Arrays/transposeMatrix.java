public class transposeMatrix {
    
    int[][] transpose(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;

        int ans[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[j][i]=arr[i][j];
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        transposeMatrix t=new transposeMatrix();
        int [][]res=t.transpose(arr);
        for(int []x:res){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }


    }
    
}
