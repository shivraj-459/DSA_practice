package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {

        String str="aabb";
        List<String> p=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();

        findPartitioning(0,str,p,ans);
        System.out.println(ans);

    }

    public static void findPartitioning(int index,String str,List<String> p,List<List<String>> ans){

        if(index==str.length()){

            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=index;i<str.length();i++){

            if(isPalindrome(str,index,i)){

                p.add(str.substring(index,i+1));
                findPartitioning(i+1,str,p,ans);
                p.remove(p.size()-1);
            }

        }

    }

    public static boolean isPalindrome(String str,int left,int right){

        while(left<=right){

            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
