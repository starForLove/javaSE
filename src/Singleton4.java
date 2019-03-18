/**
 * @author: Mr.liu
 * @pacckageName: Collection
 * @Date: 2019/3/18 0018
 * @Time: 23:15
 * 双重校验模式：是对线程安全饱汉模式的优化，当已经创建过实例对象后就无需加锁，提高效率。也是一种推荐使用的方式。
 */
public class Singleton4 {
    private static Singleton4 singleton4;

    private  Singleton4(){}

    public static Singleton4 getInstance(){
        if(singleton4==null){
            synchronized (Singleton4.class){
                if(singleton4==null){
                    singleton4 =new Singleton4();
                }
            }

        }
        return singleton4;
    }
}
