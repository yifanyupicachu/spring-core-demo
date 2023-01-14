/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dependency.SimpleMovieListerWithSetterAnnotation;

/**
 * @author yuyifan
 * @version $Id: AutowireWithAnnotationDemoApplication.java, v 0.1 2023-01-08 10:03 下午 yuyifan Exp $$
 */
public class AutowireWithAnnotationDemoApplication {

    public static void main(String[] args) {
        //指定要扫描的package
        ApplicationContext ctx = new AnnotationConfigApplicationContext("dependency");
        SimpleMovieListerWithSetterAnnotation simpleMovieLister = ctx.getBean("simpleMovieListerWithSetterAnnotation", SimpleMovieListerWithSetterAnnotation.class);
        simpleMovieLister.println();
    }

}