package com.cbh.com;

/**
 * ClassName:VariableTest3
 * Package:com.cbh.com
 * Description:测试基本数据类型变量间的运算规则
 *
 * @Author:cbh
 * @Create: 2023/3/28 - 22:27
 * @Version: v1.0
 */
public class VariableTest3 {
    public static void main(String[]  args){
        int i1 = 10;
        int i2 = i1;

        long l1 = i1;

        float f1 = i1;

        byte b1 = 12;
        int  i3 = b1 + i1;

        //byte b2 = b1 + i1;

        byte b3 = 12;
        short s1 = 10;
        //short s2 = b3 + s1;
        i3 = b3 + s1;

        byte b4 = 10;
//        byte b5 = b3 + b4;

        char c1 = 'a';
        //char c2 = c1 + b3;
        int i4 = c1+b3;

        long l2 = 123L;
        long l3 = 123;

//        long l4 = 123123123123;
        long l5 = 123123123123L;
        long l51 = 123123123123L;

        float f2 = 12.3F;
//        float f3 = 12.3;

        byte b5 = 10;
        //byte b6 = b5 + 1;
        int ii1 = b5 + 1;
        double dd1 = b5 + 12.3;

//        int 123L = 12;
        long l6 = 123L;

    }
}
