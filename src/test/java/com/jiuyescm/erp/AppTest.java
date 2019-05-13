package com.jiuyescm.erp;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * 进行单元字符串的测试
     */
    @Test
    public void testString() {
        String str = "  ";
        if (StringUtils.isNotBlank(str)) {
            System.out.println("不为空");
        } else {
            System.out.println("为空");
        }
    }
}
