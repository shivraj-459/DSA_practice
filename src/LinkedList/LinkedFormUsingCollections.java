package LinkedList;

import java.util.LinkedList;

public class LinkedFormUsingCollections {

    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<>();

        list.addFirst("shivraj");
        list.addLast("punjare");



        list.add(1,"krishna");


        System.out.println(list);
    }
}
