package Stacks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaxAreaRectangleBinaryMatrix {


    public static List<Integer> nearestSmallerLeft(List<Integer> arr,int size){

        Stack<Integer> valueStack=new Stack<>();
        Stack<Integer> indexStack=new Stack<>();

        List<Integer> left=new ArrayList<>();

        for(int i=0;i<size;i++){

            while(!valueStack.isEmpty() && valueStack.peek()>=arr.get(i)){

                valueStack.pop();
                indexStack.pop();
            }

            if(valueStack.isEmpty()){

                left.add(-1);
            }

            if(!valueStack.isEmpty() && valueStack.peek()<arr.get(i)){

                left.add(indexStack.peek());
            }

            valueStack.push(arr.get(i));
            indexStack.push(i);
        }

         return left;
    }


    public static List<Integer> nearestSmallerRight(List<Integer> arr,int size){

        Stack<Integer> valueStack=new Stack<>();
        Stack<Integer> indexStack=new Stack<>();

        List<Integer> right=new ArrayList<>();

        for(int i=size-1;i>=0;i--){

            while(!valueStack.isEmpty() && valueStack.peek()>=arr.get(i)){

                valueStack.pop();
                indexStack.pop();
            }

            if(valueStack.isEmpty()){

                right.add(size);
            }

            if(!valueStack.isEmpty() && valueStack.peek()<arr.get(i)){

                right.add(indexStack.peek());
            }

            valueStack.push(arr.get(i));
            indexStack.push(i);
        }

        Collections.reverse(right);

        return right;

    }

    public static int MAH(List<Integer> arr,int size){

        List<Integer> left=nearestSmallerLeft(arr,size);
        List<Integer> right=nearestSmallerRight(arr,size);


        int maxArea=(right.get(0) - left.get(0) - 1) * arr.get(0);

        for(int i=1;i<size;i++){

            if(arr.get(i) * (right.get(i) - left.get(i) - 1)>maxArea){

                maxArea=(right.get(i) - left.get(i) - 1) * arr.get(i);
            }
        }

        return maxArea;
    }
    public static int findMaxArea(int[][] matrix,int row,int col){


        List<Integer> list=new ArrayList<>();

        for(int i=0;i<col;i++){

            list.add(matrix[0][i]);
        }

       int max=MAH(list,list.size());

        for(int i=1;i<row;i++){

            for(int j=0;j<col;j++){

                if(matrix[i][j]==0){

                    list.set(j,0);
                }

                else{

                    list.set(j,list.get(j) + matrix[i][j]);
                }
            }

            max=Math.max(max,MAH(list,list.size()));
        }

        return max;
    }


    public static void main(String[] args) {

        int[][] matrix={
                {0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}
        };

       int row=matrix.length;
       int col=matrix[0].length;

        int output=findMaxArea(matrix,row,col);
        System.out.println(output);


    }

}
