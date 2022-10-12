package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class N_Queen {

    public static void main(String[] args) {

        int n=4;

        String[][] board=new String[n][n];

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

              board[i][j]=".";
            }
        }
        List<List<String[][]>> ans=new ArrayList<>();

       findN_QueenBoards(0,board,ans,n);

       for(int i=0;i<ans.size();i++){

          List<String[][]> chess=ans.get(i);

           String[][] data= chess.get(0);

           for(int j=0;j<n;j++){
               System.out.println(Arrays.toString(data[j]));
           }

       }

    }

    public static void findN_QueenBoards(int col,String[][] board,List<List<String[][]>> ans,int n){

        if(col==n){
           List<String[][]> list=new ArrayList<>(Collections.singleton(board));
            ans.add(list);
            return;
        }

        for(int row=0;row<n;row++){


            if(isSafe(row,col,board,n)){

                board[row][col]="Q";
                findN_QueenBoards(col+1,board,ans,n);
                board[row][col]=".";
            }

        }


    }


    public static boolean isSafe(int row,int col,String[][] board,int n){

        int savedRow=row;
        int savedCol=col;

       while(row>=0 && col>=0){

           if(board[row][col]=="Q"){
               return false;
           }
           row--;
           col--;
       }

       row=savedRow;
       col=savedCol;

        while(col>=0){

            if(board[row][col]=="Q"){
                return false;
            }
            col--;
        }

        row=savedRow;
        col=savedCol;

        while(row<n && col>=0){

            if(board[row][col]=="Q"){
                return false;
            }
            col--;
            row++;
        }

        return true;
    }
}
