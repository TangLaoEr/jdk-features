package cn.tanglaoer.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * https://my.oschina.net/mdxlcj/blog/3009128
 * Java.io.ByteArrayOutputStream，重载 toString () 方法，通过使用指定的字符集编码字节，
 * 将缓冲区的内容转换为字符串，以前是默认没有参数，现在加了一个编码的字符方法。
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo3 {
    public static void main(String[] args) {
        String str = "我喜欢java";
        ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int c = 0;
        while ((c = bis.read()) != -1) {
            bos.write(c);
        }
        System.out.println(bos.toString());
        // jdk10
        System.out.println(bos.toString(StandardCharsets.UTF_8));
    }
}
