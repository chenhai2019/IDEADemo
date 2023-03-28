/**
 * ClassName:VariableTest2
 * Package:PACKAGE_NAME
 * Description:测试字符类型和布尔类型的使用
 *
 * @Author:cbh
 * @Create: 2023/3/28 - 22:12
 * @Version: v1.0
 */
public class VariableTest2 {
    public static void main(String[] args)
    {
        //1.字符类型：char(2字节)
        //表示形式1：使用一对''表示，内部有且仅有一个字符
        char c1 = 'a';
        char c2 = '中';
        char c3 = '1';
        char c4 = '%';
        char c5 = 'γ';

        //char c6 = '';
        //char c7 = 'ab';

        char c8 = '\u0036';
        System.out.println(c8);

        char c9 = '\n';
        char c10 = '\t';
        System.out.println("hello" + c10 +"world");

        char c11 = 97;
        System.out.println(c11);//a

        char c12 = '1';
        char c13 = 1;

        boolean bo1 = true;
        boolean bo2 = false;

        //boolean bo3 = 0;

        boolean isMarried = true;
        if(isMarried){
            System.out.println("很遗憾，不能参加单身派对了");
        }
        else {
            System.out.println("可以参加单身派对");
        }
    }
}
