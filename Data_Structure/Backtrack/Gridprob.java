package Data_Structure.Backtrack;

public class Gridprob {
    //fuction to find the number of ways to reach the destination
    public static int gridWays(int rows,int cols,int n,int m){
        //base case
        if(rows==n-1 && cols==m-1){//for last cell
            return 1;
        }
        else if(rows==n || cols==m){//for boundary condition
            return 0;
        }
        int w1=gridWays(rows+1, cols, n, m);
        int w2=gridWays(rows, cols+1, n, m);
        return w1+w2;

    }




    public static void main(String args[]){
        int n=3, m=3;
        System.out.println(gridWays(0,0,n,m));
        

    }
}
