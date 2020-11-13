package com.TestClass;

import org.junit.Test;

/**
 * @ Author Tony
 * @ProjectName: junitDemoTest
 * @Package: com.TestClass
 * @ClassName: LoginTest
 * @Description:
 * @Date: 11/11/2020 3:26 PM
 */
public class LoginTest extends BaseTest {
    @Test
    public void login() {
        dataMap.put("login", "登录成功");
        System.out.println(dataMap.get("login"));
    }
}
