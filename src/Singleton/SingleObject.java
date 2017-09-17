package Singleton;

/**
 * Created by Shailesh Singh on 9/17/2017.
 */
public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();
    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}