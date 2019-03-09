package basic;

import java.io.Serializable;

/**
 * @author: Mr.liu
 * @pacckageName: basic
 * @Date: 2019/3/1 0001
 * @Time: 9:16
 */
public class Student implements Cloneable,Serializable {
    private String name;

    public Student(){

    }

    public Student(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
        public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
