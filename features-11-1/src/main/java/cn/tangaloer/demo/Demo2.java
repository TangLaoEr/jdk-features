package cn.tangaloer.demo;

/**
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo2 {
    public static void main(String[] args) {
        String str = "woshidage";
        boolean isblank = str.isBlank();  //判断字符串是空白
        boolean isempty = str.isEmpty();  //判断字符串是否为空
        String  result1 = str.strip();    //首位空白
        String  result2 = str.stripTrailing();  //去除尾部空白
        String  result3 = str.stripLeading();  //去除首部空白
        String  copyStr = str.repeat(2);  //复制几遍字符串
        long  lineCount = str.lines().count();  //行数统计

        System.out.println(isblank);
        System.out.println(isempty);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(copyStr);
        System.out.println(lineCount);
    }
}
