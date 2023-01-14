/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependency.SimpleMovieListerWithSetter;

/**
 * @author yuyifan
 * @version $Id: AutowireWithXmlDemoApplication.java, v 0.1 2023-01-08 10:07 下午 yuyifan Exp $$
 */
public class AutowireWithXmlDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("/app-autowire-xml-bean.xml");
        SimpleMovieListerWithSetter simpleMovieLister = ctx.getBean("simpleMovieListerWithSetter", SimpleMovieListerWithSetter.class);
        simpleMovieLister.println();
    }
}