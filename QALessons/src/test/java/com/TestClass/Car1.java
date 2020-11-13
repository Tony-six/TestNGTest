package com.TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @ Author Tony
 * @ProjectName: junitDemoTest
 * @Package: com.TestClass
 * @ClassName: Car1
 * @Description:
 * @Date: 11/12/2020 10:29 AM
 */


public class Car1 {

//    BeforeMethod方法在添加了group 后失效
//    解决方法如下：把BeforeMethod 也添加到group 中或者在后面添加（alwaysRun=true）
//    @BeforeMethod(groups = {"driver"})

    @BeforeMethod(alwaysRun = true)
    public void Condtion() {
        System.out.println("Driver haven't been fired.");
    }
    @AfterMethod(alwaysRun = true)
    public void Result() {
        System.out.println("Then the driver have been fired,hahahha!");
        System.out.println(
                "======================================================"
        );
    }

    @Test(groups = {"driver"})//定义该方法属于driver组
    public void driverWork() {
        System.out.println("car1's driver is driving");
    }

    @Test(groups = {"boss", "driver"})//定义该方法属于boss组
    public void bossWork() {
        System.out.println("car1's boss is talking with driver!");
    }

    @Test(groups = {"boss"})//定义该方法属于boss组
    public void bossLife() {
        System.out.println("car1's boss is relax in his house");
    }

    @Test(groups = {"boss"})//定义该方法属于boss组
    public void bossRun() {
        System.out.println("car1's boss is running");
    }
}