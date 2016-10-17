package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/10/17.
 *
 * 7. Reverse Integer
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class Reverse {
    public int reverse(int x){
        if(x==Integer.MIN_VALUE||x==Integer.MAX_VALUE)
            return 0;
        int a=Math.abs(x);
        StringBuilder b=new StringBuilder(a+"");
        StringBuilder temp=new StringBuilder();
        for (int i = b.length()-1; i >= 0; i--) {
            temp.append(b.charAt(i));
        }
        long c=Long.parseLong(temp.toString());
        if (x<0){
            c=-c;
        }
        return (int)c;
    }
}
