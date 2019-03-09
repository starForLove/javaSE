package basic;

import org.jboss.arquillian.test.spi.annotation.TestScoped;

import java.io.InputStream;

/**
 * @author: Mr.liu
 * @pacckageName: basic
 * @Date: 2019/3/9 0009
 * @Time: 17:10
 * 测试类加载器
 * ClassLoader（类加载器）是用来把class加载到jvm中的，jvm中规范了两种类加载器，启动类加载器（bootstrap）和用户自定义加载器（user-defined classloader）.jvm在运行时会产生三个类加载器组成的初始化加载器曾其结构。
 * 自顶向下去尝试加载类：Bootstrap ClassLoader->Extension ClassLoader->System ClassLoader
 * 自底向上检查类是否加载：Bootstrap ClassLoader<-Extension ClassLoader<-System ClassLoader
 * 使用类加载器获取当前类目录下的文件
 */
public class ReflectionTest {
    public  void Test() throws ClassNotFoundException {
        //1.获取一个类的系统加载器（可以获取，这个类就是它加载的）
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //2.获取一个系统类加载器的父类加载器（扩展类加载器,可以获取）
        classLoader=classLoader.getParent();
        System.out.println(classLoader);

        //3.获取一个系统类加载器的父类加载器（引导类加载器,不可以获取）
        classLoader=classLoader.getParent();
        System.out.println(classLoader);

        //测试当前类由哪个类加载器加载(系统类加载器)
        classLoader=Class.forName("basic.ReflectionTest").getClassLoader();
        System.out.println(classLoader);

        //测试超类由哪个加载器加载(引导类，不可获取)
        classLoader=Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);



        //使用类加载器获取当前类目录下的文件

        InputStream in1=null;
        InputStream in2=null;
        //src下面可以直接加载
        in1=this.getClass().getClassLoader().getResourceAsStream("text1.txt");

        //不是src下的需要获取全路径
        in2=this.getClass().getResourceAsStream(("basic/test2.txt"));



    }
}
