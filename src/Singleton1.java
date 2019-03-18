/**
 * @author: Mr.liu
 * @pacckageName: PACKAGE_NAME
 * @Date: 2019/3/18 0018
 * @Time: 22:56
 * 饱汉模式：需要时才创建对象
 */
public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1(){};

    public static Singleton1 getInstance(){
            if(singleton1==null){
                singleton1=new Singleton1();
            }
            return singleton1;
    }
}
