package cn.tanglaoer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * copyOf 方法
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo2 {
    public static void main(String[] args) {
        var list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        // 深拷贝
        List<Object> result = List.copyOf(list);
        System.out.println(list);
        System.out.println(result);
        list.add("four");
        System.out.println(list);
        System.out.println(result);
    }
}
