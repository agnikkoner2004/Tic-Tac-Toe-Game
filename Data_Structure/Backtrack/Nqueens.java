package Data_Structure.Backtrack;

public class Nqueens {
//this function will check if the position is safe or not
public static boolean isSafe(char[][]board, int row, int col){
    //check vartical up
    for(int i=row;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    //check diagonal left
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    //check diagonal right
    for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
public static void nQueens(char[][]board, int row){
    //base case
    if(row==board.length){

        printBoard(board);
        return;

    }
    for(int j=0;j<board.length;j++){
        if(isSafe(board, row, j)){
        board[row][j]='Q';
        nQueens(board, row+1);//function call
        board[row][j]='x';//backtrack
    }
    }
}
//print the board
//this function will print the board
public static void printBoard(char board[][]){
    System.out.print("------chase board------\n");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}
//main function
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
    
}
