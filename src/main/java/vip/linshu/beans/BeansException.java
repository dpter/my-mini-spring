package vip.linshu.beans;

/**
 * 自定义的bean异常附带构造方法
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }


}
