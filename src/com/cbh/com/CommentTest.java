package com.cbh.com;

/**
 * ClassName:CommentTest
 * Package:com.cbh.com
 * Description:
 * 这是多行注释
 * 我们可以声明多行注释的信息
 * 1.Java中的注释的种类：
 * 单行注释、多行注释、文档注释（Java特有）
 * 2.单行注释、多行注释的作用：
 *   2.1对程序中的代码进行解释和说明
 *   2.2对程序进行调试
 *
 * 3.注意：
 *  3.1单行注释和多行注释中声明的信息，不参与编译，换句话说，编译以后声明的字节码文件中不包含单行注释和多行注释
 *  中的信息
 *  3.2多行注释不能嵌套使用
 *
 * 4.文档注释
 * 文档注释内容可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档
 *
 * @Author:cbh
 * @Create: 2023/3/27 - 16:03
 * @Version: v1.0
 */
public class CommentTest {
    /**
     *这是main()方法。格式是固定的。（文档注释）
     */
    /**
    *这是main()方法.格式是固定的。（多行注释）
     */
    public static void main(String[] args) {
        //这是输出语句
        System.out.println("hello world！！");
        System.out.println("hello world！！");
    }
}
