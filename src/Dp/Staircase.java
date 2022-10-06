package Dp;

public class Staircase {


   static int[] dp;

    public static int minCost(int index,int[] arr,int N){

        if(index>=N){

            return 0;
        }

        if(dp[index]!=-1){

            return dp[index];
        }

        int jump1=minCost(index+1,arr,N);
        int jump2=minCost(index+2,arr,N);

        int res=arr[index] + Math.min(jump1,jump2);

        dp[index]=res;

        return dp[index];


    }

    public static void main(String[] args) {

        int[] arr={10,15,20};

         int N=arr.length;

          dp=new int[N];

         for(int i=0;i<dp.length;i++){

             dp[i]=-1;
         }

         int start1=minCost(0,arr,N);
         int start2=minCost(1,arr,N);

         int min=Math.min(start1,start2);

         System.out.println(min);

    }
}
