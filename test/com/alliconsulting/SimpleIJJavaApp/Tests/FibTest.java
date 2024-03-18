package com.alliconsulting.SimpleIJJavaApp.Tests;

import com.alliconsulting.SimpleIJJavaApp.Fib;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibTest {
    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_fib_class(){
        Fib fib = new Fib();

        //Assert.assertEquals(fib,null);
        Assert.assertTrue(fib!=null);
    }
}

