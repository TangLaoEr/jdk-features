package cn.tanglaoer.demo;

import java.io.*;

/**
 * Java.io.Reader:transferTo 从这个 Reader 中读取所有字符串，并按照所读取的顺序将字符串写入给指定的 Writer
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        var reader =
                new BufferedReader(new InputStreamReader(new FileInputStream("./11.txt"), "utf-8"));
        var p = new PrintWriter(new File("./12.txt"));
        reader.transferTo(p);
        p.flush();
        p.close();
        reader.close();
    }
}
