package cn.tanglaoer.demo;

import org.junit.Test;

import java.util.Calendar;

/**
 * switch 表达式
 * @author： tks
 * @date： 2023/3/18
 */
public class demo1 {
    public static void main(String[] args) {

    }

    /**
     * 之前的switch
     */
    @Test
    public void beforeVersion() {
        int day = Calendar.MONDAY;

        switch (day) {
            case Calendar.MONDAY:
            case Calendar.FRIDAY:
            case Calendar.SUNDAY:
                System.out.println(6);
                break;
            case Calendar.TUESDAY:
                System.out.println(7);
                break;
            case Calendar.THURSDAY:
            case Calendar.SATURDAY:
                System.out.println(8);
                break;
            case Calendar.WEDNESDAY:
                System.out.println(9);
                break;
        }
    }

    /**
     * jdk12版本
     */
    @Test
    public void test() {
        int arg = 0;
    }
}
