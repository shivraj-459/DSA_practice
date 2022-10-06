package BinarySearch;

public class InfiniteArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,5,6,7,9,10,13,15,18,20,24,26,29,32,37,43,48,49,55,61,66,69,72,78,82,90};

        int target=18;

        int output=ans(arr,target);

        System.out.println(output);

    }

    static int ans(int[] arr,int target){

        int start=0;
        int end=1;

        while(target>arr[end]){

            int temp=end+1;
            end = end + (end-start +1) * 2;
            start=temp;
        }

        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int[] arr,int target,int start,int end){

        int ans=-1;

         while(start<=end){

             int m= start + (end- start)/2;

             if(arr[m]==target){

                 ans=m;
                 break;
             }

             else if(arr[m]>target){
                 end=m-1;
             }

             else{

                 start=m+1;
             }

         }

         return  ans;


    }
}
