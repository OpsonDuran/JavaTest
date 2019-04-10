package com.opson.JavaTest.utils;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void repeatMultipleTimesTest() {

        Assert.assertEquals("holaholahola",StringUtils.repeat("hola",3));
    }

    @Test
    public void repeatOneTest(){

        Assert.assertEquals("hola",StringUtils.repeat("hola",1));
    }

    @Test
    public void repeatZeroTimesTest(){
        Assert.assertEquals("",StringUtils.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeatNegativeTimesTest(){
        StringUtils.repeat("hola",-1);
    }

    @Test
    public void in_case_null(){
        Assert.assertEquals(true,StringUtils.isEmpty(null));
    }

    @Test
    public void in_case_not_null(){
        Assert.assertEquals(false,StringUtils.isEmpty("Hola"));
    }

    @Test
    public void in_case_empty(){
        Assert.assertEquals(true,StringUtils.isEmpty(""));
    }
}