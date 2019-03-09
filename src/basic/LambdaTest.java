package basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: Mr.liu
 * @pacckageName: basic
 * @Date: 2019/3/9 0009
 * @Time: 14:09
 * @Descriptiion: jdk1.8新特性Lambda表达式的使用.
 * lambda表达式就和方法一样,它提供了一个正常的参数列表和一个使用这些参数的主体(body,可以是一个表达式或一个代码块)。
 * Lambda表达式还增强了集合库。(集合的for循环，内部匿名类)
 * 基本语法：基本语法:
 * (parameters) -> expression
 * 或
 * (parameters) ->{ statements; }
 */
public class LambdaTest {


    public static void main(String args[])
    {
        test2();
    }
    //使用lambda遍历for
    static void test1(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }

        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));

        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);
    }

    //实现排序
    static void test2(){
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        //1.1：使用内部匿名类根据名字排序
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //1.2：使用lambda 表达式进行排序
        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));
        Comparator<String> sortName=(String s1,String s2)->(s1.compareTo(s2));

        //1.3也可以写作这种方式
        Arrays.sort(players,sortName);

    }


}
