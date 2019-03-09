package basic;

/**
 * @author: Mr.liu
 * @pacckageName: basic
 * @Date: 2019/3/8 0008
 * @Time: 0:43
 * @description: java静态类的使用
 */
public class OutClassTest {
    public static void main(String args[]){
        //不需要实例化一个OutClass对象
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        //若是无static修饰，则需要创建
        OuterClass outerClass=new OuterClass();
      //  OuterClass.InnerClass inner = outerClass.new InnerClass();
    }
}
