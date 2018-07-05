/**
 * 测试字符类型和布尔类型
 *
 *
 */

public class TestPrimitiveDateType3 {
    public static void main(String[] args){
        char a = 'T';
        char b = '尚';
        char c = '\u0061';//通过Unicode编码能找到所有的字符
        System.out.println(c);



        //转义字符
        System.out.println('a'+'b');//遇到加号char类型自动转为数字
        System.out.println(""+'a'+'\n'+'b');//前面加空字符串，加号就变为字符串连接符
        System.out.println(""+'a'+'\t'+'b');//\t表示制表符
        System.out.println(2);
        System.out.println(a);
        System.out.println(""+'a'+'\''+'b');//a'b

        //String就是字符序列
        String d = "abc";

        //测试布尔类型
        Boolean man = true;

        if(man){    //不推荐：man==true
            System.out.println("男性");
        }

    }
}
