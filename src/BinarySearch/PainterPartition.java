package BinarySearch;

import java.util.Arrays;

public class PainterPartition {

    public static int paint(int[] arr,int n,int m){

        int start=0;
        int end= Arrays.stream(arr).reduce(0,(n1,n2)->n1+n2);
        int ans=-1;
        while(start<=end){

            int mid=start+(end-start)/2;

            if(isPossible(arr,n,m,mid)){

                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr,int n,int m,int mid){

        int painterCount=1;
        int boardSum=0;

        for(int i=0;i<n;i++){

            if(boardSum+arr[i]<=mid){
                boardSum+=arr[i];
            }
            else{
                painterCount++;
                if(painterCount>m || arr[i]>mid){
                    return false;
                }
                boardSum=arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {


        int[] boards={5,5,5,5};//1 unit of board=1 unit of time;

        int painters=2;
        int n=boards.length;

        System.out.println("minimum time required to paint all boards for "+painters+" painters is "+paint(boards,n,painters));
    }
}
