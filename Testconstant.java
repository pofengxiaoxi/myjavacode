/**测试常量
 *
 */


public class Testconstant {

    public static void main(String[] args){
        int age = 18;
        final String NAME = "gaoqi";//加了final修饰后，name也变成常量了，无法被修改。叫符号常量，规范大写

        final double PI = 3.14;
        double r = 4;
        double area = PI*r*8;
        double cire = 2*PI*r;
        //PI = 2;报错，已经无法被修改
        System.out.println("area = " + area);
        System.out.println("cire = " + cire);
    }
}
