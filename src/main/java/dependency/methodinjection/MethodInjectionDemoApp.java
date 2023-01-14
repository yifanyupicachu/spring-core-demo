/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency.methodinjection;

import java.util.LinkedHashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuyifan
 * @version $Id: MethodInjectionDemoApp.java, v 0.1 2023-01-08 10:53 下午 yuyifan Exp $$
 */
public class MethodInjectionDemoApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-method-injection-bean.xml");
        CommandManagerWithMethodInjection commandManager = ctx.getBean("commandManager", CommandManagerWithMethodInjection.class);
        commandManager.process(new LinkedHashMap());
    }
}