package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: Mr.liu
 * @pacckageName: Collection
 * @Date: 2019/1/16 0016
 * @Time: 17:03
 */
public class CollectionDemo {
    public static void main(String args[]){
        Collection collection=new ArrayList();
        //添加指定元素
        collection.add("tom");
        collection.add("loves");
        collection.add("marry");

        //删除指定元素
        collection.remove("tom");

        //删除所有元素
        Collection c=new ArrayList();
        c.add("marry");
        collection.removeAll(c);

        //检查是否存在某个元素
        collection.contains("tom");

        //判断是否为空
        collection.isEmpty();

        //利用增强for循环
        for(Object col:collection){
            System.out.println(col);
        }

        //利用迭代器循环
        Iterator it=collection.iterator();
        while (it.hasNext())
        {
            Object ob=it.next();
            System.out.println(ob);
        }
        //


    }
}
