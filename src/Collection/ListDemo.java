package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Mr.liu
 * @pacckageName: Collection
 * @Date: 2019/1/16 0016
 * @Time: 17:02
 * @description: 有序，可以重复的集合。底层数据结构是数组，查询快，增删慢;线程不安全，效率高
 * 使用迭代器来遍历set
 */
public class ListDemo {
    public static void main(String args[]){

        //产生一个 List 集合，典型实现为 ArrayList
        List list = new ArrayList();

        //添加三个元素
        list.add("Tom");
        list.add("Bob");
        list.add("Marry");
        System.out.println(list);
        //构造 List 的迭代器
        Iterator it = list.iterator();
        //通过迭代器遍历元素
        while(it.hasNext()){
            Object obj = it.next();
            //System.out.println(obj);
        }

        //在指定地方添加元素
        list.add(2, 0);

        //在指定地方替换元素
        list.set(2, 1);

        //获得指定对象的索引
        int i=list.indexOf(1);
        System.out.println("索引为："+i);

        //遍历：普通for循环
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
    }

}
