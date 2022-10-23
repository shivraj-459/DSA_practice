package BinarySearch;

public class CeilingOfNumber {  // flooring is also same like this the only change is to find the greatest number less than or equal to target

    public static void main(String[] args) {

        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target=25;

        int output=findCeiling(arr,target);

        System.out.println(output);


    }

   static int findCeiling(int[] arr,int target){

        int ans=-1;

        int s=0;
        int e=arr.length-1;

        while(s<=e){

            int m= s + (e-s)/2;

            if(arr[m]>=target){
                ans=arr[m];
                e=m-1;
            }

            else if(arr[m]<target){

                s=m+1;
            }

        }

        return ans;

   }
}
