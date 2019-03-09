package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Mr.liu
 * @pacckageName: Collection
 * @Date: 2019/1/16 0016
 * @Time: 16:50
 */
public class IteratorDemo {
    public static void main(String args[]){
        List list =new ArrayList();
        list.add("tom");
        list.add("love");
        list.add("marry");
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            Object ob=it.next();
            System.out.println(ob);
            if(ob.equals("marry")){
                it.remove();
            }
        }
        System.out.print(list.size());
    }
}
