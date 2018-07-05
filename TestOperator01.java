/**
 * 测试运算符
 *
 *
 */


public class TestOperator01 {
    public static void main(String[] args){
/*
        byte a = 1;
        int b = 2;
        long b2 = 3;
        //byte c = a+b;报错，有int变int
        //int c2 = b2 + b;报错，有long变long

        float f1 = 3.14F;
        double d = b+b2;
        float e = b2;//

        //测试自增自减
        //float d2 = f1 + 6.2;报错？？？有疑问

        System.out.println(9%5);//符号和左边的数相同
        System.out.println(9%-5);
        System.out.println(-9%5);
*/
        /*
        //测试自增自减
        int a = 3;
        int b = a++;//执行完后，b=3,先给b赋值，在自增
        System.out.println("a="+a+"\nb="+b);
        */

        int a = 3;
        int b = 4;
        a+=b;//相当于a=a+b
        a=3;
        a*=b+3;//相当于a=a*(b+3)
        System.out.println("a="+a);






    }
}
