package AbstractFactory;

/**
 * Created by Shailesh Singh on 9/17/2017.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}