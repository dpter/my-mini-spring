package vip.linshu.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private Map<String, Object> beanMap = new HashMap<>();

    public Object getBean(String name) {
        return beanMap.get(name);
    }

    public void registerBean(String name,Object bean) {
      beanMap.put(name, bean);
    }
}
