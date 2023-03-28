package com.cbh.com;

/**
 * ClassName:VariableTest4
 * Package:com.cbh.com
 * Description:此java用来测试强制转换类型
 *
 * @Author:cbh
 * @Create: 2023/3/28 - 22:40
 * @Version: v1.0
 */
public class VariableTest4 {
    public static void main(String[] args){
        double d1 = 12;
//        int i1 = d1;
        int i2 = (int)d1;
        System.out.println(i2);

        long l1 = 123;
        short s1 = 11;
        short s2 = (short)l1;
        System.out.println(s2);

        int i3 = 12;
        float f1 = i3;
        System.out.println(f1);//12.0

        float f2 = (float)i3;

        double d2 = 12.9;
        int i4 = (int)d2;
        System.out.println(i4);//截断

        int i5 = 128;
        byte b1 = (byte)i5;
        System.out.println(b1);

        byte b2 = 12;
        method(b2);

    }

    public static void method(int num){
        System.out.println("num = " + num);
    }
}
