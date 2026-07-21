public class setMatrixZeros {

    void set(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;

        boolean[] row=new boolean[m];
        boolean[] column=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||column[j]){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};

        setMatrixZeros s=new setMatrixZeros();
        s.set(matrix);

    }
}
