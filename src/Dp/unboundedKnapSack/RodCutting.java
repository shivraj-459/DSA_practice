package Dp.unboundedKnapSack;

public class RodCutting {

    static int[][] dp;


   public static int rodCutting(int[] price,int[] size,int R,int N){

       if(R==0 || N==0){

           dp[N][R]=0;
           return 0;
       }

       if(dp[N][R]!=-1){

           return dp[N][R];
       }

       if(size[N-1]>R){

           dp[N][R]=rodCutting(price,size,R,N-1);
       }

       else{

           int include=rodCutting(price, size, R-size[N-1], N) + price[N-1];

           int exclude= rodCutting(price, size, R, N-1);

           dp[N][R]=Math.max(include,exclude);
       }

       return dp[N][R];
   }

    public static void main(String[] args) {

        int[] price={1,5,8,9,10,17,17,20};

        int N=price.length;

        int[] size=new int[N];

        for(int i=0;i<N;i++){

            size[i]=i+1;
        }

        int R=8;

        dp=new int[N+1][R+1];

        for(int i=0;i<dp.length;i++){

            for(int j=0;j<dp[0].length;j++){

                dp[i][j]=-1;
            }
        }

        int output=rodCutting(price,size,R,N);

//        for(int i=0;i<dp.length;i++){
//
//            System.out.println(Arrays.toString(dp[i]));
//        }

        System.out.println("maximum profit after cutting is : "+output);


    }
}
