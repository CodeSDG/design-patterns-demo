package com.codesdg.design;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void test_DBFactory()
    {
        DBFactory dbFactory = new MySQLFactory();
        dbFactory.createConnection().connect();

        dbFactory.createStatement().statement();

        dbFactory = new OracleFactory();
        dbFactory.createConnection().connect();
        dbFactory.createStatement().statement();
    }
}
