package JAVA_Practice;

public class DemoSingleton {

    public static void main(String[] args) {

        SingletonClass obj1=SingletonClass.getInstance();
        System.out.println(obj1.population);

        SingletonClass obj2=SingletonClass.getInstance();
        System.out.println(obj2.population);

        SingletonClass obj3=SingletonClass.getInstance();
        System.out.println(obj3.population);



    }
}
