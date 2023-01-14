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
 * @version $Id: MethodInjectionDemoApplication.java, v 0.1 2023-01-08 10:37 下午 yuyifan Exp $$
 */
public class ApplicationAwareDemoApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-method-application-aware.xml");
        CommandManager commandManager = ctx.getBean("commandManager", CommandManager.class);
        commandManager.process(new LinkedHashMap());
    }

}