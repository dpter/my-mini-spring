package vip.linshu.beans.factory.support;

import vip.linshu.beans.BeansException;
import vip.linshu.beans.factory.BeanFactory;
import vip.linshu.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {

        // 先从单例对象中判断该bean是否已经实例化存在，存在直接返回
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        // 不存在，就通过BeanDefinitionRegistry创建一个
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);


    }


    public abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
