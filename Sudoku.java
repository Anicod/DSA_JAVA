import java.util.*;

public class Solution {
	public void solveSudoku(char[][] A) {
        boolean res = sudoku(A, 0);

	}
    public static boolean sudoku(char[][] A, int cell){
        if(cell==81){
            return true;
        }
        int i = cell/9;
        int j = cell%9;
        if(A[i][j]!='.'){
            return sudoku(A, cell+1);
        }
        for(int k=1; k<=9; k++){
            boolean safe = isSafe(A, i, j, Character.forDigit(k, 10));
            if(safe){
                A[i][j] = Character.forDigit(k, 10);
                boolean sa = sudoku(A, cell+1);
                if(sa==true){
                    return true;
                }
                A[i][j] = '.';
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] A, int row, int col, char k){
        for(int i=0; i<A.length; i++){
            if(A[i][col]==k){
                return false;
            }
        }
        for(int i=0; i<A.length; i++){
            if(A[row][i]==k){
                return false;
            }
        }
        int start_row = row-row%3;
        int start_col = col-col%3;
        for(int i=start_row; i<start_row+3; i++){
            for(int j=start_col; j<start_col+3; j++){
                if(A[i][j]==k){
                    return false;
                }
            }
        }
        return true;
    }
}package javaplaylist;

public class Sudoku {

}
