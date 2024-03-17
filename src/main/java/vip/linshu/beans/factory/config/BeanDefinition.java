package vip.linshu.beans.factory.config;

/**
 * BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、是否为单例等，此处简化只包含class类型
 */
public class BeanDefinition {

    private Class beanClass;


    /**
     * 初始化的时候传一个实例化对象
     * @param beanClass
     */
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    /**
     * 直接获取class类型
     * @return
     */
    public Class getBeanClass() {
        return beanClass;
    }


    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
