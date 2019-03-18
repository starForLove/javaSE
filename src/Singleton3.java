/**
 * @author: Mr.liu
 * @pacckageName: PACKAGE_NAME
 * @Date: 2019/3/18 0018
 * @Time: 23:03
 * 饿汉模式：类加载时就被创建了,它是线程安全的，因为实例对象在类加载的时候就被创建的
 */
public class Singleton3 {
    private static Singleton3 singleton3=new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return  singleton3;
    }
}
