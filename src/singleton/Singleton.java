package singleton;

public class Singleton {

    //singleton is object hiding
    //make object private
    private Singleton(){

    }

    //setter
    private static Singleton singleton = new Singleton();

    //getter
    public static Singleton getInstance(){
        return singleton;
    }

    //class singleton attribute
    public void doWork(){
        System.out.println("do your job");
    }
}
