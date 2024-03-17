package vip.linshu.beans.factory.config;

/**
 * 单例bean注册的接口
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例bean
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

}
