package BinarySearch;

public class FirstAndLastPosition {

    public static void main(String[] args) {

        int[] arr={};
        int target=1;

        int firstOutput=firstPosition(arr,target);
        int lastOutput=lastPosition(arr,target);

        System.out.println(firstOutput+" "+lastOutput);
    }

    static int firstPosition(int[] arr,int target){

        if(arr.length==0){
            return -1;
        }

        if(arr[0]>target || arr[arr.length-1]<target){

            return -1;
        }

        int ans=-1;
        int s=0;
        int e=arr.length-1;

        while(s<=e){

            int m=s+ (e-s)/2;

            if(arr[m]>=target){

                ans=m;
                e=m-1;

            } else{

                s=m+1;
            }
        }

        return ans;
    }


    static int lastPosition(int[] arr,int target){

        if(arr.length==0){
            return -1;
        }

        if(arr[0]>target || arr[arr.length-1]<target){

            return -1;
        }

        int ans=-1;
        int s=0;
        int e=arr.length-1;

        while(s<=e){

            int m=s+ (e-s)/2;

            if(arr[m]<=target){

                ans=m;
                s=m+1;

            } else{

               e=m-1;
            }
        }

        return ans;
    }
}
