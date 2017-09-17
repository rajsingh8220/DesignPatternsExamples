package AbstractFactory;

/**
 * Created by Shailesh Singh on 9/17/2017.
 */
public abstract class AbstractFactory {
    //comment
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}