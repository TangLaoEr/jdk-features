package cn.tangaloer.demo;

/**
 * 移除项
 *
 * 1、移除了com.sun.awt.AWTUtilities
 *
 * 2、移除了sun.misc.Unsafe.defineClass，使用java.lang.invoke.MethodHandles.Lookup.defineClass来替代
 *
 * 3、移除了Thread.destroy()以及 Thread.stop(Throwable)方法
 *
 * 4、移除了sun.nio.ch.disableSystemWideOverlappingFileLockCheck、sun.locale.formatasdefault属性
 *
 * 5、移除了jdk.snmp模块
 *
 * 6、移除了javafx，openjdk估计是从java10版本就移除了，oracle jdk10还尚未移除javafx，而java11版本则oracle的jdk版本也移除了javafx
 *
 * 7、移除了Java Mission Control，从JDK中移除之后，需要自己单独下载
 *
 * 8、移除了这些Root Certificates ：Baltimore Cybertrust Code Signing CA，SECOM ，AOL and Swisscom
 *
 * 废弃项
 * 1、-XX+AggressiveOpts选项
 *
 * 2、-XX:+UnlockCommercialFeatures
 *
 * 3、-XX:+LogCommercialFeatures选项也不再需要
 * @author： tks
 * @date： 2023/3/18
 */
public class Demo3 {
}
