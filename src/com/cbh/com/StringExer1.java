package com.cbh.com;

/**
 * ClassName:StringExer1
 * Package:com.cbh.com
 * Description:
 *
 * @Author:cbh
 * @Create: 2023/3/28 - 23:08
 * @Version: v1.0
 */
public class StringExer1 {
    public static void main(String[] args){
        //    String str1 = 4;
        String str2 = 3.5f + "";//
        System.out.println(str2);//3.5
        System.out.println(3+4+"Hello!");//7Hello!
        System.out.println("Hello!"+3+4);//Hello!34
        System.out.println('a'+1+"Hello!");//98Hello!
        System.out.println("Hello!"+'a'+1);//Hello!a1

        System.out.println("*    *");//*    *
        System.out.println("*\t*");//*  *
        System.out.println("*" + "\t" + "*");//*  *
        System.out.println('*' + "\t" + "*");//*    *
        System.out.println('*' + '\t' + "*");//xx*
        System.out.println('*' + "\t" + '*');//*    *
        System.out.println("*" + '\t' + '*');//*    *
        System.out.println('*' + '\t' + '*');//xxx

    }


}
