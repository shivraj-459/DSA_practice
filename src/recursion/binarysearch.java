package recursion;


public class binarysearch {

    public static void main(String[] args) {

        int[] arr = {2,3,6,8,9,1,2,3,4};

        int target=3;
        System.out.println(binary(arr,target,0,arr.length-1));

    }

    static int binary(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }

        int m= s+(e-s) /2;

        if(arr[m]==target){
            return m;
        }

        if( arr[s] <= arr[m]){  //first half is sorted or not

            if(target>=arr[s] && target<=arr[m]){
                return binary(arr,target,s,m-1);
            }
            else{
                return binary(arr,target,m+1,e);
            }
        }

        if(target>=arr[m] && target<=arr[e]){

          return binary(arr,target,m+1,e);
        }

        return binary(arr,target,s,m-1);

    }
}