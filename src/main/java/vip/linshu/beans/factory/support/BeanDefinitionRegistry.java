package vip.linshu.beans.factory.support;

import vip.linshu.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
