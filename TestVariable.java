/**测试变量
 * 作者徐乐乐
 *
 */



public class TestVariable {

    int a;              //成员变量，会自行初始化，当然也可以手动赋值
    static int sizi;   //静态变量，从属于类
    public static void main(String[] args){
        {
            int age;
            age = 18;//局部变量，从属于语句块；
        }
        int salary = 3000;//局部变量，从属于方法
        //变量需要声明且赋值再能被使用
        int gao = 13;
        System.out.print(gao);
    }
}
