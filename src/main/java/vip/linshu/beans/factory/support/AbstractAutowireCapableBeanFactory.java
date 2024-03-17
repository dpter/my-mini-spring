package vip.linshu.beans.factory.support;

import vip.linshu.beans.BeansException;
import vip.linshu.beans.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        return doCreateBean(beanName, beanDefinition);
    }


    protected Object doCreateBean(String beanName, BeanDefinition beanDefinition){
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            bean = beanClass.newInstance();
        }catch (Exception e) {
            throw new BeansException("创建bean失败",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }





}
