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

    @Test
    public void test_fib_0_equals_0(){
        Fib fib = new Fib();

        int x = fib.DoFib(0);


        //Assert.assertEquals(fib,null);
        Assert.assertEquals(x,0);
    }


    @Test
    public void test_fib_1_equals_1(){
        Fib fib = new Fib();

        int x = fib.DoFib(1);


        //Assert.assertEquals(fib,null);
        Assert.assertEquals(x,1);
    }

    @Test
    public void test_fib_2_equals_1(){
        Fib fib = new Fib();

        int x = fib.DoFib(2);


        //Assert.assertEquals(fib,null);
        Assert.assertEquals(x,1);
    }

    @Test
    public void test_fib_3_equals_2(){
        Fib fib = new Fib();

        int x = fib.DoFib(3);


        //Assert.assertEquals(fib,null);
        Assert.assertEquals(x,2);
    }

    @Test
    public void test_fib_4_equals_3(){
        Fib fib = new Fib();

        int x = fib.DoFib(4);


        //Assert.assertEquals(fib,null);
        Assert.assertEquals(x,3);
    }

    @Test
    public void test_fib_5_equals_5(){
        Fib fib = new Fib();

        int x = fib.DoFib(5);


        //Assert.assertEquals(fib,null);
        Assert.assertEquals(x,5);
    }

    @Test
    public void test_fib_6_equals_8(){
        Fib fib = new Fib();

        int x = fib.DoFib(6);


        //Assert.assertEquals(fib,null);
        Assert.assertEquals(x,8);
    }

}

