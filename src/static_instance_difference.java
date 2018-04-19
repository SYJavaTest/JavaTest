/**
 * Created by uccc on 2018/4/17.
 * 作用：静态变量和实例变量的区别
 * 1.无论创建多少个实例对象， 永远都只分配了一个 静态staticInt 变量
 * 2.每创建一个实例对象，就会分配一个 实例变量random
 */
public class static_instance_difference {
    private static int staticInt=2;
    private int instanceInt=2;
    public static_instance_difference(){
        staticInt++;
        instanceInt++;
        System.out.println("静态变量值："+staticInt+"\n"+"实例变量的值："+instanceInt);
    }
    public static void main(String[] args){
        static_instance_difference difference= new static_instance_difference();
        static_instance_difference difference1= new static_instance_difference();
    }

}
