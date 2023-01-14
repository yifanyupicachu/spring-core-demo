/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yuyifan
 * @version $Id: AnnotationSetterBasedDemoApplication.java, v 0.1 2023-01-08 3:23 下午 yuyifan Exp $$
 */
public class AnnotationSetterBasedDemoApplication {

    public static void main(String[] args) {
        //指定要扫描的package
        ApplicationContext ctx = new AnnotationConfigApplicationContext("dependency");
        SimpleMovieListerWithSetterAnnotation simpleMovieLister = ctx.getBean("simpleMovieListerWithSetterAnnotation", SimpleMovieListerWithSetterAnnotation.class);
        simpleMovieLister.println();
    }
}