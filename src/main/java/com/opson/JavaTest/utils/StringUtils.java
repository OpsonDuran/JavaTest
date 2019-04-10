package com.opson.JavaTest.utils;

public class StringUtils {

    public static String repeat(String str,int times){

        if(times<0)
            throw new IllegalArgumentException("negative times not allowed");
        String result="";
        for (int i = 0; i < times; i++) {
            result+=str;
        }
        return result;
    }

    public static boolean isEmpty(String str){
        return str ==null || str.isEmpty();
    }

}

