/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency;

/**
 * @author yuyifan
 * @version $Id: SimpleMovieListerWithSetter.java, v 0.1 2023-01-08 2:56 下午 yuyifan Exp $$
 */
public class SimpleMovieListerWithSetter {

    /**
     * the SimpleMovieLister has a dependency on a MovieFinder
     *
     */
    private MovieFinder movieFinder;
    private int a;


    public void println() {
        System.out.println("SimpleMovieListerWithSetter#println");
        System.out.println(movieFinder);
        System.out.println(a);
    }

    /**
     * Getter method for property movieFinder.
     *
     * @return property value of movieFinder
     */
    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    /**
     * Setter method for property movieFinder.
     *
     * @param movieFinder value to be assigned to property movieFinder
     */
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    /**
     * Getter method for property a.
     *
     * @return property value of a
     */
    public int getA() {
        return a;
    }

    /**
     * Setter method for property a.
     *
     * @param a value to be assigned to property a
     */
    public void setA(int a) {
        this.a = a;
    }
}