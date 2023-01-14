/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuyifan
 * @version $Id: AnnotationAutowireWithSetterDemoApplication.java, v 0.1 2023-01-08 6:10 下午 yuyifan Exp $$
 */
public class AutowireWithMixedDemoApplication {

    public static void main(String[] args) {
        //指定要扫描的package
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-autowire-bean.xml");
        BeanWithAnnotation beanWithAnnotation = ctx.getBean("beanWithAnnotation", BeanWithAnnotation.class);
        System.out.println(beanWithAnnotation);
    }

}