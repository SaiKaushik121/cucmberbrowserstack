package com.browserstack;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalTest extends BrowserStackRemoteTest {

    @Test
    public void test() throws Exception {
        driver.get("http://bs-local.com:45691/check");

        AssertJUnit.assertTrue(driver.getPageSource().contains("Up and running"));
    }
}
