/**
 *测试逻辑运算符
 *
 *
 *
 */
public class TestOperator03 {
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2);
        System.out.println(b1|b2);
        System.out.println(b1^b2);
        System.out.println(!b2);

        //短路
        //int c = 3/0;
        boolean b3 = 1>2&2<(3/0);//异常
        boolean b4 = 1>2&&2<(3/0);//短路与，第一个操作输的值为false，则不需要再计算后面的操作数
        //boolean b4 = 1>2&&2<(3/0);不能定义了

    }

}
