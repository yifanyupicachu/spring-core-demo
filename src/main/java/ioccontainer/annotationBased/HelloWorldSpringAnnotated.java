package ioccontainer.annotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ioccontainer.xmlBased.MessageRenderer;


/**
 * 基于注解的SPRING容器-demo
 *
 * @author yuyifan
 */
public class HelloWorldSpringAnnotated {

    public static void main(String args[]) {
        //初始化ApplicationContext
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class);
        //getBean
        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.renderer();
    }
}
