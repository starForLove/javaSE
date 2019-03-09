package basic;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: Mr.liu
 * @pacckageName: basic
 * @Date: 2019/3/1 0001
 * @Time: 9:19
 */
public class Test {
    public static void main(String args[]) throws Exception {
        //1.使用new关键字创建对象
        Student s1 = new Student("tom");
        System.out.println(s1.toString());

        //2、通过java反射，静态方式
        Class stuClass = Class.forName("basic.Student");
        Constructor constructor = stuClass.getConstructor(String.class);
        Student s2 = (Student) constructor.newInstance("李四");
        System.out.println(s2);

        //3.通过clone方式,必须实现cloneable接口
        Student s3 = (Student) s1.clone();
        System.out.println(s3);

        //4、通过对象流，必须实现Serializable
        String path = Test.class.getClassLoader().getResource("").getPath();
        path= java.net.URLDecoder.decode(path, "utf-8");//由于是中文路径，需要对其转码
        System.out.println(path);
        String objectFilePath = path + "out.txt";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFilePath));
        objectOutputStream.writeObject(s2);

        ObjectInput objectInput = new ObjectInputStream(new FileInputStream(objectFilePath));
        Student s4 = (Student) objectInput.readObject();
        System.out.println(s4);
    }

}
