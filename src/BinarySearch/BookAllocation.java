package BinarySearch;

import java.util.Arrays;

public class BookAllocation {

    public static int allocate(int[] arr,int n,int m){

        int start=0;
        int end= Arrays.stream(arr).reduce(0,(num1,num2)->num1+num2);

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

        int studentCount=1;
        int pageSum=0;

        for(int i=0;i<n;i++){

            if(pageSum + arr[i]<=mid){
                pageSum+=arr[i];
            }
            else{
                studentCount++;
                if(studentCount>m || arr[i]>mid){
                    return false;
                }
                pageSum=arr[i];
            }
        }
           return true;
    }

    public static void main(String[] args) {

        int[] books={10,20,30,40};

        int m=2;
        int n=books.length;

        int output= allocate(books,n,m);
        System.out.println(output);
    }
}
