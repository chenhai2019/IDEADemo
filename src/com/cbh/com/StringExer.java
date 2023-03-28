package com.cbh.com;

/**
 * ClassName:StringExer
 * Package:com.cbh.com
 * Description:要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等。
 *
 * @Author:cbh
 * @Create: 2023/3/28 - 23:02
 * @Version: v1.0
 */
public class StringExer {
    public static void main(String[] args){
        String name = "陈大大";
        int age = 24;
        char gender = '男';
        double weight = 140.5;
        boolean isMarried = false;
        String phoneNumber = "15195951234";

        String info = "name = " + name + ",age = " + age + ",gender = "
                +gender + ",weight = " + weight + ",isMarried = " + isMarried + ",phoneNumber = " + phoneNumber;
        System.out.println(info);
    }
}
