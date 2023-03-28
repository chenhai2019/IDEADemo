package com.cbh.com;

/**
 * ClassName:VariableTest1
 * Package:com.cbh.com
 * Description:测试整形和浮点型变量的使用
 *
 * @Author:cbh
 * @Create: 2023/3/28 - 21:48
 * @Version: v1.0
 */
public class VariableTest1 {
    public static void main(String[] args){
        //1.测试整形变量的使用
        //byte(1字节=8bit) \ short(2字节) \ int(4字节) \ long(8字节)
        byte b1 = 12;
        byte b2 = 127;
        //编译不通过。因为超出了byte的存储范围
        //byte b3 = 128;

        short s1 = 1234;
        int i1 = 123234123;

        long l1 = 123123123L;
        long l2 = 45678945613L;

        double d1 = 12.3;
        float f1 = 12.3F;
        float f11 = 12.3f;
        System.out.println("f1 = "+ f1);

        System.out.println(0.1 + 0.2);

        //高精度要用BigDecimal替换
        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println(ff1);
        System.out.println(ff2);
        System.out.println(ff1 == ff2);



    }
}
