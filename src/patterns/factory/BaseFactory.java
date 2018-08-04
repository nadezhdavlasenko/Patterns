package patterns.factory;


import patterns.Triangle;

/**
 * Created by Julia on 03.08.2018
 */
public abstract class BaseFactory {

    public abstract Circle getCircle();

    public abstract Triangle getTriangle();
}
