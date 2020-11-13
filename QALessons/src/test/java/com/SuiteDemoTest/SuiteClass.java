package com.SuiteDemoTest;

import com.TestClass.BuyTest;
import com.TestClass.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @ Author Tony
 * @ProjectName: junitDemoTest
 * @Package: com.SuiteDemoTest
 * @ClassName: SuiteClass
 * @Description:
 * @Date: 11/11/2020 3:23 PM
 */
@RunWith(Suite.class)
@Suite.SuiteClasses
        ({LoginTest.class, BuyTest.class})


public class SuiteClass {
}
