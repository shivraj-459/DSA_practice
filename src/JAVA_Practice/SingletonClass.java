package JAVA_Practice;

public class SingletonClass {

     long population;
    private static SingletonClass instance;

    private SingletonClass(long population){

        this.population=population;
    }

    public static SingletonClass getInstance() {

        if(instance==null){

            instance=new SingletonClass(10000000);
        }

        return instance;
    }

}


