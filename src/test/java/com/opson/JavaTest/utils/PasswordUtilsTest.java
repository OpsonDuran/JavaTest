package com.opson.JavaTest.utils;

import org.junit.Assert;
import org.junit.Test;

public class PasswordUtilsTest {
    @Test
    public void password_only_numbers(){
       Assert.assertEquals(PasswordUtils.SecurityLevel.WEAK,PasswordUtils.assessPassword("1234567"));
    }

    @Test
    public void password_only_letters(){
        Assert.assertEquals(PasswordUtils.SecurityLevel.WEAK,PasswordUtils.assessPassword("abcdefg"));
    }

    @Test
    public void password_with_letters_and_numbers(){
        Assert.assertEquals(PasswordUtils.SecurityLevel.MEDIUM,PasswordUtils.assessPassword("abcd1234567"));
    }

    @Test
    public void  password_with_letters_numbers_and_characters(){
        Assert.assertEquals(PasswordUtils.SecurityLevel.STRONG,PasswordUtils.assessPassword("8972jKop*jne"));
    }

}
