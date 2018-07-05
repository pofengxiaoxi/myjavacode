/**
 * 测试关系运算符
 *
 *
 */
public class TestOperator02 {
    public static void main(String[] args){
        int a = 3;
        System.out.println(a==3);
        System.out.println(a!=3);
        System.out.println(a<5);
        System.out.println();

        char b = 'a';
        char b2 = 'c';
        System.out.println(b);
        System.out.println((int)b);//强制转换
        System.out.println(0+b);//有int型自动转为int型
        System.out.println(0+b2);
        System.out.println(b<b2);//char也可以用来比较
    }

}
