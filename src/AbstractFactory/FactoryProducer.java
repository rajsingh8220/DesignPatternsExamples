package AbstractFactory;

/**
 * Created by Shailesh Singh on 9/17/2017.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}