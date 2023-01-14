/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于构造函数的依赖注入-demo
 * @author yuyifan
 * @version $Id: ConstructorBasedDemo.java, v 0.1 2023-01-08 2:12 下午 yuyifan Exp $$
 */
public class ConstructorBasedDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("/app-constructor-based-bean.xml");
        SimpleMovieLister simpleMovieLister = ctx.getBean("simpleMovieLister", SimpleMovieLister.class);
        SimpleMovieLister simpleMovieLister2 = ctx.getBean("simpleMovieLister2", SimpleMovieLister.class);
        simpleMovieLister.println();
        simpleMovieLister2.println();
    }


}