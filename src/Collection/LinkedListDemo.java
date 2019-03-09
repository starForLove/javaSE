package Collection;

import java.util.LinkedList;

/**
 * @author: Mr.liu
 * @pacckageName: Collection
 * @Date: 2019/1/19 0019
 * @Time: 15:45
 */
public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList queue =new LinkedList();
        queue.addFirst("tom");
        queue.addFirst("marry");
        queue.addFirst("jack");
        queue.addFirst("sam");
        System.out.println(queue);
        queue.removeLast();
        queue.removeLast();
        System.out.println(queue);
    }
}
