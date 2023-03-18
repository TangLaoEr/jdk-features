package cn.tanglaoer.demo;

import org.junit.Test;

/**
 *
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo1 {

    public static void main(String[] args) {
        String i = """
                    <html>
                        <body>我是帅哥</body>
                    </html>
                """;
        System.out.println(i);
    }

    public void test(Object o) {
        switch (o) {
            case null -> System.out.println("hhhh");
            case String s -> System.out.println("String");
            default -> throw new IllegalStateException("Unexpected value: " + o);
        }

        int b = 0;
        String c = switch (b) {
            case 1 -> "hello";
            default -> "ddd";
        };
    }
}
