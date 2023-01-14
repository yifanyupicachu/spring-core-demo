/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuyifan
 * @version $Id: SetterBaseDemoApplication.java, v 0.1 2023-01-08 3:02 下午 yuyifan Exp $$
 */
public class XmlSetterBaseDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("/app-setter-based-bean.xml");
        SimpleMovieListerWithSetter simpleMovieLister = ctx.getBean("simpleMovieListerWithSetter", SimpleMovieListerWithSetter.class);
        simpleMovieLister.println();
    }
}