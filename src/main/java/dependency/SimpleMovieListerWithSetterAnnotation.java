/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuyifan
 * @version $Id: SimpleMovieListerWithSetterAnnotation.java, v 0.1 2023-01-08 3:15 下午 yuyifan Exp $$
 */
@Service
public class SimpleMovieListerWithSetterAnnotation {

    /**
     * the SimpleMovieLister has a dependency on a MovieFinder
     * @Autowired表示需要注入
     */
    @Autowired
    private MovieFinderWithAnnotation movieFinderWithAnnotation;
    private int a;


    public void println() {
        System.out.println("SimpleMovieListerWithSetter#println");
        System.out.println(movieFinderWithAnnotation);
        System.out.println(a);
    }

    /**
     * Getter method for property movieFinder.
     *
     * @return property value of movieFinder
     */
    public MovieFinderWithAnnotation getMovieFinder() {
        return movieFinderWithAnnotation;
    }

    // /**
    //  * Setter method for property movieFinder.
    //  *
    //  * @param movieFinder value to be assigned to property movieFinder
    //  */
    // public void setMovieFinder(MovieFinderWithAnnotation movieFinder) {
    //     this.movieFinderWithAnnotation = movieFinder;
    // }

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