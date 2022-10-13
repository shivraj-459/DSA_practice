package SlidingWindow.fixedSize;

public class MaxSumOfSubArrayOfSizeK {

    public static void main(String[] args) {

        int[] arr={2,5,1,8,2,9,1};
        int k=3;

        int output=findMaxSum(arr,k);
        System.out.println(output);
    }

    static int findMaxSum(int[] arr,int k){

        int start=0;
        int end=0;
        int sum=0;
        int max=Integer.MIN_VALUE;

        while(end<arr.length){

            sum=sum + arr[end];

            if((end-start+1)< k){
                end++;
            }
            else if((end-start+1)==k){

                max=Math.max(max,sum);
                sum=sum-arr[start];
                start++;
                end++;
            }
        }
        return max;
    }
}
