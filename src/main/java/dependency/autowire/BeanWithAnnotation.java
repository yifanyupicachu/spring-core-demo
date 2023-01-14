/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency.autowire;

import org.springframework.stereotype.Service;

/**
 * @author yuyifan
 * @version $Id: BeanWithAnnotation.java, v 0.1 2023-01-08 6:10 下午 yuyifan Exp $$
 */
@Service
public class BeanWithAnnotation {

    private InjectedBeanWithAnnotation injectedBeanWithAnnotation;

    /**
     * Setter method for property injectedBeanWithAnnotation.
     *
     * @param injectedBeanWithAnnotation value to be assigned to property injectedBeanWithAnnotation
     */
    public void setInjectedBeanWithAnnotation(InjectedBeanWithAnnotation injectedBeanWithAnnotation) {
        this.injectedBeanWithAnnotation = injectedBeanWithAnnotation;
    }
}