package recursion;

public class Digitsum {

    public static void main(String[] args) {

        int ans=sum(1);
        System.out.println(ans);

    }

    public static int sum(int N){
        if(N==0){
            return 0;
        }

        return (N%10)+sum(N/10);
    }
}
