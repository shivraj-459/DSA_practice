package JAVA_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcard_Generics {

    public static void drawShapes(List<? extends shape> list){//upper bounded wildcards

        for(shape s:list){

            s.draw();
        }

    }


    public static void print(List<? super Integer> list){ // lower bounded wildcards


        for(Object i:list){

            System.out.println(i);

        }

    }

    public static void main(String[] args) {

        List<rectangle> list1=new ArrayList<>();

        list1.add(new rectangle());
        list1.add(new rectangle());


        List<circle> list2=new ArrayList<>();
        list2.add(new circle());

        drawShapes(list1);
        drawShapes(list2);


        List<Integer> list3= Arrays.asList(1,2,3,4);

        print(list3);

        List<Number> l2=Arrays.asList(1.0,2.0,3.0,4.0);

        print(l2);

    }

}


 abstract class shape{

   abstract void draw();
}


class rectangle extends shape{


    @Override
    public void draw() {
        System.out.println("drawn rectangle");
    }
}


class circle extends shape{


    @Override
    public void draw() {
        System.out.println("drawn circle");
    }
}
