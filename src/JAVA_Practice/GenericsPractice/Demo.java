package JAVA_Practice.GenericsPractice;

public class Demo {
    public static void main(String[] args) {


        MyGeneric<Integer> obj=new MyGeneric<>();

        obj.add(23);
        System.out.println(obj.get());

    }
}
