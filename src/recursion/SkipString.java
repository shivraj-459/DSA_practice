package recursion;

import java.util.List;

public class SkipString {

    public static void main(String[] args) {

        System.out.println(skip("","baccdagh"));
//        System.out.println(skipApple("ghaapplehij"));
//
//        System.out.println(SkipAppNotApple("applappleghji"));

      //abc("abc",0,2,"");

    }


    //-------------------------------------------------------------------------------------------------------
   static String skip(String p,String up){

        if(up.isEmpty()){

//            System.out.println(p);
            return p;
        }

        char ch=up.charAt(0);

        if(ch=='a'){
           return skip(p,up.substring(1));
        }else{
            return skip(p+ch,up.substring(1));
        }
   }




   //-----------------------------------------------------------------------------------------
   static String skipApple(String up){
        if(up.isEmpty()){

            return "";
        }

        if(up.startsWith("apple")){
           return skipApple(up.substring(5));
        }else{
           return up.charAt(0) + skipApple(up.substring(1));
        }

   }


   //--------------------------------------------------------------------------------------------
   static String SkipAppNotApple(String up){

        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return SkipAppNotApple(up.substring(3));
        }

        else{
            return up.charAt(0)+SkipAppNotApple(up.substring(1));
        }
   }



   //-------------------------------------------------------------------------------------------------
   static void abc(String str,int s, int e,String bag){

        if(s>e || e<0){
            System.out.println(bag);

            return;
        }


        double m=(s+e)/2;

        int k= (int) Math.floor(m);

      bag+=(str.substring(k,k+1));

        abc(str,s,k-1,bag);
        abc(str,k+1,e,bag);
   }

    private static String getStr(String str) {
        return str;
    }
}
