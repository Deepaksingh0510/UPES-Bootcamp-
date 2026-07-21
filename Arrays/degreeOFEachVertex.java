public class degreeOFEachVertex {
    
    int[] find(int [][]grid){
        int r=grid.length;
        int c=grid[0].length;

        int ans[]=new int[r];

        for(int i=0;i<r;i++){
            int degree=0;
            for(int j=0;j<c;j++){
                degree+=grid[i][j];
            }

            ans[i]=degree;
        }

        return ans;
    }

    public static void main(String[] args) {
        int grid[][]={{0,1,1},{1,0,1},{1,1,0}};

        degreeOFEachVertex d=new degreeOFEachVertex();
        int res[]=d.find(grid);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
