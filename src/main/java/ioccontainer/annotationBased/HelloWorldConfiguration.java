package ioccontainer.annotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ioccontainer.xmlBased.HelloWordMessageProvider;
import ioccontainer.xmlBased.MessageRenderer;
import ioccontainer.xmlBased.StandardMessageRenderer;

/**
 * TODO 类描述
 *
 * @author yuyifan
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public ioccontainer.xmlBased.MessageProvider provider(){
        return new HelloWordMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(){
        MessageRenderer r=new StandardMessageRenderer();
        r.setMessageProvider(provider());
        return r;

    }

}
