package cn.tanglaoer.demo;

import java.util.ArrayList;

/**
 * ArrayList 重写了Object的toString方法
 * @author： tks
 * @date： 2023/3/18
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        System.out.println(integers.toString());
    }
}
