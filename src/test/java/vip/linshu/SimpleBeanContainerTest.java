package vip.linshu;

import org.junit.Test;
import vip.linshu.beans.factory.BeanFactory;


import static org.assertj.core.api.Assertions.assertThat;

public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        // 断言拿到的值不为空
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
        helloService.sayHello();
    }


    class HelloService {
        public String sayHello() {
            System.out.println("hello BeanFactory");
            return "hello";
        }

    }

}
