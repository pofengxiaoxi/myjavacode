/**
 * 测试常见类型转化溢出问题
 */
public class TestTypeConverError {
    public static void main(String[] args){
        int money = 1000000000;//10亿
        int years = 20;
        //返回的total是负数，超过了int的范围
        int total = money*years;
        System.out.println("tstal="+total);
        //返回的total任然是负数，默认是int,因此结果会转成int值，再转成long，但是已经发生了数据丢失
        long total1 = money*years;
        System.out.println("total="+total);
        //只有将一个因子转成long，结果就会自动转为long型。返回正确
        long total2 = money*((long)years);
        System.out.println("total2="+total2);

        //为了防止溢出，可以把一个常量搞成long型，就是在后面加L
        long total3 = 34L*2161*years*565;
        System.out.println(total3);

        //命名问题
        int l =2;//分不清是L还是1.
        long a = 21455L;//建议大写
    }
}
