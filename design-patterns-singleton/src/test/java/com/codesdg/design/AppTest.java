package com.codesdg.design;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.HashSet;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    /**
     * todo 线程安全
     */
    public void test_Singleton1() {

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton1 singleton1 = Singleton1.getInstance();
                System.out.println(singleton1);
            }).start();
        }
    }

    /**
     * todo 线程不安全
     */

    public void test_Singleton2() {
        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton2 instance = Singleton2.getInstance();
                strings.add(instance.toString());
            }).start();
        }
        System.out.println(strings.size());
    }

    /**
     * todo 线程安全
     */
    public void test_Singleton3() {

        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton3 instance = Singleton3.getInstance();
                strings.add(instance.toString());
            }).start();
        }
        System.out.println(strings.size());
    }

    /**
     * todo 线程安全
     */
    public void test_Singleton4() {

        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton4 instance = Singleton4.getInstance();
                strings.add(instance.toString());
            }).start();
        }
        System.out.println(strings.size());
    }

    /**
     * todo 线程安全
     */
    public void test_Singleton5() {

        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton5 instance = Singleton5.getInstance();
                strings.add(instance.toString());
            }).start();
        }
        System.out.println(strings.size());
    }

    /**
     * todo 线程安全
     * java并发库提供了了很多原⼦子类来⽀支持并发访问的数据安全性； AtomicInteger 、 AtomicBoolean 、 AtomicLong 、 AtomicReference 。
     * AtomicReference 可以封装引⽤用⼀一个V实例例，⽀支持并发访问如上的单例例⽅方式就是使⽤用了了这样的⼀一个特点
     * 使⽤用CAS的好处就是不不需要使⽤用传统的加锁⽅方式保证线程安全，⽽而是依赖于CAS的忙等算法，依赖于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了了额外的开销，并且可以⽀支持较⼤大的并发性。
     * 当然CAS也有⼀一个缺点就是忙等，如果⼀一直没有获取到将会处于死循环中。
     */
    public void test_Singleton6() {

        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton6 instance = Singleton6.getInstance();
                strings.add(instance.toString());
            }).start();
        }
        System.out.println(strings.size());
    }
}
