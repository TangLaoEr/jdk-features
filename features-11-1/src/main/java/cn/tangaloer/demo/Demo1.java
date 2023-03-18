package cn.tangaloer.demo;

import java.util.function.Consumer;

/**
 * 增强局部变量类型推断 var
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo1 {
    public static void main(String[] args) {
        Consumer<String> consumer1 = t -> System.out.println(t.toUpperCase());
        Consumer<String> consumer2 =
                (var t) -> System.out.println(t.toUpperCase());

        // 错误的形式：必须要有类型，可以加上var
        // Consumer<String> consumer3 =
        //         (@Deprecated t) ->System.out.println(t.toUpperCase());

        // 正确的形式
        Consumer<String> consumer4 =
                (@Deprecated var t) ->System.out.println(t.toUpperCase());

        consumer1.accept("hello");
    }
}
