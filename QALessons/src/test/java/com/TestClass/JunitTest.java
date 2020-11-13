package com.TestClass;

import org.junit.*;

/**
 * @ Author Tony
 * @ProjectName: junitDemoTest
 * @Package: com
 * @ClassName: JunitTest
 * @Description: JunitTest
 * @Date: 11/11/2020 2:45 PM
 */
public class JunitTest {
    /**
     * @Ater    注解在非静态方法上
     * @Before  注解在非静态方法上
     * @BeforeClass 注解在静态方法上
     * @AfterClass 注解在静态方法上
     */

    @BeforeClass
    public  static void BeforeClass() {
        System.out.println("Before class Begin:i have something to BB");
    }
    @AfterClass
    public static void AfterClass() {
        System.out.println(" After class Begin:i have something to BB");
    }
    @After//运行在每个测试类之前
    public  void After() {
        System.out.println("一个测试类运行结束了");
    }
    @Before
    public  void Before() {
        System.out.println("一个测试类要开始运行了");
    }

    @Ignore("这个类还没准备好")
    @Test
    public void T1() {
        System.out.println("fun test1");
    }

    @Test
    public void T2() {
        System.out.println("fun test2");
    }

    @Test
    public void T3() {
        System.out.println("fun test3");
    }

    @Test
    public void T4() {
        System.out.println("fun test4");
    }

    @Test
    public void T5() {
        System.out.println("fun test5");
    }

}
