package com.TestClass;

import org.junit.Test;

/**
 * @ Author Tony
 * @ProjectName: junitDemoTest
 * @Package: com.TestClass
 * @ClassName: BuyTest
 * @Description:
 * @Date: 11/11/2020 3:26 PM
 */
public class BuyTest extends BaseTest {
    @Test
    public void Buy() {
        if (dataMap.get("login").equals("登陆成功")) {
            System.out.println("登录成功，可以购物！");
        } else {
            System.out.println("请先登录再购物，谢谢！");
        }
    }
}
