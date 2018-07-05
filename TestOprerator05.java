/**
 * 测试字符串运算符
 *
 */
public class TestOprerator05 {
    public static void main(String[] args){
        String a = "3";
        int b = 4;
        int c = 5;
        char d ='a';
        System.out.println(a+b);//加号两边只要有一个字符串，就变成了字符串连接符
        System.out.println(a+c);

        System.out.println(a+b+c);//a+b得字符串，后面还是字符串
        System.out.println(b+c+a);//b+c得数字，再链接字符串

        System.out.println(d+4);//97+4=101
    }

}
