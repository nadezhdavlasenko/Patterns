package patterns.factory;

import patterns.shapes.Color;

public class AbstractFactory {

    public static BaseFactory getFactory(Color color){
        if(color.equals(Color.WHITE)){
            return new WhiteFactory();
        }else if(color.equals(Color.BLACK)){
            return new BlackFactory();
        }
        return null;
    }
}