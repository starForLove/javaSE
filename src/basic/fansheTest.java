package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author: Mr.liu
 * @pacckageName: basic
 * @Date: 2019/3/9 0009
 * @Time: 15:07
 */
public class fansheTest {
    public static void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //获取Class对象三种方式
        //1.类名.class
        //2.对象.class
        //3.Class.forName("")
        Class clazz=Class.forName("basic.Person");
        //使用newInstance()创建一个类的对象,调用无参构造器
        Person ob=(Person) clazz.newInstance();
        ob.speak();
        System.out.println(ob);

        //获得类的完整名字
        String classname=clazz.getName();

        //获得类的public属性
        Field [] fields=clazz.getFields();
        for(Field field:fields)
        {
            System.out.println(field.getName());
        }
        //获得类的所有属性
        Field [] fields1=clazz.getDeclaredFields();
        for(Field field1:fields1)
        {
            System.out.println(field1.getName());
        }

        //获得类的public类型的方法。这里包括 Object 类的一些方法
        Method [] methods = clazz.getMethods();
        for(Method method : methods){
            System.out.println(method.getName());//speak  equls toString hashCode notify等
        }

         //获得类的所有方法。
        Method [] allMethods = clazz.getDeclaredMethods();
        for(Method method : allMethods){
            System.out.println(method.getName());//speak eat 不包括object类的方法
        }

        //获得指定的属性
        Field f1 = clazz.getField("sex");
        System.out.println(f1);

        //获得指定的私有属性
        Field f2 = clazz.getDeclaredField("name");
        //启用和禁用访问安全检查的开关，值为 true，则表示反射的对象在使用时应该取消 java 语言的访问检查；反之不取消
        f2.setAccessible(true);
        System.out.println(f2.get(ob));//tom
        //给对象的属性赋值。通过反射机制破坏封装性
        f2.set(ob,"Bob");
        System.out.println(f2.get(ob));//Bob

        //获取构造方法
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor.toString());//public com.ys.reflex.Person() public basic.Person(int)
        }

    }
    public static void main(String args[]) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchFieldException {
        test1();
    }
}
