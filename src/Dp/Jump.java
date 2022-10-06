package Dp;

public class Jump {

   static boolean[] dp;

   public static boolean solve(int index,int[] arr){

       if(index==arr.length-1){
           return true;
       }

       int reachableIndex= index + arr[index];

       if(dp[index]!=false){
           return dp[index];
       }

       for(int i=index+1;i<=reachableIndex;i++){

           if(solve(i,arr)){

               dp[i]=true;
               return dp[i];
           }

       }

       return dp[index];

   }

    public static void main(String[] args) {

        int[] arr={3,2,1,1,4};

        int N=arr.length;

        dp=new boolean[N];

        for(int i=0;i<N;i++){

            dp[i]=false;
        }

        boolean output=solve(0,arr);
        System.out.println(output);


    }
}
