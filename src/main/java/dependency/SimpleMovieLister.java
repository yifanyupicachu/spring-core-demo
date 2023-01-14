/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency;

import java.beans.ConstructorProperties;

/**
 * @author yuyifan
 * @version $Id: SimpleMovieLister.java, v 0.1 2023-01-08 2:13 下午 yuyifan Exp $$
 */
public class SimpleMovieLister {

    // the SimpleMovieLister has a dependency on a MovieFinder
    private final MovieFinder movieFinder;
    private int a;

    // a constructor so that the Spring container can inject a MovieFinder
    public SimpleMovieLister(MovieFinder movieFinder, int a) {
        this.movieFinder = movieFinder;
        this.a = a;
    }

    //定义属性的别名
    @ConstructorProperties({"movieFinder"})
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void println() {
        System.out.println("SimpleMovieLister#println");
        System.out.println(movieFinder);
        System.out.println(a);
    }

}