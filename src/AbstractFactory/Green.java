package AbstractFactory;

/**
 * Created by Shailesh Singh on 9/17/2017.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}