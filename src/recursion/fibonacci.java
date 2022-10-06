package recursion;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int N= input.nextInt();

        System.out.println(fibo(N));
    }

    static int fibo(int N){

        if(N==0) {
            return 0;
        }

        if(N==1){
            return 1;
        }

        return fibo(N-1) + fibo(N-2);
    }

}
