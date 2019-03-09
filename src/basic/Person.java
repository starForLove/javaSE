package basic;

/**
 * @author: Mr.liu
 * @pacckageName: basic
 * @Date: 2019/3/9 0009
 * @Time: 15:58
 */
public class Person {
    private String name="tom";

    private int age;

    public String sex="男";

    public Person(){}

    public Person(int age){
        this.age=age;
    }

    public void speak(){
        System.out.println("你好！");
    }

    private void eat(){
        System.out.println("好吃");
    }

}
