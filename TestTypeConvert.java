/**
 * 测试类型转化
 *
 */
public class TestTypeConvert {
    public static void main(String[] srgs){
        //自动转化
        int a = 324;
        long b = a;
        double d = b;//
        //a = b;long 比int表示范围大，所以不能转
        //long e = 3.23F;
        float f = 234324L;//float类型表示范围比long类型大得多

        //特例
        byte b3 = 123;//整型常量默认为int型，但123未超出byte型的表示范围，所以可以

        //强制类型转化
        double x = 3.14;
        int nx = (int)x;//值为3
        char c ='a';
        int z = c+1;
        System.out.println(nx);
        System.out.println(z);
        System.out.println((char)z);

    }
}
