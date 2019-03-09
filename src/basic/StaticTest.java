package basic;

/**
 * @author: Mr.liu
 * @pacckageName: basic
 * @Date: 2019/3/9 0009
 * @Time: 18:07
 * 静态变量，静态代码块先于 System.out.println(“0000”)执行，静态的东西只执行一
 * 次，相当于全局变量
 * 父类静态代码块>子类静态代码块>非静态父类代码块>父类构造方法>非静态子类代码块>字类构造方法
 * */
class A {
    public A(){
        System.out.print("A gouzhao");
    }
    private static A a=new A();
    static{
        System.out.print("static");
    }
    {
        System.out.print("A1");
    }
}
