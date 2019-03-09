package Collection;

import java.util.HashMap;

/**
 * @author: Mr.liu
 * @pacckageName: Collection
 * @Date: 2019/3/8 0008
 * @Time: 0:26
 */
public class HashCodeOverideOrNot {
    private static class Person{
        int idCard;
        String name;
        public Person(int idCard,String name){
            this.idCard=idCard;
            this.name=name;
        }
        @Override
        public boolean equals(Object o){
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()){
                return false;
            }
            Person person = (Person) o;
            //两个对象是否等值，通过idCard来确定
            return this.idCard == person.idCard;
        }
        }

        public static  void main(String args[])
        {
            HashMap<Person,String> map = new HashMap<Person, String>();
            Person person = new Person(1234,"乔峰");
            //put到hashmap中去
            map.put(person,"天龙八部");
            //get取出，从逻辑上讲应该能输出“天龙八部”
            System.out.println("结果:"+map.get(new Person(1234,"萧峰")));
        }
    }


