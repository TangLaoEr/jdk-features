package cn.tanglaoer.demo.jdk11comparison;

import java.util.function.Consumer;

/**
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo1 {
    public static void main(String[] args) {
        // 正常
        Consumer<String> consumer = t -> System.out.println(t.toUpperCase());

    }
}
