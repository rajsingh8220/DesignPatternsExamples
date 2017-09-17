package AbstractFactory;

/**
 * Created by Shailesh Singh on 9/17/2017.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}