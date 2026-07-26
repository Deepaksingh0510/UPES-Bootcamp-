public class rotate90Matrix {
    
    void rotate(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;

        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


        for(int i=0;i<r;i++){
            int left=0;
            int right=r-1;

            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};


        rotate90Matrix r=new rotate90Matrix();
        r.rotate(matrix);
        for(int []x:matrix){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }
}
