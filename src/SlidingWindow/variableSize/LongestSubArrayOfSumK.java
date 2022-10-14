package SlidingWindow.variableSize;

public class LongestSubArrayOfSumK {

    public static void main(String[] args) {
        int[] arr={4,1,1,1,2,3,5};
        int target=8;

        int output=longestLength(arr,target);
        System.out.println(output);

    }

    static int longestLength(int[] arr,int target){

        int s=0;
        int e=0;
        int size= arr.length;
        int max=0;
        long sum=0;

        while(e<size){

            sum+=arr[e];

            if(sum==target){
                max=Math.max(max,(e-s+1));
            }
           else if(sum>target){
                while(sum>target) {
                    sum = sum - arr[s];
                    s++;
                }
            }
             e++;
        }
        return max;
    }
}
