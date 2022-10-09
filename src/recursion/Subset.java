package recursion;

import java.util.ArrayList;

public class Subset {

    public static void main(String[] args) {

       SubSet("","abc");
        System.out.println(subSeqRet("","abc"));

    }

    static void SubSet(String p,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        SubSet(p+ch,up.substring(1));
        SubSet(p,up.substring(1));
    }

    static ArrayList<String> subSeqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}


