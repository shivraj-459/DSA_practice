package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

    public static int distance(int[] arr,int n,int m){

        Arrays.sort(arr);

        int start=0;
        int end= Arrays.stream(arr).reduce(Integer.MIN_VALUE,(num1,num2)->Math.max(num1,num2));

        int ans=-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(isPossible(arr,n,m,mid)){

                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr,int n,int m,int mid){

        int cowCount=1;
        int lastPos=arr[0];

        for(int i=0;i<n;i++){

            if(arr[i]-lastPos>=mid){
                cowCount++;
                if(cowCount==m){
                    return true;
                }
                lastPos=arr[i];
            }
        }
          return false;
    }

    public static void main(String[] args) {

        int[] stalls={4,2,1,3,6};
        int cows=2;
        int n=stalls.length;

        System.out.println(distance(stalls,n,cows));

    }
}
