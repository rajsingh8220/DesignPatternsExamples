package Factory;

/**
 * Created by Shailesh Singh on 9/17/2017.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}