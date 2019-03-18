/**
 * @author: Mr.liu
 * @pacckageName: PACKAGE_NAME
 * @Date: 2019/3/18 0018
 * @Time: 23:00
 * 饱汉模式：线程安全
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2(){}

    public  static synchronized Singleton2 getInstance(){
        if(singleton2==null){
            singleton2=new Singleton2();
        }
        return singleton2;
    }
}
