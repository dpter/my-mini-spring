package vip.linshu.beans.factory.support;

import vip.linshu.beans.BeansException;
import vip.linshu.beans.factory.config.BeanDefinition;

/**
 * bean的实例化策略接口
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition) throws BeansException;

}
