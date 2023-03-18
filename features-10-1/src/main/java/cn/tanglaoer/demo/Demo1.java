package cn.tanglaoer.demo;

/**
 * 局部变量类型推断
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo1 {
    public static void main(String[] args) {
        var str = "ABC";
        System.out.println(str);
        // String
        System.out.println(str.getClass().getSimpleName());
    }
}
