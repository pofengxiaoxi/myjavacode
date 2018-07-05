
/**
 *测试位运算符
 *
 *
 */
public class TestOperator04 {
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        System.out.println(a&b);//和int 型组合就变成位运算符
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

        //移位
        int c = 12>>1;
        System.out.println(c);
    }

}
