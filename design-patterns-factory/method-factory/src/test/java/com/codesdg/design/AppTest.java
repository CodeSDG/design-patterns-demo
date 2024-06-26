package com.codesdg.design;

import com.codesdg.design.demo1.DatabaseLogFactory;
import com.codesdg.design.demo1.FileLogFactory;
import com.codesdg.design.demo1.LogFactory;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void test_LogFactory()
    {
        LogFactory logFactory = new DatabaseLogFactory();
        logFactory.createLog().writeLog();
        logFactory = new FileLogFactory();
        logFactory.createLog().writeLog();
    }
}
