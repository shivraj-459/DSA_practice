package Dp;

public class RobHouse {

   static int[] dp;

   public static int robHouse(int[] arr,int index,int N){

       if(index>=N){


           return 0;
       }

       if(dp[index]!=-1){

           return dp[index];
       }

       int rob=robHouse(arr, index + 2, N) + arr[index];
       int notRob=robHouse(arr, index + 1, N);

       int res=Math.max(rob,notRob);

       dp[index]=res;

       return dp[index];

   }

    public static void main(String[] args) {

        int[] arr={2,9,9,13,1};

        int N=arr.length;

        dp=new int[N+1];

        for(int i=0;i<dp.length;i++){

            dp[i]=-1;
        }

       int output= robHouse(arr,0,N);

        //System.out.println(Arrays.toString(dp));
        System.out.println(output);

    }
}
