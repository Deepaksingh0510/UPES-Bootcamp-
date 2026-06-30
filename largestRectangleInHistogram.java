import java.util.*;
class largestRectangleInHistogram {
    int find(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int n=heights.length;
        int left[]=new int[n];
        Arrays.fill(left,-1);
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                int out=s.pop();
                left[out]=i;
            }
            s.push(i);
        }

        s.clear();
        int right[]=new int[n];
        Arrays.fill(right,n);
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                int out=s.pop();
                right[out]=i;
            }

            s.push(i);
        }

        int maxArea=-1;
        for(int i=0;i<n;i++){
            int area=(right[i]-left[i]-1)*heights[i];
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;

    }

    public static void main(String args[]){
        int heights[]={2,1,5,6,2,3};

        largestRectangleInHistogram l=new largestRectangleInHistogram();
        System.out.print(l.find(heights));
    }

}